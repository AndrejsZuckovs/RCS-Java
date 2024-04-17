import java.util.Scanner;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// metodes
// klases
// Scanner sc = new Scanner(System.in);
// sc0.nextInt();       -> int
// sc1.nextLine();      -> String

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\u001B[33m 05-Aprīlis:  ✏\uFE0F\u001B[37m-"+"- ");
        System.out.println("\u001B[31m"+"┈➤ "  + "START");
        System.out.print("\u001b[37m\n");
        //--------------------------------------------------------------------------
        int[] masivs = {1,2,3,4,5};
        //piemers1();
        //teorija1(masivs);
        uzdevums1(masivs);
        //--------------------------------------------------------------------------
        System.out.println("\u001B[31m"+"┈➤ " + "END");
    }
    //------------------------------------------------------------------------------------------------------------------
    public static void piemers1(){
        int maxVal = Integer.MIN_VALUE;
        int[] numbers = new int[10];
        Random r = new Random();
        for(int i=0; i<numbers.length;i++) {
            numbers[i] = r.nextInt((99 - 1 + 1) + 1);
            if (maxVal < numbers[i]) {
                maxVal = numbers[i];
            }
            System.out.println(numbers[i] + " ");
        }
        System.out.println("Max: " + maxVal);
    }
    //------------------------------------------------------------------------------------------------------------------
    public static void teorija1(int[] a){
        System.out.println(a.length);
    }
    //------------------------------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------
    public static void uzdevums1(int[] numbers){
        for(int i=0; i<numbers.length; i++){
            System.out.println(numbers[i] + " ");
        }
    }
    //------------------------------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------
}