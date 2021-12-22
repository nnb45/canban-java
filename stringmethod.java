public class stringmethod {
    public static void main(String[] args) {
        String name = "hieu   ";
        //boolean kq=name.equals("hieu"); true
        //int kq = name.length(); do dai cua str
        //char kq = name.charAt(0); chu cai dau tien trong str
        //int kq = name.indexOf("o"); thu tu cua chu o 
        //boolean kq = name.isEmpty(); false
        //String kq = name.toUpperCase(); viet hoa toan bo
        //String kq = name.toLowerCase(); viet thuong toan bo
        //String kq = name.trim(); xoa dau cach
        String kq = name.replace('u','e' );//thay doi u thanh e
        
        System.out.println(kq);
    
    }
}
