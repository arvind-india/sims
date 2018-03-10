package com.sims;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public final class CommonConstant {
    public static final Locale LOCALE = Locale.ENGLISH;
    public static final ZoneId ZONE_ID_UTC = ZoneId.of("UTC");

    private static final int HOUR_DIFFERENCE = 7;
    private static final ZoneOffset ZONE_OFFSET = ZoneOffset.ofHours(HOUR_DIFFERENCE);
    private static final String MYSQL_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";

    public static final DateTimeFormatter MYSQL_DATE_TIME_FORMATTER = DateTimeFormatter
            .ofPattern(MYSQL_DATE_FORMAT, LOCALE)
            .withZone(ZONE_OFFSET);

    private CommonConstant() {

    }
}
