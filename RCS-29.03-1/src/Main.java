import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // teorija1(1,2);
        // teorija2("Hello!");
        // uzdevums1("Hello ","world ", "!");
        uzdevums2(5);
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
        int summ = 0;
        int inMumber = 0;

        if(j>1) {
            System.out.println("Tev kopā būs jāievada " + j + " skaitļi.");
            for (int i = 1; i < j + 1; i++) {
                System.out.print("Ievadi " + i + ". skaitli: ");
                inMumber = sc.nextInt();
                if(inMumber % 2 == 0) {
                    System.out.print(i + ". ievadītais skaitlis :" + inMumber + " ir PĀRA skaitlis" + "\n");
                    summ += inMumber;
                }
                else{
                    System.out.print(i + ". ievadītais skaitlis :" + inMumber + " ir NEPĀRA skaitlis"+ "\n");
                }


            }
            System.out.println("Ievadīto skaitļu summa ir: " + summ);
        }
        else if(j==1){
            System.out.print("Ievadi 1x skaitli: ");
            System.out.println("Ievadītais skaitlis ir: "+sc.nextInt() );
        }
        else{
            System.out.println("Tev nebūs jāievada skaitļi! Paldies :)");
        }
    }
    //------------------------------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------
}