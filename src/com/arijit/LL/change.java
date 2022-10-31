package com.arijit.LL;

import java.util.*;

 class change {

    public static void main(String args[])
    {
        LinkedList<String> ll = new LinkedList<>();

        ll.add("bunty");
        ll.add("babli");
        ll.add(1, "aur");

        System.out.println("Initial LinkedList " + ll);

        ll.set(1, "and");

        System.out.println("Updated LinkedList " + ll);
    }
}
