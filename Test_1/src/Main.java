import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        task2();
    }

    public static void task2(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ievadiet 1. skaitli");
        int number1 = sc.nextInt();

        System.out.println("Ievadiet 2.skaitli");
        int number2 = sc.nextInt();

        System.out.println(number1 + number2);
        System.out.println(number1 - number2);
    }
}