package com.arijit.LL;

// Java program to add elements
// to a LinkedList

import java.util.*;

 class addLL {

    public static void main(String args[])
    {
        LinkedList<String> ll = new LinkedList<>();

        ll.add("arijit");
        ll.add("bony");
        ll.add(1, "and");

        System.out.println(ll);
    }
}
