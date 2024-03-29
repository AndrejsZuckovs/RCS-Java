import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //uzdevums1(1);
        //uzdevums2(2);
        //teorija1(1);
        uzdevums3(3);
    }
    //------------------------------------------------------------------------------------------------------------------
    public static void uzdevums1(int Nr){
        System.out.println("\u001B[33m 22-Marts:  ✏\uFE0F\u001B[37m-"+Nr+"- Skaitļa faktoriāls");
        Scanner sc = new Scanner(System.in);
        int inNumber = 0;
        int faktorials = 1;

        System.out.println("Lūdzu ievadi pozitīvu skaitli: ");
        inNumber = sc.nextInt();

        if(inNumber <= 0){
            System.out.println("Skaitlis ir <= 0 ! Mēģini vēlreiz citreiz :( ");
        }
        else{
            System.out.println("Skaitļa " + inNumber+ " faktoriāls būs: ");
            for(int i = 1; i < inNumber+1; i++){
                faktorials = faktorials * i;
                System.out.println("F [" + i + "] : " + faktorials);
            }
            System.out.println("------------------------------");
            System.out.println("Rezultāts ir: " + faktorials);
        }
    }
    //------------------------------------------------------------------------------------------------------------------
    public static void uzdevums2(int Nr){
        System.out.println("\u001B[33m 22-Marts:  ✏\uFE0F\u001B[37m-"+Nr+" - Skaitļa kāpināšana");
        Scanner sc = new Scanner(System.in);
        int X = 0;
        int pow = 0;
        int result = 1;

        System.out.print("Lūdzu ievadi skaitli X: ");
        X = sc.nextInt();
        System.out.print("Lūdzu ievadi skaitļa " + X + " kāpnātāju :");
        pow = sc.nextInt();

        for(int i = 0; i < pow; i++){
            result = result * X;
        }

        System.out.print("Rezultāts: " );
        System.out.println("┈➤ "+"\u001B[31m" + X + "^" + pow+"="+result);
        System.out.println("┈➤ "+"\u001B[31m" + "END");
    }
    //------------------------------------------------------------------------------------------------------------------
    public static void teorija1(int Nr){
        Scanner sc = new Scanner(System.in);
        String input = "";
        while(!input.equals("exit")){
            System.out.println("Hello");
            System.out.print("Lūdzu ievadi skaitli tekstu: ");
            input = sc.nextLine();
        }
        System.out.println("┈➤ "+"\u001B[31m" + "END");
    }
    //------------------------------------------------------------------------------------------------------------------
    public static void uzdevums3(int Nr){
        System.out.println("\u001B[33m 22-Marts:  ✏\uFE0F\u001B[37m-"+Nr+" - while cikls");
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        String input = "";
        int X = 0;
        int SUM = 0;

        while(!input.equals("jā")){
            System.out.print("Lūdzu ievadi skaitli X: ");
            X = sc1.nextInt();
            SUM = SUM+X;
            System.out.print("Vai iziet: ");
            input = sc2.nextLine();
        }

        System.out.print("Rezultāts: " );
        System.out.println("\u001B[31m" + SUM);
        System.out.println("┈➤ "+"\u001B[31m" + "END");

    }
    //------------------------------------------------------------------------------------------------------------------
}