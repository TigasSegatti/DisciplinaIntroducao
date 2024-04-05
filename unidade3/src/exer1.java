import java.text.DecimalFormat;
import java.util.Scanner;

public class exer1 {
    public exer1(){
        double area, largura,comprimento;
        Scanner sc= new Scanner(System.in);
        System.out.println("Informe a largura: ");
        largura=sc.nextDouble();
        System.out.println("Inform o comprimento: ");
        comprimento=sc.nextDouble();
        area=comprimento*largura;
        DecimalFormat df= new DecimalFormat("0.0");
        System.out.println("Será uma área de : "+df.format(area)+"m2");
        
        sc.close();
    }
    public static void main(String[] args) {
        
    
    new exer1();
}
}
