package org.rv.ProjectUtils.propertiesUtils;

import org.rv.ProjectUtils.EnvironmentHandler;

import java.util.Properties;

public class ConfigLoader {
    private  String environment;
    public ConfigLoader() {
       this.environment =  new EnvironmentHandler().getEnvironment();
    }

    PropertiesLoader loader;
    public Properties loadConfig(){
        loader = new PropertiesLoader();
        String configFile = String.format("src/main/resources/%s-config.properties",environment);
        return loader.loadFile(configFile);
    }
}
