
import java.util.Scanner;
public class whileloop {
    public static void main (String[]agrs){
        try (Scanner h = new Scanner(System.in)) {
            String name = "";
            while(name.isEmpty()){
                System.out.println("Nhap ten cua ban: ");
                name = h.nextLine();
                }
            System.out.println("Hello "+name );
        }
    }
}
