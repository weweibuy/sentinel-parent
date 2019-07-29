/*
 * All rights Reserved, Designed By baowei
 *
 * 注意：本内容仅限于内部传阅，禁止外泄以及用于其他的商业目的
 */
package com.alibaba.csp.sentinel.dashboard.repository.metric;

import com.alibaba.csp.sentinel.dashboard.datasource.entity.MetricEntity;
import com.alibaba.csp.sentinel.dashboard.domain.po.MetricData;
import com.alibaba.csp.sentinel.dashboard.domain.po.MetricDataExample;
import com.alibaba.csp.sentinel.dashboard.mapper.MetricDataMapper;
import com.alibaba.csp.sentinel.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.beans.BeanCopier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author durenhao
 * @date 2019/7/29 14:46
 **/
@Primary
@Component
public class JdbcMetricsRepository implements MetricsRepository<MetricEntity> {

    private static final BeanCopier BEAN_COPIER = BeanCopier.create(MetricEntity.class, MetricData.class, false);

    private static final BeanCopier BEAN_COPIER1 = BeanCopier.create(MetricData.class, MetricEntity.class, false);


    @Autowired
    private MetricDataMapper metricDataMapper;

    @Override
    public void save(MetricEntity metric) {

        MetricData metricData = new MetricData();
        BEAN_COPIER.copy(metric, metricData, null);
        metricData.setClientMetricTime(metric.getTimestamp());
        metricData.setProjectName(metric.getApp());
        metricData.setResourceId(metric.getResource());
        metricData.setResponseTime(metric.getRt());
        metricData.setCount(metric.getCount());
        metricData.setGetMetricTime(metric.getGmtCreate());
        metricDataMapper.insertSelective(metricData);
    }

    @Override
    public void saveAll(Iterable<MetricEntity> metrics) {
        if (metrics == null) {
            return;
        }
        metrics.forEach(this::save);
    }

    @Override
    public List<MetricEntity> queryByAppAndResourceBetween(String app, String resource, long startTime, long endTime) {
        if (StringUtil.isBlank(app)) {
            return Collections.emptyList();
        }
        MetricDataExample example = new MetricDataExample();
        example.createCriteria()
                .andProjectNameEqualTo(app)
                .andResourceIdEqualTo(resource)
                .andCreateTimeBetween(new Date(startTime), new Date(endTime));
        List<MetricData> metricDataList = metricDataMapper.selectByExample(example);
        return metricDataList.stream()
                .map(data -> {
                    MetricEntity metricEntity = new MetricEntity();
                    BEAN_COPIER1.copy(data, metricEntity, null);
                    metricEntity.setApp(data.getProjectName());
                    metricEntity.setResource(data.getResourceId());
                    metricEntity.setTimestamp(data.getClientMetricTime());
                    metricEntity.setGmtCreate(data.getGetMetricTime());
                    metricEntity.setGmtModified(data.getGetMetricTime());
                    metricEntity.setRt(data.getResponseTime());
                    return metricEntity;
                })
                .collect(Collectors.toList());
    }

    /**
     * 查询App 下的所有资源
     *
     * @param app application name
     * @return
     */
    @Override
    public List<String> listResourcesOfApp(String app) {
        if (StringUtil.isBlank(app)) {
            return Collections.emptyList();
        }

        // 获取最近1min的数据
        final long minTimeMs = System.currentTimeMillis() - 1000 * 60;
        MetricDataExample example = new MetricDataExample();
        example.createCriteria()
                .andProjectNameEqualTo(app)
                .andClientMetricTimeGreaterThanOrEqualTo(new Date(minTimeMs));
        List<MetricData> metricDataList = metricDataMapper.selectByExample(example);


        // Order by last minute b_qps DESC.
        return metricDataList
                .stream()
                .sorted((o1, o2) -> {
                    int t = o2.getBlockQps().compareTo(o1.getBlockQps());
                    if (t != 0) {
                        return t;
                    }
                    return o2.getPassQps().compareTo(o1.getPassQps());
                })
                .map(data -> data.getResourceId())
                .collect(Collectors.toList());
    }
}
