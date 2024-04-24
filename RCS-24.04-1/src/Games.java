import java.util.Random;
import java.util.Random;
public class Games {
    public static Boolean guess(int myNumber){
        Random rn = new Random();
        int gameNumber = rn.nextInt(15) + 1;

        System.out.println("Spēles cipars: "+ gameNumber);
        System.out.println("Mans   cipars: "+ myNumber);

        if(myNumber == gameNumber){
            return true;
        }
        return false;
    }
}
