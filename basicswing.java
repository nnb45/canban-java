package hocjava0;
import javax.swing.JOptionPane;
//GUI Graphical User Interface Giao dien truc quan
public class basicswing {
 public static void main (String[] agrs){
    String name = JOptionPane.showInputDialog("Nhap ten cua ban");
    JOptionPane.showMessageDialog(null,"Chao " +name);
    int age = Integer.parseInt(JOptionPane.showInputDialog("Nhap tuoi cua ban"));
    JOptionPane.showMessageDialog(null,"Ban " +age+ " tuoi ");
    double chieucao = Double.parseDouble(JOptionPane.showInputDialog("Nhap chieu cao cua ban"));
    JOptionPane.showMessageDialog(null,"Ban cao " +chieucao+ " cm ");
    
 }
}
