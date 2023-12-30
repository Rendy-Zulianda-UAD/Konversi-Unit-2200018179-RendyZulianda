// File: implementasi/SuhuImplementasi.java
package implementasi;

import konverter.Suhu;

public class SuhuImplementasi implements Suhu {
    @Override
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    @Override
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    @Override
    public double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    @Override
    public double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }
}