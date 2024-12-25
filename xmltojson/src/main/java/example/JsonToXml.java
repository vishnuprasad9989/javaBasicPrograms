package example;

import org.json.JSONObject;
import org.json.XML;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JsonToXml {
    public JsonToXml() {
        super();
    }

    public static void main(String[] args) throws IOException {

        String root="password";
        Path path = Paths.get("src/main/resources/jsonfile.json");

        String stringJson = Files.readAllLines(path).get(0);

        JSONObject json = new JSONObject(stringJson);

        System.out.println(XML.toString(json));

        System.out.println("<?xml version=\"1.0\" encoding=\"ISO-8859-15\"?>\n<"+root+">" + XML.toString(json) + "</"+root+">");

    }
}
