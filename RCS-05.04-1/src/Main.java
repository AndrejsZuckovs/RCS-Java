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
        System.out.println("\u001B[33m 05-Aprīlis:  ✏\uFE0F\u001B[37m-"+"- ");
        System.out.println("\u001B[31m"+"┈➤ "  + "START");
        System.out.print("\u001b[37m\n");
        //--------------------------------------------------------------------------
        uzdevums1(3);
        //teorija1();
        //--------------------------------------------------------------------------
        System.out.println("\u001B[31m"+"┈➤ " + "END");
    }
    //------------------------------------------------------------------------------------------------------------------
    public static void teorija1(){
    }
    //------------------------------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------
    public static void uzdevums1(int number){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        if(number % 2 == 0){
            System.out.println("Tev būs jāievada "+number+" skaitļi!");
            for(int i = 1; i<number+1; i++){
                System.out.print("Ievadi "+i+". skaitli: ");
                sum += sc.nextInt();
            }
        }
        else{
            System.out.println("Tev būs jāvada skaitļi tik ilgi, kamēr to summa būs > 15 !");
            int i = 0;
            while(sum < 15){
                i++;
                System.out.print("Summa ir : " + sum+" nav pietiekami! Ievadi "+i+". skaitli: ");
                sum +=  sc.nextInt();
            }
        }
        System.out.println("Ievadīto skaitļu summa ir :"+sum);
    }
    //------------------------------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------
}