package danl.diego_u4_3101;
import javax.swing.JOptionPane;
public class MatrizCali {
    public static void main(String[] Diego){
        byte b,c,d;
        float p,r,t,y;
        byte ca[][]=new byte [5][5];
        String mat[]={"Cal.Dif","Mat.Dis","Fun.Pro","Fun.Inv","Quimica","Des.Sus"};
        String unid[]={"U1","U2","U3","U4","U5"};
        System.out.print("         ");
        for(d=0;d<5;d++){
            System.out.print(unid[d]+"    ");
        }
        System.out.print("Promedio");
        System.out.println();
        t=0;
        //impresion de materia y calificaion 
        for(c=0;c<6;c++){
            p=0;
            System.out.print(mat[c]);
            for(b=0;b<5;b++){
                ca[c][b]=Byte.parseByte(JOptionPane.showInputDialog("Ingresa "
                        + "tu calificación de esta Unidad"));
                System.out.print(" "+ca[c][b]+"   ");
                p+=ca[c][b];
            }
            r=p/5;
            System.out.print(r);
            System.out.println();
            t+=r;
        }
        for(b=0;b<23;b++){
            System.out.print(" ");
        }
        System.out.print("PROMEDIO FINAL ");
        y=(t/6);
        System.out.print(y);
    }
}
