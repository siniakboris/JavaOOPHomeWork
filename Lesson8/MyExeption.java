package com.gmail.siniakboris;

public class MyException extends Exception {
    @Override
    public String toString() {
        return "Максимальное количество студентов в группе";
    }
}
