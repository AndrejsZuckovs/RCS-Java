import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("\u001B[33m 29-Marts:  ✏\uFE0F\u001B[37m"+" - Metodes ar parametriem");
        System.out.println("\uFE0F\u001B[37m"+"----------------------------------------------------------------------");
        //--------------------------------------------------------------------------------------------------------------
        // teorija1(1,2);
        // teorija2("Hello!");
        // uzdevums1("Hello ","world ", "!");
        uzdevums2(5);
        //--------------------------------------------------------------------------------------------------------------
        System.out.println("\uFE0F\u001B[37m"+"----------------------------------------------------------------------");
        System.out.println("┈➤ "+"\u001B[31m" + "END");
    }
    //------------------------------------------------------------------------------------------------------------------
    public static void teorija1(int a, int b){
        System.out.println(a+b);
    }
    public static void teorija2(String a){
        System.out.println(a);
    }
    //------------------------------------------------------------------------------------------------------------------
    public static void uzdevums1(String a,String b,String c){
        String text = a + b + c;
        System.out.println(text);
    }
    //------------------------------------------------------------------------------------------------------------------
    public static void uzdevums2(int j){
        Scanner sc = new Scanner(System.in);
        int sPara = 0;
        int sNepara = 0;
        int summ = 0;
        int inMumber = 0;

        if(j>1) {
            System.out.println("Tev kopā būs jāievada " + j + " skaitļi.");
            for (int i = 1; i < j + 1; i++) {
                System.out.print("Ievadi " + i + ". skaitli: ");
                inMumber = sc.nextInt();
                if(inMumber % 2 == 0) {
                    System.out.print(i + ". ievadītais skaitlis :" + inMumber + " ir PĀRA skaitlis" + "\n");
                    sPara += inMumber;
                }
                else {
                    System.out.print(i + ". ievadītais skaitlis :" + inMumber + " ir NEPĀRA skaitlis" + "\n");
                    sNepara += inMumber;
                }
            }
            System.out.println("Ievadīto PĀRA skaitļu summa ir: " + sPara);
            System.out.println("Ievadīto NEPĀRA skaitļu summa ir: " + sNepara);
            summ = sPara + sNepara;
            System.out.println("Ievadīto visu skaitļu summa ir: " + summ);

        }
        else if(j==1){
            System.out.print("Ievadi 1x skaitli: ");
            inMumber = sc.nextInt();

            if(inMumber % 2 == 0) {
                System.out.print("Ievadītais skaitlis :" + inMumber + " ir PĀRA skaitlis" + "\n");
            }
            else {
                System.out.print("Ievadītais skaitlis :" + inMumber + " ir NEPĀRA skaitlis" + "\n");

            }

        }
        else{
            System.out.println("Tev nebūs jāievada skaitļi! Paldies :)");
        }
    }
    //------------------------------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------
}