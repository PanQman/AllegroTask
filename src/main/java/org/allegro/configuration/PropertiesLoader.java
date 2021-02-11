package org.allegro.configuration;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesLoader {

    public static Properties getPropertiesFromFile(String fileName) {
        InputStream inputStream = null;
        Properties properties = new Properties();

        try {
            inputStream = PropertiesLoader.class
                    .getClassLoader()
                    .getResourceAsStream(fileName);
            if (inputStream != null) {
                properties.load(inputStream);

            } else {
                throw new FileNotFoundException("File was not found: " + fileName);
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new IllegalArgumentException("Can't read file: " + fileName);

        } finally {
            try {
                inputStream.close();
            } catch (IOException e){
                e.printStackTrace();
            }
        }
        return properties;
    }
}
