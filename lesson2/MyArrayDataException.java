package ru.geekbrains.lesson2;

public class MyArrayDataException extends Exception {
    public int i;
    public int j;

    public MyArrayDataException(int i, int j) {
        super();
        this.i = i + 1;
        this.j = j + 1;
    }

    public MyArrayDataException(int i, int j, String message) {
        super(message);
        this.i = i + 1;
        this.j = j + 1;
    }
}
