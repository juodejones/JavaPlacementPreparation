package com.practice_package;

public class MyArray {
    String dataType;
    IntArray intArray;
    CharArray charArray;
    DoubleArray doubleArray;

    public MyArray(String dataType, int size) {
        this.dataType = dataType;
        switch (dataType.toLowerCase()) {
            case "int":
                intArray = new IntArray(size);
                break;
            case "double":
                doubleArray = new DoubleArray(size);
                break;
            case "char":
                charArray = new CharArray(size);
                break;
        }
    }
}

class IntArray {

    int size;
    int[] arr;

    public IntArray(int size) {
        this.size = size;
        arr = new int[100];
    }

    public void printArray(int[] arr) {
        for (int i=0; i<size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void insert(int pos, int data) {
        for (int i=size; i>pos; i--) {
            arr[i] = arr[i-1];
        }
        arr[pos] = data;
        size++;
        printArray(arr);
    }

    public void delete(int pos) {
        for (int i=pos; i<size-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[size-1] = 0;
        size--;
        printArray(arr);
    }

    public void deleteData(int c) {
        int pos = search(c);
        if (pos>-1 && pos<size) {
            delete(pos);
        }
    }

    public int search(int data) {
        for (int i=0; i<size; i++) {
            if (arr[i] ==  data) return i;
        }
        return -1;
    }
}

class DoubleArray {

    int size;
    double[] arr;

    public DoubleArray(int size) {
        this.size = size;
        arr = new double[100];
    }

    public void printArray() {
        for (int i=0; i<size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void insert(int pos, double data) {
        for (int i=size; i>pos; i--) {
            arr[i] = arr[i-1];
        }
        arr[pos] = data;
        size++;
    }

    public void delete(int pos) {
        for (int i=pos; i<size-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[size-1] = 0.0;
        size--;
    }

    public void deleteData(double c) {
        int pos = search(c);
        if (pos>-1 && pos<size) {
            delete(pos);
        }
    }

    public int search(double data) {
        for (int i=0; i<size; i++) {
            if (arr[i] ==  data) return i;
        }
        return -1;
    }
}

class CharArray {

    int size;
    char[] arr;

    public CharArray(int size) {
        this.size = size;
        arr = new char[100];
    }

    public void getChar() {

    }

    public void printArray() {
        for (int i=0; i<size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void insert(int pos, char data) {
        for (int i=size; i>pos; i--) {
            arr[i] = arr[i-1];
        }
        arr[pos] = data;
        size++;
    }

    public void delete(int pos) {
        for (int i=pos; i<size-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[size-1] = '\0';
        size--;
    }

    public void deleteData(char c) {
        int pos = search(c);
        if (pos>-1 && pos<size) {
            delete(pos);
        }
    }

    public int search(char data) {
        for (int i=0; i<size; i++) {
            if (arr[i] ==  data) return i;
        }
        return -1;
    }
}