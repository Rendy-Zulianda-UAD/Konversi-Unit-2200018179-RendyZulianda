// File: implementasi/BeratImplementasi.java
package implementasi;

import konverter.Berat;

public class BeratImplementasi implements Berat {
    @Override
    public double gramToKilogram(double gram) {
        return gram / 1000;
    }

    @Override
    public double gramToPound(double gram) {
        return gram * 0.00220462;
    }

    @Override
    public double kilogramToGram(double kilogram) {
        return kilogram * 1000;
    }

    @Override
    public double poundToGram(double pound) {
        return pound / 0.00220462;
    }

    @Override
    public double kilogramToPound(double kilogram) {
        return kilogram * 2.20462;
    }

    @Override
    public double poundToKilogram(double pound) {
        return pound / 2.20462;
    }
}
