package com.arijit.LL;

import java.util.*;

 class Remove {

    public static void main(String args[])
    {
        LinkedList<String> ll = new LinkedList<>();

        ll.add("arijit");
        ll.add("deepshikha");
        ll.add(1, "and");

        System.out.println("Initial LinkedList " + ll);


        ll.remove(2);

        System.out.println("After the Index Removal " + ll);

        ll.remove("and");

        System.out.println("After the Object Removal "
                + ll);
    }
}
