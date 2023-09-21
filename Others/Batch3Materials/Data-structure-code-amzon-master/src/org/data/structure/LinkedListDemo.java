package org.data.structure;

import java.util.*;
class LinkedListDemo
{
    public static void main (String[]args)
    {
        LinkedList < String > animals = new LinkedList <> ();

        // Add elements to LinkedList
        animals.add ("Dog");
        animals.add ("Cat");
        animals.add ("Horse");
        System.out.println ("LinkedList: " + animals);
    
        // Get the element from the linked list
        String str = animals.get (1);
        System.out.print ("Element at index 1: " + str);
        System.out.println (" ");
    
        //Iterator method
        Iterator < String > itr = animals.iterator ();
        while (itr.hasNext ())
        {
         System.out.println (itr.next ());
        }
    }
}
