import java.util.Random;

public class Games {
    public static Boolean guess(int a, int b, int c){
        Random rn = new Random();
        int gameNumber = rn.nextInt(15) + 1;

        System.out.println("Spēles cipars: "+ gameNumber);

        if(a== gameNumber){
            return true;
        }
        if(b == gameNumber){
            return true;
        }
        if(c == gameNumber){
            return true;
        }

        return false;
    }
}
