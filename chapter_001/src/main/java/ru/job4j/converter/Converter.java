package ru.job4j.converter;

public class Converter {
    private static double rurToUsd = 60;
    private static double rurToEur = 70;

    static double convertRurToEur(double value) {
        return value / rurToEur;
    }

    static double convertRurToUsd(double value) {
        return value / rurToUsd;
    }

    static double convertEurToRur(double value) {
        return value / (1 / rurToEur);
    }

    static double convertUsdToRur(double value) {
        return value / (1 / rurToUsd);
    }
}
