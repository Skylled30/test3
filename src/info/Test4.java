package info;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;

public class Test4 {
    public static void main(String[] args) throws ProtocolException {
        String url = "http://www.yandex.ru/";

        try {
            URL obj = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) obj.openConnection();

            connection.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            String jsonString = String.valueOf(response);
            System.out.println(jsonString);
            // тут парсим полученный запрос
//            JSONObject obj2 = (JSONObject) new JSONParser().parse(jsonString);
//            String name = (String) obj2.get("name");
//            System.out.println(name);
            System.out.println();

        } catch (Exception e){
            System.out.println(e);
        }


    }
}
