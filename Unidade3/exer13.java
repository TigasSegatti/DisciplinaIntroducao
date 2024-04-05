import java.util.Scanner;

public class exer13 {
    public exer13(){
        Scanner scan= new Scanner(System.in);
        float comprimento, altura, area,tamanho,total;
        System.out.println("Informe o comprimento: ");
        comprimento=scan.nextFloat();
        System.out.println("informe a altura: ");
        altura=scan.nextFloat();
        area=altura*comprimento;
        tamanho=area*9;
        total=(float) (tamanho*12.50);
        System.out.println("O custo será de R$"+total+ ".para colocar os azuleijos.");
        scan.close();
    }
    public static void main(String[] args) {
        new exer13();
    }
}
