// File: implementasi/PanjangImplementasi.java
package implementasi;

import konverter.Panjang;

public class PanjangImplementasi implements Panjang {
    @Override
    public double meterToKilometer(double meter) {
        return meter / 1000;
    }

    @Override
    public double meterToMil(double meter) {
        return meter * 0.000621371;
    }

    @Override
    public double kilometerToMeter(double kilometer) {
        return kilometer * 1000;
    }

    @Override
    public double milToMeter(double mil) {
        return mil / 0.000621371;
    }

    @Override
    public double kilometerToMil(double kilometer) {
        return kilometer * 0.621371;
    }

    @Override
    public double milToKilometer(double mil) {
        return mil * 1.60934;
    }
}