package practice;

import java.util.ArrayList;

public class OpenWeatherMap {
    Coord coord;
    ArrayList<Weather> weather;
    String base;
}

class Coord {
    double lon;
    double lat;
}

class Weather {
    int id;
    String main;
    String description;
    String icon;

    @Override
    public String toString() {
        return "Weather{" +
                "id=" + id +
                ", main='" + main + '\'' +
                ", description='" + description + '\'' +
                ", icon='" + icon + '\'' +
                '}';
    }
}






