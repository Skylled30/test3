package info;

import com.google.gson.Gson;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Test3 {
    public static void main(String[] args) throws java.net.URISyntaxException, IOException, InterruptedException, ParseException {
        String uri = "https://api.openweathermap.org/data/2.5/weather?q=Moscow&appid=cccf006b67c53e10fb5a4d501d49c392";
        HttpRequest request = HttpRequest.newBuilder().uri(new URI(uri)).GET().build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();

        System.out.println(json);
        Gson g = new Gson();
        OpenWeatherMap openWeatherMap = g.fromJson(json, OpenWeatherMap.class);

        System.out.println(openWeatherMap.main.temp);
//        JSONParser parser = new JSONParser();
//        JSONObject json2 = (JSONObject) parser.parse(json);
//
//        JSONArray jsonArray = (JSONArray) json2.get("weather");
//
//        for (int i = 0; i < jsonArray.size(); i++) {
//            JSONObject json3 = (JSONObject) jsonArray.get(0);
//            System.out.println(json3.get("icon"));
//            System.out.println(json3.get("description"));
//            System.out.println(json3.get("main"));
//            System.out.println(json3.get("id"));
//        }
    }
}
