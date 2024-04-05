import java.util.Scanner;

public class exer3 {

    public exer3(){
        Scanner sc= new Scanner(System.in);
        float precoLitro, valorPagamento, colocado;
        System.out.println("informe o preço do litro: ");
        precoLitro=sc.nextFloat();
        System.out.println("Informe o total pago: ");
        valorPagamento= sc.nextFloat();
        colocado=valorPagamento/precoLitro;
        System.out.println("O total colocado foi: "+colocado+" Litros");
        sc.close();
    }
    public static void main(String[] args) {
        new exer3();
    }
}
