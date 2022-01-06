import java.util.Scanner;
import java.io.PrintStream;
import java.lang.Math;
public class test{
    static Scanner scanner = new Scanner(System.in);
    static void cau1(){
        scanner.nextLine();
        System.out.print("ho va ten : \n");
        String hoTen = scanner.nextLine();
        System.out.print("Diem TB: \n");
        double diemTB = scanner.nextDouble();
        System.out.printf("%s %f diem",hoTen,diemTB);
    }
    static void cau2(){
        System.out.println("nhap chieu dai cua hinh chu nhat: ");
        int a = scanner.nextInt();
        System.out.println("nhap chieu rong cua hinh chu nhat");
        int b = scanner.nextInt();
        int c=(a+b)*2; int d=a*b; int e=Math.min(a,b);
        System.out.printf(" Chu vi : %d \n Dien tich : %d \n Canh nho nhat : %d",c,d,e);
    }
    static void cau3(){
        System.out.println("nhap canh cua khoi lap phuong : ");
        double x = scanner.nextDouble();
        float y = (float) Math.pow(x,3);
        System.out.println("the tich lap phuong la: "+y);
    }
    static void cau4(){
        double Delta;
        int a, b, c;
        System.out.println("Nhap a =");
        a = scanner.nextInt();
        System.out.println("Nhap b =");
        b = scanner.nextInt();
        System.out.println("Nhap c =");
        c = scanner.nextInt();
        
        Delta = Math.pow(b,2) - 4*a*c;
        System.out.println("Delta = "+Delta);  
        System.out.println("Can Delta = "+Math.sqrt(Delta));

    }
    static void Menumethod(){
        System.out.println("\nNhap cau : ");
        int Menu;
        do {Menu = scanner.nextInt();}
        while((Menu<1)||(Menu>4));
        switch(Menu){
            case 1: System.out.println("cau 1");
            cau1();
            Menumethod();
            break;
            case 2: System.out.println("cau 2");
            cau2();
            Menumethod();
            break;
            case 3: System.out.println("cau 3");
            cau3();
            Menumethod();
            break;
            case 4: System.out.println("cau 4");
            cau4();
            Menumethod();
            break;
            default:System.out.println(" ");
    }
}
    
    public static void main(String[] args) {
        Menumethod();
}
}