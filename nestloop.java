<<<<<<< HEAD
import java.util.Scanner;

=======


import java.util.Scanner;


>>>>>>> 1aed2236fc2d568e3cc42f8a95ba8ee94665735f
public class nestloop {//loop nay trong loop kia
    public static void main(String[]agrs){
        try (Scanner h = new Scanner(System.in)) {
            int hang;
            int cot;
            String kitu = "";
            System.out.println("nhap so cot");
            cot = h.nextInt();
            System.out.println("nhap so hang");
            hang = h.nextInt();
            System.out.println("nhap ky tu");
            kitu = h.next();
            
            for(int i = 1; i <= cot; i++){
                System.out.println();
                for(int j = 1; j <= hang;j++){
                    System.out.print(kitu);
                }
            }
        }
    }
}
