package com.alibaba.csp.sentinel.dashboard.mapper;

import com.alibaba.csp.sentinel.dashboard.domain.po.MetricData;
import com.alibaba.csp.sentinel.dashboard.domain.po.MetricDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MetricDataMapper {
    long countByExample(MetricDataExample example);

    int deleteByExample(MetricDataExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MetricData record);

    int insertSelective(MetricData record);

    MetricData selectOneByExample(MetricDataExample example);

    List<MetricData> selectByExample(MetricDataExample example);

    MetricData selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MetricData record, @Param("example") MetricDataExample example);

    int updateByExample(@Param("record") MetricData record, @Param("example") MetricDataExample example);

    int updateByPrimaryKeySelective(MetricData record);

    int updateByPrimaryKey(MetricData record);
}