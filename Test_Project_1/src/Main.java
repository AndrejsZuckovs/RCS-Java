//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        homework1();
    }
    //------------------------------------------------------------------------------------------------------------------
    public static void homework1(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadi tekstu!");
        String text = sc.nextLine();
        int textLen = text.length();

        System.out.println("Ievadītā teksta garums ir: " + textLen);

        if(textLen > 5){
            System.out.println("Programmēt ir forši!");
        }
        else{
            System.out.println("Teksts ir īsāks vai vienāds par 5 simboliem, bet Programmēt ir forši tik un tā!");
        }
    }
    //------------------------------------------------------------------------------------------------------------------
}