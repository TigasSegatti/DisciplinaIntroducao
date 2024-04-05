import java.text.DecimalFormat;
import java.util.Scanner;

public class exer9 {
    public exer9(){
        Scanner scan= new Scanner(System.in);
        double volume,altura,raio;
        System.out.println("Informe o valor do raio: ");
        raio=scan.nextDouble();
        System.out.println("Informe o valor da altura: ");
        altura=scan.nextDouble();
        volume=Math.PI*Math.pow(raio,2)*altura;
        DecimalFormat df= new DecimalFormat();
        df.applyPattern("0.0");
        System.out.println("O valor do volume da lata de óleo será de: "+(df.format(volume))+" litros");
        scan.close();
    }
    public static void main(String[] args) {
        new exer9();
    }
}
