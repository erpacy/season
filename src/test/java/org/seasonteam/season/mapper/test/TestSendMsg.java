package org.seasonteam.season.mapper.test;

import org.junit.Test;
import org.seasonteam.season.util.SmsUtil;

/**
 * acyyu
 * <p>
 * 2017-01-13
 */
public class TestSendMsg {
    @Test
    public void testSendCode() {
        boolean res = SmsUtil.sendCode("18201546752", "3322");
        System.out.println(res);
    }
}
