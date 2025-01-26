package org.rv.ProjectUtils.FileUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil {

    private static Properties loadPropFile(String filePath){
        Properties properties =  new Properties();
        try(FileInputStream fis = new FileInputStream(filePath)) {
            properties.load(fis);
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return properties;
    }

    public String getKey(String filePath, String KEY){
        Properties properties = loadPropFile(filePath);
        return properties.getProperty(KEY);
    }

}
