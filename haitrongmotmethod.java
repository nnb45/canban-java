public class haitrongmotmethod {
    public static void main(String[] args) {
        int x = cong(1,2);
        //int x = cong(1,2,3);
        //int x = cong(1,2,3,4);
        //double x = cong(1.0,2.0);
        //double x = cong(1.0,2.0,3.0);
        //double x = cong(1.0,2.0,3.0,4.0);
        System.out.println(x);
    }
    static int cong(int a,int b){
        return a+b;
    }
    static int cong(int a,int b,int c){
        return a+b+c;
    }
    static int cong(int a,int b,int c,int d){
        return a+b+c+d;
    }
    static double cong(double a,double b){
        return a+b;
    }
    static double cong(double a,double b,double c){
        return a+b+c;
    }
    static double cong(double a,double b,double c,double d){
        return a+b+c+d;
    }

}
