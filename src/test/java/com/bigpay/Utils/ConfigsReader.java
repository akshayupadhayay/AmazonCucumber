package com.bigpay.Utils;

import java.io.*;
import java.util.Properties;

public class ConfigsReader {

    public static String getUrl(String key) {

        try (InputStream input = new FileInputStream("src/test/resources/configs/config.properties")) {

            Properties prop = new Properties();

            // load a properties file
            prop.load(input);

            System.out.println(prop.getProperty("url"));
            return prop.getProperty("url");

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return "";
    }

    public static String getBrowser(String key) {

        try (InputStream input = new FileInputStream("src/test/resources/configs/config.properties")) {

            Properties prop = new Properties();

            // load a properties file
            prop.load(input);

            System.out.println(prop.getProperty("browser"));
            return prop.getProperty("browser");

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return "";
    }
}
