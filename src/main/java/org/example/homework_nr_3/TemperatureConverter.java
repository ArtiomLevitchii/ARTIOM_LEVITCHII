package org.example.homework_nr_3;

public class TemperatureConverter {

    double toCelsius(double temperature){
        return (temperature-32)/1.8;
    }

    double toFahrenheit(double temperature){
        return (temperature*1.8)+32;
    }
    public static void main(String[] args) {
        TemperatureConverter convertMe = new TemperatureConverter();
        System.out.println(convertMe.toCelsius(50)+"C");
        System.out.println(convertMe.toFahrenheit(10)+"F");
    }
}
