import java.awt.Color;
import javax.swing.*;
/*
Kodlari Yazilan Sira Ile Yazmaga Diqqet Edin
Eks Teqdirde Xeta Almaq Qacinilmaz Ola Biler
Ve ya bezi Funksiyalar Calismaz Hala Gele Biler
*/
public class Pencere {
    public static void main(String[] args) {
         // Pencereni duzeltmek ucun "JFrame" clasindan Obyekt duzeltdik;
        //  (" ")-isaresi icinde yazdigimiz setir pencere basligi ve ya adidir;       
        JFrame jfr=new JFrame("Pencere adi");  
             jfr.setSize(250,150);    // Ilk olaraq Pencerenin enini ve hundurluyunu beyan edek;
             jfr.getContentPane().setBackground(Color.PINK); //Pencerenin rengini Beyan Etdik;
             jfr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Pencereni baglamaq Ucun 'x' duymesini aktiv edirik;
//  set.Visible metodunu cagirib 'true' deyerini vermek lazimdir   ki, Penceremiz Gorunsun;
            jfr.setVisible(true);
    }
    
}
