package com.yog.filesextractor.utils;

import lombok.extern.slf4j.Slf4j;

/**
 *
 * @author Yougeshwar
 */
@Slf4j
public final class AppConstants {

    public static final String APP_NAME = "Files Extractor";
    private static String APP_VERSION = "-dev";
    public static final String APP_DATE = "8th July, 2023";

    protected static void setVersion(String version) {
        APP_VERSION = version;
    }

    public static String getAppVersion() {
        return APP_VERSION;
    }
}
