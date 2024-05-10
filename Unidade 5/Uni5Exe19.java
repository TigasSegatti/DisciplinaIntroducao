import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe19 {
    public Uni5Exe19(){
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        double totalLoja = 0.0,valorCompra,valorAPagar,desconto;

        System.out.println("Insira o valor da compra (0 para sair):");
        valorCompra = scan.nextDouble();

        while (valorCompra != 0) {
            desconto = valorCompra > 500 ? 0.20 : 0.15;
            valorAPagar = valorCompra * (1 - desconto);
            totalLoja += valorAPagar; 
            System.out.println("Valor da compra: R$ " + df.format(valorCompra));
            System.out.println("Desconto: " + (int)(desconto * 100) + "%");
            System.out.println("Total a pagar: R$ " + df.format(valorAPagar));
            System.out.println("Insira o valor da próxima compra (0 para sair):");
            valorCompra = scan.nextDouble(); 
        }

        System.out.println("Total recebido pela loja ao final do dia: R$ " + df.format(totalLoja));

        scan.close(); 
    }
    public static void main(String[] args) {
        new Uni5Exe19();
    }
    
}
