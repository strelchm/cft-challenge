package ru.strelchm;

import java.util.Scanner;

public class Main {
    public static final int CELL_SIGNS_COUNT = 3;

    public static final String MINUS_SIGN = "-";
    public static final String PLUS_SIGN = "+";
    public static final String SEPARATOR_SIGN = "|";
    public static final String SPACE_SIGN = " ";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.next());
        int b = Integer.parseInt(scanner.next());

        printRow(b, 1, true);
        for (int i = 1; i <= a; ++i) {
            printRow(b, i, false);
        }
    }

    private static void printRow(int cellCount, int i, boolean header) {
        for (int j = 1; j <= cellCount; ++j) {
            if (header && j == 1) {
                System.out.print(SPACE_SIGN + SPACE_SIGN + SPACE_SIGN + SEPARATOR_SIGN);
            } else {
                printCell(i, j, cellCount);
            }

            if (j == 1) {
                printCell(i, j, cellCount);
            }
        }
        System.out.println();
        printSeparatorRow(cellCount);
    }

    private static void printSeparatorRow(int cellCount) {
        for (int j = 0; j <= cellCount; ++j) {
            for (int z = 0; z < CELL_SIGNS_COUNT; ++z) {
                System.out.print(MINUS_SIGN);
            }
            if (j != cellCount) {
                System.out.print(PLUS_SIGN);
            }
        }
        System.out.println();
    }

    private static void printCell(int i, int j, int cellCount) {
        int multiply = i * j;
        int jCharacterCount = Integer.toString(multiply).length();
        int spacesCount = CELL_SIGNS_COUNT - jCharacterCount;

        for (int z = 0; z < spacesCount; ++z) {
            System.out.print(SPACE_SIGN);
        }
        System.out.print(multiply);
        if (j != cellCount) {
            System.out.print(SEPARATOR_SIGN);
        }
    }
}
