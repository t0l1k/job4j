package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int result = 0;
        result = (first > result) ? first : result;
        result = (second > result) ? second : result;
        result = (third > result) ? third : result;
//        if (first > result){
//            result = first;
//        }
//        if (second > result){
//            result = second;
//        }
//        if (third > result){
//            result = third;
//        }
//        return result;
        return result;
    }
}