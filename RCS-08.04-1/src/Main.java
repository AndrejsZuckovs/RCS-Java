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
        Scanner sc = new Scanner(System.in);
        System.out.println("\u001B[33m 08-Aprīlis:  ✏\uFE0F\u001B[37m-"+"- ");
        System.out.println("\u001B[31m"+"┈➤ "  + "START");
        System.out.print("\u001b[37m\n");
        //--------------------------------------------------------------------------
        //boolean result = uzdevums1();
        //System.out.println(result);
        //teorija1();                     // Masīvi -> Array
        double result = uzdevums2();
        System.out.println("AVG: "+ result);
        //--------------------------------------------------------------------------
        System.out.println("\u001B[31m"+"┈➤ " + "END");
    }
    //------------------------------------------------------------------------------------------------------------------
    public static void teorija1(){
        Scanner sc = new Scanner(System.in);
        int[] m = new int[6];
        for(int i=0;i<m.length;i++){
            System.out.print("Ievadi skaitli: ");
            m[i]=sc.nextInt();
        }
        for(int i=0;i<m.length;i++){
            System.out.println("i["+i+"]: "+ m[i]);
        }
    }
    //------------------------------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------
    public static boolean uzdevums1() {
        Scanner sc = new Scanner(System.in);
        int number = 0;

            for (int i = 0; i < 5; i++) {
                System.out.println("Lūdzu ievadi skaitli: ");
                try{
                    number = sc.nextInt();
                    if (number == 28) {
                        return true;
                    }
                }
                catch(Exception e) {
                    System.err.println("Tika ievadīts ne skaitlis!");
                    sc.nextLine();      // Pabeidz skanēšanu! -> https://stackoverflow.com/a/26909638/22964124
                }
            }
        return false;
    }
    //------------------------------------------------------------------------------------------------------------------
    public static double uzdevums2() {
        Scanner sc = new Scanner(System.in);
        double[] m = new double[10];
        double avg = 0;
        int cnt = 1;

        System.out.println("Tev būs jāievada: " + m.length + " sakitļi.");

        for (int i = 0; i < m.length; i++) {
            System.out.println("Lūdzu ievadi " +cnt+". skaitli: ");
            cnt++;
            try{
                m[i] = sc.nextDouble();
                avg += m[i];
            }
            catch(Exception e) {
                System.err.println("Tika ievadīts ne skaitlis!");
                sc.nextLine();      // Pabeidz skanēšanu! -> https://stackoverflow.com/a/26909638/22964124
            }
        }
        avg = avg/m.length;

        return avg;
    }
    //------------------------------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------
}