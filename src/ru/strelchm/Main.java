package ru.strelchm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.next());
        int b = Integer.parseInt(scanner.next());

        printRow(b, 1, true);
        for (int i = 1; i <= a; ++i) {
            printRow(b, i, false);
        }
    }

    private static void printRow(int a, int i, boolean header) {
        for (int j = 1; j <= a; ++j) {
            if (header && j == 1) {
                System.out.print("  | ");
            } else {
                rowOut(i, j);
            }

            if (j == 1) {
                rowOut(i, j);
            }
        }
        System.out.println();
        System.out.print("-------------------------------------");
        System.out.println();
    }

    private static void rowOut(int i, int j) {
        System.out.print(i * j + "| ");
    }
}
