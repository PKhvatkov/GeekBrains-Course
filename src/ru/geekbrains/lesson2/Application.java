package ru.geekbrains.lesson2;

import ru.geekbrains.lesson2.Exceptions.MyArraySizeException;

public class Application {

    public static void checkArray(String[][] array) {
        int arraySumm = 0;
        try {
            if (array.length != 4) {
                throw new MyArraySizeException();
            }
        } catch (MyArraySizeException ex) {
            System.out.println("Check Array Size!" + ex);
        }

        for (int i = 0; i < 4; i++) {

                for (int j = 0; j < 4; j++) {
                    try {
                    arraySumm += Integer.parseInt(array[i][j]);
                    } catch (NumberFormatException ex) {
                        System.out.println(String.format("Incorrect Symbol at position %d - %d", i, j));
                }

            }

        }
        System.out.println("Summ = " + arraySumm );
    }


    public static void main(String[] args) {
        String[][] newArray = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}, {"13", "N", "Q", "16"}};

        checkArray(newArray);

    }
}