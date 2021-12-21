
import java.util.Random;
public class hamran {
    public static void main(String [] agrs){
        Random r=new Random();
        int x = r.nextInt(6)+1;
        System.out.println(x);
        double y = r.nextDouble();
        System.out.println(y);
        boolean z = r.nextBoolean();
        System.out.println(z);
    }
}
