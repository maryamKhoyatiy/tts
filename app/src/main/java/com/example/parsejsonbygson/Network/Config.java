package com.example.parsejsonbygson.Network;

/**
 * Config file
 */

public class Config {
    private static String URL="http://project08.sasit.sa/testing/October/";

    public static String getURL() {
        return URL;
    }

    public static void setURL(String URL) {
        Config.URL = URL;
    }
}
