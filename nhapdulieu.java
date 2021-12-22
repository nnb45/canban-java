
import java.util.Scanner;

public class nhapdulieu {
    public static void main(String [] args){
     try (Scanner scanner = new Scanner(System.in)) {
        System.out.println(" what 's your name: ");
         String name = scanner.nextLine();
         System.out.println("hello "+name);
         
         System.out.println("how old are you ");
         int age = scanner.nextInt();
         System.out.println("you are "+age+" years old");
         
         scanner.nextLine(); //require
         System.out.println("what's your favorite food?");
         String food = scanner.nextLine();
         System.out.println("you like "+food);
    }
     
             
    }
    
}
// ẹkfhewkfhewofhaslfbdnaskufgew
