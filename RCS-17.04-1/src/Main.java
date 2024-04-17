import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import  java.util.List;


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
        System.out.println("\u001B[33m 17-Aprīlis:  ✏\uFE0F\u001B[37m-"+"- List");
        System.out.println("\u001B[31m"+"┈➤ "  + "START");
        System.out.print("\u001b[37m\n");
        //--------------------------------------------------------------------------
        int[] masivs1 = {5,2,3,4,5,6,7,8,9,10};
        int[] masivs2 = {1,2,3,4,5,6,7,5,9,10};
        int[] masivs3 = {1,2,3,4,4,6,7,7,9,10};
        int[] masivs4 = {5,5,5,5,5,5};
        int[] masivs5 = {7,7,7};
        //int[] numbers = {1, 4, 7, 2, 9, 4, 6};
        int[] numbers = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        //piemers1();
        //teorija1(masivs);
        //uzdevums1(masivs);
//        uzdevums2(masivs1, 5);
//        uzdevums2(masivs2, 5);
//        uzdevums2(masivs3, 5);
//        uzdevums2(masivs4, 5);
//        uzdevums2(masivs5, 5);
        //teorija2();
        uzdevums3(numbers);
        //--------------------------------------------------------------------------

        System.out.println("\u001B[31m"+"┈➤ " + "END");
    }
    //------------------------------------------------------------------------------------------------------------------
    public static void piemers1(){
        int maxVal = Integer.MIN_VALUE;
        int[] numbers = new int[10];
        Random r = new Random();
        for(int i=0; i<numbers.length;i++) {
            numbers[i] = r.nextInt((99 - 1 + 1) + 1);
            if (maxVal < numbers[i]) {
                maxVal = numbers[i];
            }
            System.out.println(numbers[i] + " ");
        }
        System.out.println("Max: " + maxVal);
    }
    //------------------------------------------------------------------------------------------------------------------
    public static void teorija1(int[] a){
        System.out.println(a.length);
    }
    //------------------------------------------------------------------------------------------------------------------
    public static void teorija2(){
        List<String> strList = new ArrayList<String>();
        System.out.println(strList.size());
        strList.add("aaa");
        strList.add("bbb");
        System.out.println(strList.size());
        System.out.println(strList.get(0));
        System.out.println(strList.get(1));

    }
    //------------------------------------------------------------------------------------------------------------------
    public static void uzdevums1(int[] numbers){
        System.out.println("Tiks izvadīti masīva " + numbers.length + " elementi:");
        for(int i=0; i<numbers.length; i++){

            System.out.print("Elements [" +i+ "]: "+numbers[i] + "\n");
        }
    }
    //------------------------------------------------------------------------------------------------------------------
    public static void uzdevums2(int[] array, int number){
        System.out.println("Masīvā ar " + array.length + " elementiem tiek meklēts skaitlis : "+ number);
        int flag = 0;
        for(int i=0; i<array.length; i++){
            if(array[i] == number) {
                System.out.println("Masīva " + i + ". elements sakrīt!");
                flag++;
            }
        }
        if(flag > 0){
            System.out.println("Masīvā tika atrasti : " + flag+ " elementi, kuri vienādi ar " + number);
        }
        else{
            System.out.println("Masīvā netika atrasts skaitlis " + number);
        }
        System.out.println("--------------------------------");
    }
    //------------------------------------------------------------------------------------------------------------------
    public static void uzdevums3(int[] array){
        List<Integer> intList = new ArrayList<Integer>();

        for(int i=0; i<array.length; i++){
            intList.add(array[i]);
        }
        for(int i=0; i<intList.size(); i++) {
            System.out.print(intList.get(i) + " ");
        }
        System.out.print("\n");
        for(int i=intList.size()-1; i>-1; i--){
            System.out.print(intList.get(i) + " ");
        }
        System.out.print("\n");
    }
    //------------------------------------------------------------------------------------------------------------------
}