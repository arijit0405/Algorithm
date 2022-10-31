package com.arijit.LL;

import java.util.*;
 class reverse{
    public static void main(String args[]){

        LinkedList<String> ll=new LinkedList<String>();
        ll.add("ami");
        ll.add("bhalo");
        ll.add("chele");
        //Traversing the list of elements in reverse order
        Iterator i=ll.descendingIterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }

    }
}