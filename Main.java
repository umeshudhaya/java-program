package com.company;
import java.io.*;
import java.lang.*;
import java.util.*;

// Java program to illustrate the
// concept of single inheritance

class one {
    public void print_geek()
    {
        String name="rakey";
        String set="ra12";
        String place="ray";
        System.out.println(name+" "+" "+place+" "+set);
    }
}

class two extends one {
    public void print_for() { System.out.println("for"); }
}
// Driver class
public class Main {
    public static void main(String[] args)
    {
        two g = new two();
        g.print_geek();
        g.print_for();
        g.print_geek();
    }
}
