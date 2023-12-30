// File: aplikasi/KonverterApp.java
package aplikasi;

import implementasi.BeratImplementasi;
import implementasi.PanjangImplementasi;
import implementasi.SuhuImplementasi;
import konverter.Berat;
import konverter.Panjang;
import konverter.Suhu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class KonverterApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Contoh penggunaan konverter panjang
        Panjang panjangConverter = new PanjangImplementasi();
        double panjangInput = getInput(scanner, "Masukkan panjang dalam meter: ");
        System.out.println(panjangInput + " meter = " + panjangConverter.meterToKilometer(panjangInput) + " kilometer");
        System.out.println(panjangInput + " meter = " + panjangConverter.meterToMil(panjangInput) + " mil");
        System.out.println(panjangInput + " kilometer = " + panjangConverter.kilometerToMeter(panjangInput) + " meter");
        System.out.println(panjangInput + " mil = " + panjangConverter.milToMeter(panjangInput) + " meter");
        System.out.println(panjangInput + " kilometer = " + panjangConverter.kilometerToMil(panjangInput) + " mil");
        System.out.println(panjangInput + " mil = " + panjangConverter.milToKilometer(panjangInput) + " kilometer");

        // Contoh penggunaan konverter berat
        Berat beratConverter = new BeratImplementasi();
        double beratInput = getInput(scanner, "Masukkan berat dalam gram: ");
        System.out.println(beratInput + " gram = " + beratConverter.gramToKilogram(beratInput) + " kilogram");
        System.out.println(beratInput + " gram = " + beratConverter.gramToPound(beratInput) + " pound");
        System.out.println(beratInput + " kilogram = " + beratConverter.kilogramToGram(beratInput) + " gram");
        System.out.println(beratInput + " pound = " + beratConverter.poundToGram(beratInput) + " gram");
        System.out.println(beratInput + " kilogram = " + beratConverter.kilogramToPound(beratInput) + " pound");
        System.out.println(beratInput + " pound = " + beratConverter.poundToKilogram(beratInput) + " kilogram");

        // Contoh penggunaan konverter suhu
        Suhu suhuConverter = new SuhuImplementasi();
        double suhuInput = getInput(scanner, "Masukkan suhu dalam Celsius: ");
        System.out.println(suhuInput + " Celsius = " + suhuConverter.celsiusToFahrenheit(suhuInput) + " Fahrenheit");
        System.out.println(suhuInput + " Fahrenheit = " + suhuConverter.fahrenheitToCelsius(suhuInput) + " Celsius");
        System.out.println(suhuInput + " Kelvin = " + suhuConverter.kelvinToCelsius(suhuInput) + " Celsius");
        System.out.println(suhuInput + " Celsius = " + suhuConverter.celsiusToKelvin(suhuInput) + " Kelvin");

        scanner.close();
    }

    private static double getInput(Scanner scanner, String prompt) {
        double input = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print(prompt);
                input = scanner.nextDouble();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid. Harap masukkan angka.");
                scanner.nextLine(); // Clear the buffer
            }
        }

        return input;
    }
}