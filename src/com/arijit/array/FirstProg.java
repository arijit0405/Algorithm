package com.arijit.array;

public class FirstProg {
    public static void main(String[] args) {
        int[] marks= {2,3,4,5,6};
        boolean match= false;
        int l= marks.length;
        for(int i=0; i<l; i++){
            if (marks[i]==7){
                match=true;
                break;
            }
        }if(match==true){
            System.out.println("found");
        }else {
            System.out.println("not foun");

        }

    }
}
