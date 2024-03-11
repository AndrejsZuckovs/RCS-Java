import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Lūdzu ievadi simbolu virkni");
        String inText = sc.nextLine();
        String setText = "programmesana";

        if(inText.equals(setText)){
            System.out.println("Uzvarēji!");
            if(inText.length() == setText.length()){
                System.out.println("vienāds simbolu skaits!");
            }
            else{
                System.out.println("zaudēji");
            }
        }
        else{
            System.out.println("zaudēji");
        }
    }
}