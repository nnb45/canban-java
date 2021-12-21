import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        //co the thay doi bien
        //chua bien tham chieu
        //ArrayList<Interger>
        
        ArrayList<String> food = new ArrayList<String>();
        food.add("pizza");
        food.add("hamburger");
        food.add("hotdogs");
        //food. (method) 
        //set() de thay doi ki tu tai thu tu phan tu
        //remove() xoa ki tu tai thu tu phan tu
        //clear() xoa het array
        for(int i = 0; i < food.size(); i++){
            System.out.println(food.get(i));
        }
        /* 2d list
        them dong class o dau cac list
        ArrayList<ArrayList<String>> list_2d = new ArrayList();
        cuoi cac list
        day_2d.add(tenlist1);
        day_2d.add(tenlist2);
        day_2d.add(tenlist3);
        Sysout(list_2d); toan day
        Sysout(list_2d.get(2).get(0)); print phan tu 1 cua list 3     */
    }
}
