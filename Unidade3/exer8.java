import java.text.DecimalFormat;
import java.util.Scanner;

public class exer8 {
    public exer8(){
        double qtdDolar,total;
        Scanner sc= new Scanner(System.in);
        System.out.println("Informe a quantidade de dólares entregues: ");
        qtdDolar=sc.nextFloat();
        total=(qtdDolar/5.25);
        DecimalFormat df= new DecimalFormat("0.0");
        System.out.println("O total a ser devolvido será de: "+df.format(total));   
        
        sc.close();
    }public static void main(String[] args) {
        new exer8();
    }
}
