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

        // Membuat objek konverter untuk panjang, berat, dan suhu
        Panjang panjangConverter = new PanjangImplementasi();
        Berat beratConverter = new BeratImplementasi();
        Suhu suhuConverter = new SuhuImplementasi();

        // Menampilkan menu utama
        int choice;
        do {
            System.out.println("=========== Konverter Unit ===========");
            System.out.println("1. Konversi Panjang");
            System.out.println("2. Konversi Berat");
            System.out.println("3. Konversi Suhu");
            System.out.println("0. Keluar");
            System.out.print("Pilih jenis konversi (0-3): ");

            try {
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline character
                processConversion(scanner, choice, panjangConverter, beratConverter, suhuConverter);
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid. Harap masukkan angka.");
                scanner.nextLine(); // Clear the buffer
                choice = -1;
            }

        } while (choice != 0);

        System.out.println("Terima kasih! Program selesai.");
        scanner.close();
    }

    private static void processConversion(Scanner scanner, int choice, Panjang panjangConverter, Berat beratConverter, Suhu suhuConverter) {
        switch (choice) {
            case 1:
                // Konversi Panjang
                processPanjangConversion(scanner, panjangConverter);
                break;
            case 2:
                // Konversi Berat
                processBeratConversion(scanner, beratConverter);
                break;
            case 3:
                // Konversi Suhu
                processSuhuConversion(scanner, suhuConverter);
                break;
            case 0:
                // Keluar
                break;
            default:
                System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
                break;
        }
    }

    private static void processPanjangConversion(Scanner scanner, Panjang panjangConverter) {
        double input;
        System.out.print("Masukkan panjang dalam meter: ");
        input = getInput(scanner);
        System.out.println(input + " meter = " + panjangConverter.meterToKilometer(input) + " kilometer");
        System.out.println(input + " meter = " + panjangConverter.meterToMil(input) + " mil");
        // Tambahkan konversi panjang lainnya jika diperlukan
    }

    private static void processBeratConversion(Scanner scanner, Berat beratConverter) {
        double input;
        System.out.print("Masukkan berat dalam gram: ");
        input = getInput(scanner);
        System.out.println(input + " gram = " + beratConverter.gramToKilogram(input) + " kilogram");
        System.out.println(input + " gram = " + beratConverter.gramToPound(input) + " pound");
        // Tambahkan konversi berat lainnya jika diperlukan
    }

    private static void processSuhuConversion(Scanner scanner, Suhu suhuConverter) {
        double input;
        System.out.print("Masukkan suhu dalam Celsius: ");
        input = getInput(scanner);
        System.out.println(input + " Celsius = " + suhuConverter.celsiusToFahrenheit(input) + " Fahrenheit");
        System.out.println(input + " Fahrenheit = " + suhuConverter.fahrenheitToCelsius(input) + " Celsius");
        // Tambahkan konversi suhu lainnya jika diperlukan
    }

    private static double getInput(Scanner scanner) {
        double input = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
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
