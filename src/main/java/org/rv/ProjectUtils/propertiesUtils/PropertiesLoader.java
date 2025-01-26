package org.rv.ProjectUtils.propertiesUtils;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesLoader {

    public Properties loadFile(String filePath){
        Properties properties =  new Properties();
        try(FileReader fileReader = new FileReader(filePath)) {
            properties.load(fileReader);
        }
        catch (IOException exception){
            exception.printStackTrace();
        }
        return properties;
    }
}
