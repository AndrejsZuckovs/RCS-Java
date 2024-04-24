import java.util.Scanner;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// metodes
// klases
// Scanner sc = new Scanner(System.in);
// sc0.nextInt();       -> int
// sc1.nextLine();      -> String

public class Main {
    public static int var_1 = 0;
    private static int var_2 = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\u001B[33m 24-Aprīlis:  ✏\uFE0F\u001B[37m-"+"- Class");
        System.out.println("\u001B[31m"+"┈➤ "  + "START");
        System.out.print("\u001b[37m\n");
        //--------------------------------------------------------------------------
        //Samples.sample1();
        //--------------------------------------------------------------------------
        //teorija1();
        //--------------------------------------------------------------------------
        // Uzdevums #1
//        int[] numbers = new int[3];
//        System.out.println("Ievadi trīs skaitļus!");
//        for(int i=0; i<numbers.length; i++){
//            numbers[i] = sc.nextInt();
//        }
//        System.out.println("Spēles rezūltāts: "+ Games.guess(numbers));
        //--------------------------------------------------------------------------
        // Uzdevums #2
        List<Integer> numbers = Tools.number(false);
        System.out.println("---------------");
        System.out.println("Skaitļi: ");
        for(int i=0; i<numbers.size(); i++){
            System.out.println(numbers.get(i));
        }
        //--------------------------------------------------------------------------
        System.out.println("\u001B[31m"+"┈➤ " + "END");
    }
    //------------------------------------------------------------------------------------------------------------------
    public static void teorija1(){
    }
    //------------------------------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------
    public static void uzdevums1(){

    }
    //------------------------------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------
}