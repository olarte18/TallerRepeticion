package capicua;

import javax.swing.JOptionPane;

public class Test 
{
    public static void main(String[] args) 
    {
        int a,i,b,d;
        a=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        i=0;
        b=a;
        while (b>0){
            d=b%10;
            i=i*10+d;
            b=b/10;
        }
        if (a==i) {
            JOptionPane.showMessageDialog(null, "El numero es capicua");
        }
        else {
            JOptionPane.showMessageDialog(null, "El numero no es capicua");
    }
    System.exit(0);

}

}