
public class doi_x_qua_y {
    public static void main(String [] args){
        String x = "nuoc loc";
        String y = "sua";
        String tamthoi = null;
        System.out.println("x : " +x);
        System.out.println("y : " + y);
        tamthoi = x;
        x = y;
        y = tamthoi;
        System.out.println("x : " +x);
        System.out.println("y : " +y);
    }
}
