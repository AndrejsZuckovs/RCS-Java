import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //task1();
        task2();
    }
    //------------------------------------------------------------------------------------------------------------------
    public static void task1(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Lūdzu ievadi simbolu virkni");
        String inText = sc.nextLine();
        String setText = "programmesana";

        if(inText.equals(setText)){
            System.out.println("Uzvarēji!");
        }else if(inText.length() == setText.length()){
            System.out.println("vienāds simbolu skaits!");
        }
        else{
            System.out.println("zaudēji");
        }
    }
    //------------------------------------------------------------------------------------------------------------------
    public static void task2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Lūdzu ievadi Skaitli: ");
        int inNumber = sc.nextInt();

        if((inNumber > 10) || (inNumber < 5)) {
            System.out.println("$$");
        }else if((inNumber >= 6) && (inNumber <= 9)) {
            System.out.println("$");
        }else{
            System.out.println(" Skaitlis ir 5 ");
        }
    }
    //------------------------------------------------------------------------------------------------------------------
}