
import java.util.Scanner;
public class array {
    public static void main(String[]agrs){
        //thay doi du lieu mang
        String[] car = {"mec","toyota","mit"};
        car[0] = "tesna";
        System.out.println(car[0]);
        System.out.println(car[1]);
        System.out.println(car[2]);
        //nhap du lieu thu cong
        String[] cake = new String[3];
        cake[0]= "banh cuon";
        cake[1]= "vnesepancake";
        cake[2]= "duriancake";
        System.out.println(cake[0]);
        System.out.println(cake[1]);
        System.out.println(cake[2]);
        //nhap du lieu va in trong terminal
        Scanner h = new Scanner(System.in);
        String candy[] = new String[3];
        for(int i=0;i<candy.length;i++){
            System.out.println("nhap phan tu thu "+ i );
            candy[i] = h.nextLine();
        }
        System.out.println("Mang gom: ");
        for(int i=0;i<candy.length;i++){
            System.out.println(candy[i]);
        }
        /* tính tổng các phần tử có trong mảng
        for (int i = 0; i < n; i++) {
        int sum += array[i];
        }
         // sắp xếp theo thứ tự giảm dần
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j <= n - 1; j++) {
                if (array[i] < array[j]) {
                    tempSort = array[i];
                    array[i] = array[j];
                    array[j] = tempSort;
                }
            }
        }
        System.out.println("Mảng sau khi sắp xếp là: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "\t");*/
}
}
