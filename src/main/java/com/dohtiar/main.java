package com.dohtiar;

public class main {
    public static void main(String[] args) {
        int[] Array = new int[20];

        Array(Array);
        System.out.println(" ");
        min(Array);
        System.out.println(" ");
        max(Array);
        System.out.println(" ");
        Sum(Array);
        System.out.println(" ");
        fromMinToMax(Array);
        System.out.println(" ");
        fromMaxToMin(Array);
        System.out.println(" ");
        Sq(Array);

        String[][] matrix = {
                {"A", "B", "C"},
                {"D", "E", "F"},
                {"G", "H", "L"}
        };
        Matrix(matrix);

        int[] Replace = {3, 2, 3, 1, 4, 2, 8, 3};
        Replace(Replace);
    }

    public static void printArray(int[] Array) {
        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i] + " ");
        }
        System.out.println();
    }

    public static void Array(int[] Array) {
        for (int i = 0; i < Array.length; i++) {
            Array[i] = (int) (Math.random() * 100);
        }
        System.out.println("Array: ");
        printArray(Array);
    }

    public static void min(int[] Array) {
        int min = Array[0];
        for (int j = 0; j < Array.length; j++) {
            if (min > Array[j]) {
                min = Array[j];
            }
        }
        System.out.println("Min = " + min);
    }

    public static void max(int[] Array) {
        int max = Array[0];
        for (int j = 0; j < Array.length; j++) {
            if (max < Array[j]) {
                max = Array[j];
            }
        }
        System.out.println("Max = " + max);
    }

    public static void Sum(int[] Array) {
        int sum = 0;
        for (int i = 0; i < Array.length; i++) {
            sum = sum + Array[i];
        }
        System.out.println("Sum of Elements: " + sum);
    }

    public static void fromMinToMax(int[] Array) {
        for (int i = Array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (Array[j] > Array[j + 1]) {
                    int x = Array[j];
                    Array[j] = Array[j + 1];
                    Array[j + 1] = x;
                }
            }
        }
        System.out.println("From Min To Max: ");
        printArray(Array);
    }

    public static void fromMaxToMin(int[] Array) {
        for (int i = Array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (Array[j] < Array[j + 1]) {
                    int x = Array[j];
                    Array[j] = Array[j + 1];
                    Array[j + 1] = x;
                }
            }
        }
        System.out.println("From Max To Min: ");
        printArray(Array);
    }

    public static void Sq(int[] Array) {
        for (int i = 0; i < Array.length; i++) {
            Array[i] = (int) Math.pow(Array[i], 2);
        }
        System.out.println("Square: ");
        printArray(Array);
        System.out.println(" ");
    }
    
    public static void Matrix(String[][] matrix) {
        System.out.print("Diagonal: ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println(" ");
    }

    public static void Replace(int[] replaceArray) {
        for (int i = 0; i < replaceArray.length; i++) {
            for (int j = i + 1; j < replaceArray.length; j++) {
                if (replaceArray[i] == replaceArray[j]) {
                    replaceArray[j] = 0;
                }
            }
        }
        System.out.println(" ");
        System.out.println("Zero replacement: ");
        printArray(replaceArray);
    }
}
