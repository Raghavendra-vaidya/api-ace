package org.rv.restResources;

import org.rv.ProjectUtils.propertiesUtils.ConfigLoader;
import org.rv.ProjectUtils.propertiesUtils.ResourcePathLoader;

import java.util.Properties;

public class RequestBase {
    public ResourcePathLoader resource = new ResourcePathLoader();
    public Properties config = new ConfigLoader().loadConfig();
}
