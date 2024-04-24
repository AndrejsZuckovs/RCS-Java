import java.util.Random;

public class Games {
    public static Boolean guess(int[] myNumber){
        Random rn = new Random();
        int gameNumber = rn.nextInt(15) + 1;

        System.out.println("Spēles cipars: "+ gameNumber);

        for(int i=0; i<myNumber.length; i++){
            System.out.println("Vai "+myNumber[i]+" == "+ gameNumber +" ?");
            if(myNumber[i] == gameNumber){
                return true;
            }
        }
        return false;
    }
}
