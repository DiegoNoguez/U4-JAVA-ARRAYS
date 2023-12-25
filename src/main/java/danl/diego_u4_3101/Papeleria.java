package danl.diego_u4_3101;
import javax.swing.JOptionPane;
public class Papeleria {
    public static void main(String[] Diego){
        byte y,x,i;
        byte precios[]=new byte[4];
        x=0;
        String encabezado[]={"HB","HF","PR","OM","TOTAL"};
        for(i=0;i<5;i++){
            System.out.print(encabezado[i]);
            System.out.print(" ");
        }
        System.out.println();
        for(y=0;y<4;y++){
            precios[y]=Byte.parseByte(JOptionPane.showInputDialog("Ingresa el"
                    + " costo"));
            System.out.print(precios[y]+"  ");
            x+=precios[y];
        }
        System.out.print(x);
    }
}
