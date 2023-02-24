package capital ;

import javax.swing.JOptionPane;

public class Test
{
    public static void main(String[] args) 
    {
     double c1, c2,c3,M;  
     c1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el capital de pedro: ")); 
     c2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el capital de juan: "));
     c3=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la inversion: "));
     M=0 ;
     while(c1+c2<c3)
     {
        c1*=1.03 ;
        c2*=1.04 ;
        M+=1 ;
     }
     JOptionPane.showMessageDialog(null, "Los meses que demoran son "+ M);
    }

}