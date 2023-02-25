package numeroprimo ;

import javax.swing.JOptionPane;

public class Test 
{
    public static void main(String[] args) {
        int a ,i ;
        a=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));

        for(i=2;i<=a/2;i++)
        {
            if(a%i==0){
        
            JOptionPane.showMessageDialog(null, "el numero no es primo ");
            return;
            }
        }
        JOptionPane.showMessageDialog(null, "el numero es primo ");
        
        System.exit(0);
        
        
    }
}