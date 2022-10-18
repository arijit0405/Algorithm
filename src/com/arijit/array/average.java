package com.arijit.array;

public class average {
    public static void main(String[] args) {
        float[] marks= {24.5f, 45.6f,67.68f,34.56f,89.9f };
        int i =0;
        float sum=0;
        float avg;
        for(i=0;i<=marks.length-1;i++){
            sum=sum+marks[i];
        }
        avg= sum/(marks.length);
        System.out.println(avg);
    }
}

