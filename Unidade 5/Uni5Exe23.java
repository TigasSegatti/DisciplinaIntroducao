import java.util.Scanner;

public class Uni5Exe23 {
public Uni5Exe23(){
 Scanner scanner = new Scanner(System.in);
    double totalVendas = 0,precoUnitario,salario;
    String nomeVendedor,resposta;
        boolean continuar = true;

        while (continuar) {
            System.out.print("Digite o nome do vendedor: ");
             nomeVendedor = scanner.next();

            System.out.print("Digite o número total de produtos vendidos por " + nomeVendedor + ": ");
            int numProdutos = scanner.nextInt();
            
            for (int i = 1; i <= numProdutos; i++) {
                System.out.print("Digite o preço unitário do produto " + i + ": ");
                 precoUnitario = scanner.nextDouble();

                System.out.print("Digite a quantidade vendida do produto " + i + ": ");
                int quantidade = scanner.nextInt();

                totalVendas += precoUnitario * quantidade;
            }
             salario = totalVendas * 0.30;

            System.out.println("\nRelatório para o vendedor " + nomeVendedor + ":");
            System.out.println("Total de vendas: R$" + totalVendas);
            System.out.println("Salário: R$" + salario);

            System.out.print("\nDeseja digitar os dados de mais um vendedor? (s/N): ");
            scanner.nextLine(); 
            resposta = scanner.next();
            continuar = resposta.equalsIgnoreCase("s");
        }

        System.out.println("Fim do relatório.");
        scanner.close();
    }
    public static void main(String[] args) {
        new Uni5Exe23();
    }
}
