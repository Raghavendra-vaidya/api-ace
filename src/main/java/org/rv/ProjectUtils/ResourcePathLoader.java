package org.rv.ProjectUtils;

import java.util.Objects;

public class ResourcePathLoader {
    String users;
    String login;
    String register;

    public ResourcePathLoader() {
        String env = System.getProperty("env");
        if (Objects.isNull(env) || env.isEmpty()){
            env = "QA";

        }
    }
}
