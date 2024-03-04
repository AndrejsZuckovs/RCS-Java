package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       // task1();
        task2();
    }
    //==================================================================================================================
    public static void task1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadi skaitļi: ");
        int number = sc.nextInt();

        if(number > 5){
            System.out.println("Ievadītais skaitlis " + number + " ir > par 5");
        }else if(number == 5){
            System.out.println("Ievadītais skaitlis " + number + " ir = 5");
        }
        else{
            System.out.println("Ievadītais skaitlis " + number + " ir < par 5");
        }
    }
    //==================================================================================================================
    // Luminor programmētāji, prakse
    //==================================================================================================================
    public static void task2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadi divus skaitļus: ");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        String text = "Hello";
        int textLen = text.length();

        System.out.println("Garums "+ textLen);

        if(textLen > 6){
            System.out.println("#");
        }
        else{
            System.out.println("##");
        }


        System.out.println("Skaitļu " + number1 + " & " + number2 + " summa ir " + (number1+number2) + " bet starpība ir " + (number1-number2));

        if((number1 + number2) > 0) {
            System.out.println("+");
        }else if((number1 + number2) == 0){
            System.out.println("0");
        }
        else{
            System.out.println("-");
        }

    }
}