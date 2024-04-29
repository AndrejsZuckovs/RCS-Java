
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class Tools {
    public static List<Integer>  number(boolean flag){
        Random rn = new Random();
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();

        if(flag){
            System.out.println("Ievadi 10 skaitļus:");
            for(int i=0; i<10;i++){
                numbers.add(Integer.valueOf(sc.nextInt()));
            }
        }
        else{
            System.out.println("10 skaitļi tiks uzģenerēti!");
            for(int i=0; i<10;i++){
                numbers.add(Integer.valueOf(rn.nextInt(100) + 1));
            }
        }
        return numbers;
    }
}
