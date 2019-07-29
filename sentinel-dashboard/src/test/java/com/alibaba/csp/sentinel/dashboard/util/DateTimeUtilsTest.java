package com.alibaba.csp.sentinel.dashboard.util;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.Date;

@Slf4j
public class DateTimeUtilsTest {
    @Test
    public void dateToLocalDateTime() throws Exception {
        Date date = new Date();
        LocalDateTime localDateTime = DateTimeUtils.dateToLocalDateTime(date);
        Date date1 = DateTimeUtils.localDateTimeToDate(localDateTime);
        log.info("data {} ",  date);
        log.info("data1 {} ",  date1);

        String s = "";
    }

    @Test
    public void systemTimestampToLocalDateTime() throws Exception {
    }

    @Test
    public void localDateTimeToDate() throws Exception {
    }

}