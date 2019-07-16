package ru.job4j.converter;

public class Converter {
    private static double rurToUsd = 60;
    private static double rurToEur = 70;
    private static double usdToRur = 1 / rurToUsd;
    private static double eurToRur = 1 / rurToEur;


    static double convertRurToEur(double value) {
        return value / rurToEur;
    }

    static double convertRurToUsd(double value) {
        return value / rurToUsd;
    }

    static double convertEurToRur(double value) {
        return value / eurToRur;
    }

    static double convertUsdToRur(double value) {
        return value / usdToRur;
    }

}
