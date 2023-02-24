package factorial;
import javax.swing.JOptionPane;
public class Test
{
    public static void main(String[] args) 
    {
        int a,b,c;
        
        a=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        b=a ;
        c=a ;
        while(b!=1)
        {
            b-=1 ;
            a*=b ;
        }
        JOptionPane.showMessageDialog(null, ("EL FACTORIAL DE "+c+ " ES "+a));
    }
}