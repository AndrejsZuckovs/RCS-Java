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


        System.out.println("Cik skaitļus ievadīsi? ");
        int cnt = sc.nextInt();
        double[] array = new double[cnt+1];
        int count = 0;
        System.out.println("Sāc ievadīt double skaitļus : ");

        for(int i=1; i< array.length; i++) {
            System.out.print("Ievadi "+ i+ ". skaitli : ");
            array[i-1] = sc.nextDouble();
            count++;
            System.out.print("Lai beigtu ievadi x :");
            String finish = sc2.nextLine();

            if(finish.equals("X")){
                break;
            }
        }

        double avg = uzdevums2(array, count);
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
    public static double uzdevums2(double[] array, int cnt){
        double avg = 0;
        for (int i = 0; i < cnt; i++) {
            avg += array[i];
        }
        avg = avg/cnt;

        return  avg;
    }
    //------------------------------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------
}