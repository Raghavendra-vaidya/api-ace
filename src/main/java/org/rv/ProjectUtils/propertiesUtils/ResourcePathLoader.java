package org.rv.ProjectUtils.propertiesUtils;

import java.util.Properties;

public class ResourcePathLoader {
    public String users;
    public String login;
    public String register;

    PropertiesLoader propertiesLoader;

    public ResourcePathLoader() {
       Properties resourceProps =  propertiesLoader.loadFile("src/main/resources/resourcePaths.properties");
       this.users = resourceProps.getProperty("USERS");
       this.register = resourceProps.getProperty("REGISTER");
       this.login = resourceProps.getProperty("LOGIN");
    }
}
