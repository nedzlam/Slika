package com.company;

public class Main {

    public static void main(String[] args) {
        int w = 10;
        int h = 20;
        for (int i = 0; i < h; i++) {
            System.out.println("");
            for (int j = 0; j < w; j++) {
                if (j == 0 || j == (w-1)) {
                    System.out.printf("  #");
                }
                else if (i == 0 || i == (h-1)) {
                    System.out.printf("  #");
                }
                else System.out.printf("  0");
            } }
        }
    }

