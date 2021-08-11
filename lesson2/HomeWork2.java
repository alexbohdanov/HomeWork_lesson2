package ru.geekbrains.lesson2;

import java.util.ArrayList;
import java.util.List;

public class HomeWork2 {

    public static void main(String[] args) {
        String[][] normal = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        String[][] wrongSize = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15"}
        };
        String[][] otherWrongSize = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"}
        };
        String[][] wrongData = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "x"}
        };

        List<String[][]> inputs = new ArrayList<>(List.of(normal, wrongSize, otherWrongSize, wrongData));
        for (String[][] input : inputs) {
            try {
                System.out.printf("Sum of array elements = %s\n", sumArrayElements(input));
            } catch (MyArraySizeException e) {
                System.out.printf("Wrong input array size. It must be 4x4");
            } catch (MyArrayDataException e) {
                System.out.printf("Can't parse element of input array, check the data at %d x %d", e.i, e.j);
            }

        }
    }
        public static  int sumArrayElements(final String[][] inputArr) throws MyArraySizeException, MyArrayDataException {
    int sum = 0;
    if (inputArr.length !=4) {
    throw new MyArraySizeException("input array size must be 4x4");
    }
    for (int i = 0; i < inputArr.length; i++) {
        for (int j = 0; j < inputArr.length; j++) {
            try {
                sum += Integer.parseInt(inputArr[i][j]);
            } catch (NumberFormatException e) {
                throw new MyArrayDataException(i, j, "can't parse element of input array");
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new MyArraySizeException("input array size must be 4x4");
            }
            }
        }
    return sum;
    }
        }

