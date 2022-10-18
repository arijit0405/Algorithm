package com.arijit.array;
public class max {
    public static void main(String[] args) {
        int[] arr = {1, 2100, 3, 455, 5, 34, 67};
        int max = Integer.MIN_VALUE;
        for (int e : arr) {
            if (e > max) {
                max = e;
            }
        }
        System.out.println( max);

    }
}
