package com.bddframework.config;

import java.util.Properties;

public class ConfigFileReader {

    String reportConfigPath="C:/Users/HP/IdeaProjects/Selenium/src/test/java/com/bddframework/config/extent-config.xml";

    public String getReportConfigPath(){
        Properties properties = new Properties();
        String reportConfigPath = properties.getProperty("reportConfigPath");
        if(reportConfigPath!= null) return reportConfigPath;
        else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");
    }
}
