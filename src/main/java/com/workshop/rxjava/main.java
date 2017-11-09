package com.workshop.rxjava;

import com.workshop.rxjava.weather.controller.WeatherStation;
import com.workshop.rxjava.weather.model.WeatherCondition;

public class main {
    public static void main(String [] args) throws InterruptedException {
        WeatherStation controller = new WeatherStation();

        WeatherCondition condition1 = controller.getCombinedWeatherReport("Weert");

        System.out.println("------- Result Sync ------");
        System.out.println("MultiWeather report for Weert:");
        System.out.println(condition1);
        System.out.println("------- Result Sync ------\n");

        WeatherCondition condition2 = controller.getCombinedWeatherReportAsync("Weert");

        System.out.println("------- Result Async ------");
        System.out.println("Weather report for Weert:");
        System.out.println(condition2);
        System.out.println("------- Result Async ------\n");
    }
}
