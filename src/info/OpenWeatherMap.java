package info;

import java.util.ArrayList;

public class OpenWeatherMap {
    Coord coord;
    String base;
    ArrayList<Weather> weather;
    Main main;
    int visibility;
    Wind wind;
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
}

class Main {
    double temp;
    double feels_like;
    double temp_min;
    double temp_max;
    double pressure;
    double humidity;
    double sea_level;
    double grnd_level;
}

class Wind {
    double speed;
    double deg;
    double gust;
}


