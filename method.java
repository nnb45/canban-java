public class method {
    public static void main(String[] args) {
        //method(chuc nang)
        String name = " hieu ";
        int age = 21;
        int high = 32;
        hello(name,age,high);// thu tu quyet dinh
        int x = 1;
        int y = 2;
        int z = cong(x,y);
        System.out.println("tong "+z);
    }
    //tao ra method cua minh
    static void hello(String a,int b,int c){
        System.out.println("hello"+a);
        System.out.println("you'er "+b);
        System.out.println("you "+c);
    }
    static int cong(int x, int y){
        int z = x + y;
        return z;


    }
}
