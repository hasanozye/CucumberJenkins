package readers;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

    String filePath;
    Properties prop = new Properties();
    FileReader fileReader;

    public static PropertyReader read() {
        return read("config");
    }

    public static PropertyReader read(String fileName) {
        return new PropertyReader(fileName);
    }

    public String getProperty(String key) {
        return this.prop.getProperty(key);
    }

    public PropertyReader(String fileName) {

        try {
            this.filePath = "src/test/resources/datafiles/" + fileName + ".properties";
            fileReader = new FileReader(filePath);
            prop.load(fileReader);
        } catch (IOException e) {
            throw new ConfigurationLoadException("Failed to load properties from file: " + filePath, e);
        }

    }

}

class ConfigurationLoadException extends RuntimeException {

    public ConfigurationLoadException(String message, Throwable cause) {
        super(message, cause);
    }

}
