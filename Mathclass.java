import java.util.Scanner;
public class Mathclass {
    public static void main(String []args){
        double x = 3.14;
        double y = -10;
        double z = Math.abs(y);//Math. de hien day lenh 
        System.out.println(z);
        double a,b,c;
        Scanner h = new Scanner(System.in);
        System.out.println("nhap canh a");
        a = h.nextDouble();
        System.out.println("nhap canh b");
        b = h.nextDouble();
        c=Math.sqrt((a*a)+(b*b));
        System.out.println("canh huyen : "+c);
        h.close();
        
    }
}
