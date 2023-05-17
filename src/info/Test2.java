package info;

import jdk.swing.interop.SwingInterOpUtils;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OkHttpClient okHttpClient = new OkHttpClient();
        String url = "https://www.cbr.ru/";
        String result = "";
        Request request = new Request.Builder().url(url).build();
        try {
            Response response = okHttpClient.newCall(request).execute();
            result = response.body().string();

            System.out.println(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
