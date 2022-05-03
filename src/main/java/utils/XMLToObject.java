package utils;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import model.FiltersModel;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class XMLToObject {


    public static FiltersModel deserializeFromXML() {

        FiltersModel deserializedData = null;

        try {
            XmlMapper xmlMapper = new XmlMapper();

            String readContent = new String(Files.readAllBytes(Paths.get("src/main/resources/filter.xml")));
            deserializedData = xmlMapper.readValue(readContent, FiltersModel.class);


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            return deserializedData;
        }
    }

}