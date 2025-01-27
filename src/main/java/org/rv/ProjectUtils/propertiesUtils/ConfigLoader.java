package org.rv.ProjectUtils.propertiesUtils;

import org.rv.ProjectUtils.EnvironmentHandler;

import java.util.Properties;

public class ConfigLoader {
    private final String environment;

    public ConfigLoader() {
        this.environment = new EnvironmentHandler().getEnvironment();
    }

    public Properties loadConfig() {
        PropertiesLoader loader = new PropertiesLoader();
        String configFile = String.format("src/main/resources/%s-config.properties", environment);
        System.out.println(configFile);
        return loader.loadFile(configFile);
    }
}