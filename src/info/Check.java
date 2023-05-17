package info;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.json.simple.JSONArray;

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class Check {

    public static String getQuestion() throws IOException, InterruptedException, URISyntaxException {

        URI url = new URI("http://jservice.io/api/random");
        String json = null;
        try {
            HttpRequest request = HttpRequest.newBuilder().uri(url).GET().build();
            HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
            json = response.body();

        } catch (IOException | InterruptedException e) {

            e.getMessage();

        }
        System.out.println();
        return json;
    }

    public static void main(String[] args) throws IOException, URISyntaxException, InterruptedException {
        String answer = getQuestion();

        Type itemsListType = new TypeToken<List<Check2>>() {}.getType();
        Gson gson = new Gson();
        List<Check2> list = gson.fromJson(answer, itemsListType);
        System.out.println(answer);
        System.out.println(list);

    }
}
