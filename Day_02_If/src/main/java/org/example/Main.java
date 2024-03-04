package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        task1();


    }
    //==================================================================================================================
    public static void task1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadi savu vārdu: ");
        String inputName = sc.nextLine();

        System.out.println("Ievadi savu dzimšanas gadu: ");
        int inputBYear = sc.nextInt();
        int nowYear = 2024;
        int userAge = nowYear-inputBYear;

        System.out.println("Lietotāju sauc "+  inputName + " un lietotājam ir " + userAge +" gadi.");
    }
    //==================================================================================================================
    public static void sample1(){

    }
    //==================================================================================================================
}