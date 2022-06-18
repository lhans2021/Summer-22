package Serializer;

import java.io.*;

public class User implements Serializable { // to make this object serializable, we need to implement Serializable interface 

    String name; 
    int age;
    transient double weight; // the keyword transient prevents this variable from being serialized! 

    public void hello() {
        System.out.println("Hi, my name is" + name); 
    }
}