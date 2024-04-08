import java.util.Scanner;

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
        System.out.println("\u001B[33m 08-Aprīlis:  ✏\uFE0F\u001B[37m-"+"- ");
        System.out.println("\u001B[31m"+"┈➤ "  + "START");
        System.out.print("\u001b[37m\n");
        //--------------------------------------------------------------------------
        //teorija1();
        boolean result = uzdevums1();
        System.out.println(result);
        //--------------------------------------------------------------------------
        System.out.println("\u001B[31m"+"┈➤ " + "END");
    }
    //------------------------------------------------------------------------------------------------------------------
    public static void teorija1(){

    }
    //------------------------------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------
    public static boolean uzdevums1() {
        Scanner sc = new Scanner(System.in);
        int number = 0;

            for (int i = 0; i < 5; i++) {
                System.out.println("Lūdzu ievadi skaitli: ");
                try{
                    number = sc.nextInt();
                    if (number == 28) {
                        return true;
                    }
                }
                catch(Exception e) {
                    System.err.println("Tika ievadīts ne skaitlis!");
                    sc.nextLine();      // Pabeidz skanēšanu! -> https://stackoverflow.com/a/26909638/22964124
                }
            }
        return false;
    }
    //------------------------------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------
}