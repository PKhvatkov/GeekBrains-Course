package ru.geekbrains.lesson5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiThreadApp {

    static final int size = 10000000;
    static final int h = size / 2;
    static float[] arr = new float[size];
    static float[] a1 = new float[h];
    static float[] a2 = new float[h];


    public static void main(String[] args) {

        for (int i = 0; i < size; i++) {
            arr[i] = 1;
        }

        long startTime = System.currentTimeMillis();

        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < h; i++) {
                    a1[i] = (float) (a1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        });


        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int j = 0; j < h; j++) {
                    a2[j] = (float) (a2[j] * Math.sin(0.2f + j / 5) * Math.cos(0.2f + j / 5) * Math.cos(0.4f + j / 2));
                }
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);

        System.out.println("Completed in: " + (System.currentTimeMillis() - startTime));
    }
}