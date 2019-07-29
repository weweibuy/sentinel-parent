/*
 * All rights Reserved; Designed By baowei
 *
 * 注意：本内容仅限于内部传阅，禁止外泄以及用于其他的商业目的
 */
package com.alibaba.csp.sentinel.dashboard.controller.vo;

import lombok.Data;

/**
 * @author durenhao
 * @date 2019/7/29 17:21
 **/
@Data
public class TopResourceMetricQueryVo {

    private String app;

    private Integer pageIndex = -1;

    private Integer pageSize = 6;

    private Boolean desc = true;

    private Long startTime = System.currentTimeMillis();

    private Long endTime = startTime - 1000 * 60 * 5;

    private String searchKey;

}
