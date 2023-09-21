package org.data.structure;

import java.util.Stack;

class Sports
{
    String name;
    Sports (String na)
    {
        name = na;
    }

    String getData ()
    {
        return "Name : " + name;
    }
}

class StackDemo
{
    public static void main (String[]args)
    {
        Stack < Sports > stack = new Stack < Sports > ();
        Sports s1 = new Sports ("Cricket");
        Sports s2 = new Sports ("Football");
        Sports s3 = new Sports ("Basketball");
        Sports s4 = new Sports ("Table Tennis");
        Sports s5 = new Sports ("Badminton");

        
        stack.push (s1);  
        stack.push (s2);  
        stack.push (s3);  
        stack.push (s4);
        stack.push (s5);  
        System.out.println ("Stack size is " + stack.size ());

        stack.pop ();  
        stack.pop ();  
        stack.pop ();  
        stack.pop (); 
        stack.pop ();  
       

        // Returns the number of elements present in the stack
        System.out.println ("Stack size is " + stack.size ());

        // check if stack is empty
        if (stack.empty ())
            System.out.println ("Stack is Empty");
        else
            System.out.println ("Stack is not Empty");
    }
}