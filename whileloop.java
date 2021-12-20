package hocjava0;

import java.util.Scanner;

/**
 *
 * @author HieuPham
 */
public class whileloop {
    public static void main (String[]agrs){
        Scanner h = new Scanner(System.in);
        String name = "";
        while(name.isEmpty()){
            System.out.println("Nhap ten cua ban: ");
            name = h.nextLine();
            }
        System.out.println("Hello "+name );
    }
}
