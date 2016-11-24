package org.seasonteam.season.util;

import java.util.UUID;

/**
 * 基础工具类
 *
 * @author yust
 *         2016-11-24
 */
public class BaseUtil {

    /**
     * 生成UUID
     *
     * @return UUID
     */
    public static String genUUID() {
        String uuid = UUID.randomUUID().toString();
        return uuid.replaceAll("-", "");
    }
}
