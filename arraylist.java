import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
        // co the thay doi bien
        // chua bien tham chieu
        // ArrayList<Interger>

        ArrayList<String> food = new ArrayList<String>();
        food.add("pizza");
        food.add("hamburger");
        food.add("hotdogs");
        // food. (method)
        // set() de thay doi ki tu tai thu tu phan tu
        // remove() xoa ki tu tai thu tu phan tu
        // clear() xoa het array
        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }
        /*
         * 2d list
         * them dong class o dau cac list
         * ArrayList<ArrayList<String>> list_2d = new ArrayList();
         * cuoi cac list
         * day_2d.add(tenlist1);
         * day_2d.add(tenlist2);
         * day_2d.add(tenlist3);
         * Sysout(list_2d); toan day
         * Sysout(list_2d.get(2).get(0)); print phan tu 1 cua list 3
         */

        int diem[][] = { { 1, 2 }, { 3, 4 }, { 5, 6 } }; // mang 2 chieu 3 dong 2 cot
        System.out.println("\nPhan tu o dong 2 cot 1 trong mang diem: " + diem[2][1]);

        // Nhap xuat phan tu cho mang
        int soDong, soCot; // khai báo số dòng, số cột của mảng

        try (Scanner input = new Scanner(System.in)) {
            // Nhập vào số cột và số dòng của mảng
            System.out.println("\nNhap so dong cua mang: ");
            soDong = input.nextInt();
            System.out.println("Nhap so cot cua mang: ");
            soCot = input.nextInt();

            // khai báo, cấp phát bộ nhớ cho mảng
            int[][] text = new int[3][4];

            // dùng 2 vòng lặp nhập giá trị cho mảng
            // vòng ngoài chạy i từ 0 --> soDong--
            // vòng trong chạy i từ 0 --> soCot--
            // mỗi lần sẽ nhập vào phần tử tại i, j
            for (int i = 0; i < soDong; i++) {
                for (int j = 0; j < soCot; j++) {
                    System.out.println("nhap phan tu thu [" + i + "," + j + "]: ");
                    text[i][j] = input.nextInt();
                }
            }
            // dùng 2 vòng lặp để hiển thị kết quả
            System.out.println("Mang vua nhap: ");
            for (int i = 0; i < soDong; i++) {
                for (int j = 0; j < soCot; j++) {
                    System.out.print(text[i][j] +  "\t");
                }
                System.out.println("\n");
            }
        }

    }
}
