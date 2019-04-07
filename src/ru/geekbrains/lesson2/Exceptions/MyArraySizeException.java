package ru.geekbrains.lesson2.Exceptions;

public class MyArraySizeException extends Exception {

    public MyArraySizeException() {
        super("Incorrect Array Size!");
    }
}