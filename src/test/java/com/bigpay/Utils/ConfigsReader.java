package com.bigpay.Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigsReader {

    public static Properties prop;

    /**
     * @param key
     * @return value
     */
    public static String getProperty(String key) {

        prop=new Properties();

        return prop.getProperty(key);
    }
}
