import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        uzdevums1();
    }
    //------------------------------------------------------------------------------------------------------------------
    public static void uzdevums1(){
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
}