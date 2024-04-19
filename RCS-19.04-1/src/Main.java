import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
        //Scanner sc = new Scanner(System.in);
        System.out.println("\u001B[33m 19-Aprīlis:  ✏\uFE0F\u001B[37m-"+"- List");
        System.out.println("\u001B[31m"+"┈➤ "  + "START");
        System.out.print("\u001b[37m\n");
        //--------------------------------------------------------------------------
//        Scanner scName = new Scanner(System.in);
//        List<String> studentList = new ArrayList<String>();
//        int studentCnt = 0;
//
//        System.out.println("Ievadi cik studentus ievadīsi:");
//        studentCnt = sc.nextInt();
//
//        System.out.println("Ievadi "+studentCnt+ " studentu vārdus!");
//        for(int i=0; i< studentCnt+1; i++){
//
//            studentList.add(sc.nextLine());
//        }
//        uzdevums1(studentList);
        //--------------------------------------------------------------------------
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        List<Double> array = new ArrayList<Double>();

        String finish = " ";

        while(!finish.equals("x")) {
            System.out.print("Ievadi skaitli : ");
            double num = sc.nextDouble();
            array.add(num);

            System.out.print("Lai beigtu ievadi x :");
            finish = sc2.nextLine();

        }

        double avg = uzdevums2(array);
        System.out.println("AVG: "+avg);
        //--------------------------------------------------------------------------
        System.out.println("\u001B[31m"+"┈➤ " + "END");
    }
    //------------------------------------------------------------------------------------------------------------------
    public static void teorija1(){
    }
    //------------------------------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------
    public static void uzdevums1(List<String>studenti){
        for(int j=0; j<studenti.size(); j++){
            System.out.println(studenti.get(j));
        }
    }
    //------------------------------------------------------------------------------------------------------------------
    public static double uzdevums2(List<Double>array){
        double avg = 0;
        for (int i = 0; i < array.size(); i++) {
            avg += array.get(i);
        }
        avg = avg/array.size();

        return  avg;
    }
    //------------------------------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------
}