
import java.util.Scanner;
<<<<<<< HEAD

=======
>>>>>>> 1aed2236fc2d568e3cc42f8a95ba8ee94665735f
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
