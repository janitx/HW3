package utils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {

    private static Logger logger = LogManager.getLogger();

    Properties property = new Properties();

    public PropertiesReader()  {
        FileInputStream fis;
        try{
            fis = new FileInputStream("src/main/resources/config.properties");
            property.load(fis);
        } catch(IOException e) {
            logger.info("Properties file is not exit");
        }
    }

    public String getUrl(){
        String URL = property.getProperty("URL");
        return URL;
    }

}
