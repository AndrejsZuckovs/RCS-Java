package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //task1();
        task2();
    }
    //==================================================================================================================
    public static void task1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadi 1. skaitli: ");
        int inputNumber1 = sc.nextInt();
        System.out.println("Ievadi 2. skaitli: ");
        int inputNumber2 = sc.nextInt();
        System.out.println("Summa ir: " + (inputNumber1+inputNumber2) + " & starpība ir: " + (inputNumber1-inputNumber2));
    }
    //==================================================================================================================
    public static void task2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadi divus skaitļus: ");
        int inputNumber1 = sc.nextInt();
        int inputNumber2 = sc.nextInt();
        System.out.println("Skaitļu " + inputNumber1 + " & " + inputNumber2 +", summa ir "+ (inputNumber1+inputNumber2) + ", bet starpība ir " + (inputNumber1-inputNumber2));
    }
    //==================================================================================================================
}