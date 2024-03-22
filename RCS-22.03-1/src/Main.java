import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // uzdevums1();
        uzdevums2();
    }
    //------------------------------------------------------------------------------------------------------------------
    public static void uzdevums1(){
        System.out.println("22-Marts: Uzdevums 1 - Skaitļa faktoriāls");
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
    public static void uzdevums2(){
        System.out.println("22-Marts: Uzdevums 2 - Skaitļa kāpināšana");
        Scanner sc = new Scanner(System.in);
        int X = 0;
        int pow = 0;
        int result = 0;

        System.out.println("Lūdzu ievadi skaitli X: ");
        X = sc.nextInt();
        System.out.println("Lūdzu ievadi skaitļa " + X + " kāpnātāju :");
        pow = sc.nextInt();

        result = X;

        for(int i = 1; i < pow; i++){
            result = result * X;
        }

        System.out.println("------------------------------");
        System.out.println("Rezultāts: " );
        System.out.println(X + "^" + pow+"="+result);
    }

}