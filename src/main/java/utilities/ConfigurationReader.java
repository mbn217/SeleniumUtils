package utilities;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    static String pathToPropertyFile;
    ConfigurationReader(String pathToPropertyFile) {
        this.pathToPropertyFile = pathToPropertyFile;
    }
    private static final Logger logger = LogManager.getLogger(ConfigurationReader.class);
    private static Properties configFile;

    /**
     * This static block will get loaded first into the memory with the property file
     */
    static{
        logger.info("Loading the property file...");
        try {
            FileInputStream fileInputStream = new FileInputStream(pathToPropertyFile);
            configFile = new Properties();
            configFile.load(fileInputStream);
            fileInputStream.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * This method will return the value of the key that was passed as a parameter
     * from the property file
     * @param key the key from the property file
     * @return the property of the key specified
     */
    public static String getProperty(String key){
        logger.info("Getting the property key {"+ key +"} from the property file");
        return configFile.getProperty(key);
    }


}
