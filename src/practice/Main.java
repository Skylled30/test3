package practice;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        String uri = "https://api.openweathermap.org/data/2.5/weather?q=Moscow&appid=cccf006b67c53e10fb5a4d501d49c392";
        HttpRequest request = HttpRequest.newBuilder().uri(new URI(uri)).GET().build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();

        Gson gson = new Gson();
        OpenWeatherMap openWeatherMap = gson.fromJson(json, OpenWeatherMap.class);

//        System.out.println(openWeatherMap.weather);

        for (int i = 0; i < openWeatherMap.weather.size(); i++) {
            System.out.println(openWeatherMap.weather.get(i));
        }
    }
}
