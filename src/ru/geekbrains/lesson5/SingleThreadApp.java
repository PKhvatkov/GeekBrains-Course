package ru.geekbrains.lesson5;

public class SingleThreadApp {

    static final int size = 10000000;
    static final int h = size / 2;
    static float[] arr = new float[size];

    public static void main(String[] args) {

        for (int i = 0; i < size; i++) {
            arr[i] = 1;
        }

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < size; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        System.out.println("Completed in: " + (System.currentTimeMillis() - startTime));
    }
}
