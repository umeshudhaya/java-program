package com.company;

import java.util.Scanner;

public class bmi
{
    public static void bmiCalculation(String name, int age, double height, int weight) {
        double bmi;
        bmi=(weight /(height * height));
        //System.out.println("BMI"+ bmi);
        if(bmi<=18.5)
        {
            details(name, age, height, weight);
            System.out.println("BMI Result is\t  : Underweight");
        }
        else if(bmi>=18.5 && bmi>=24.9)
        {
            details(name, age, height, weight);
            System.out.println("BMI Result is\t  : Healthy Weight");
        }
        else if(bmi>=25.0 && bmi<=29.9)
        {
            details(name, age, height, weight);
            System.out.println("BMI Result is\t  : Overweight");
        }
        else
        {
            details(name, age, height, weight);
            System.out.println("BMI Result is\t  : Obesity");
        }
    }
    private static void details(String name, int age, double height, int weight)
    {
        System.out.println("Name\t : "+name+"\nAge\t\t : "+age+"\nHeight\t : "+height+"\nWeight\t : "+weight);
    }
    public static void main(String args[])
    {
        String name;
        int age;
        double height;
        int weight;
        double bmi;
        System.out.println("Enter the Name");
        Scanner sc=new Scanner(System.in);
        name=sc.nextLine();
        System.out.println("Enter Age");
        age=sc.nextInt();
        System.out.println("Enter your weight in KG");
        weight= sc.nextInt();
        System.out.println("Enter Height in CM");
        height=sc.nextDouble();
        height=height/100;
        bmiCalculation(name, age, height, weight);
    }
}
