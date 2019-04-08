package ru.geekbrains.lesson3;

import java.util.Arrays;
import java.util.HashMap;

public class CountWordsInArray {


    public static void main(String[] args) {
        String[] arrayOfWords = {"Red", "Green", "Yellow", "Blue", "Pink", "Brown", "Green", "White", "Orange", "Yellow", "Black", "Black", "Black", "Pink", "Black"};
        System.out.println(Arrays.toString(arrayOfWords));

        HashMap<String, Integer> tableOfWords = new HashMap<>();

        for (int i = 0; i < arrayOfWords.length; i++) {
            if (tableOfWords.containsKey(arrayOfWords[i])) {
                int counter = tableOfWords.get(arrayOfWords[i]) + 1;
                tableOfWords.put(arrayOfWords[i], counter);
            } else {
                tableOfWords.put(arrayOfWords[i], 1);
            }
        }

        System.out.println(tableOfWords);
    }
}
