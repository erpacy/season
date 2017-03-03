package org.seasonteam.season.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * acyyu
 * <p>
 * 2017-03-03
 */
public class DateUtil {

    public static final String DATE_STR = "yyyyMMddHHmmssSSS";

    public static String getCurrentTimestamp(){
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_STR);
        return simpleDateFormat.format(date);
    }

}
