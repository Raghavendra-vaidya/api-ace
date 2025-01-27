package org.rv.ProjectUtils;

import java.util.Objects;

public class EnvironmentHandler {

    private String environment;

    public EnvironmentHandler() {
        this.environment = System.getProperty("env");
    }

    public String getEnvironment() {
        if (Objects.isNull(environment) || environment.isEmpty()) {
            environment = "qa";
        }
        System.out.println("Current environment --> " + environment);
        return environment;
    }
}
