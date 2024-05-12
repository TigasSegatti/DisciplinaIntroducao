import java.util.Scanner;

public class Uni5Exe14 {
    public Uni5Exe14() {
        Scanner scan = new Scanner(System.in);
        double totalCompra = 0.0, lucroTotal = 0.0, totalVenda = 0.0, precoCompra, precoVenda, lucroPercentual;
        int lucroEntre10e20 = 0, lucroMenos10 = 0, lucroMais20 = 0;
        String nome;
        for (int i = 1; i <= 20; i++) {
            System.out.println("Mercadoria " + i);
            System.out.print("Nome: ");
            nome = scan.next();

            System.out.print("Preço de compra: ");
            precoCompra = scan.nextDouble();
            totalCompra += precoCompra;

            System.out.print("Preço de venda: ");
            precoVenda = scan.nextDouble();
            totalVenda += precoVenda;
            lucroPercentual = ((precoVenda - precoCompra) / precoCompra) * 100;

            if (lucroPercentual < 10) {
                lucroMenos10++;
            } else if (lucroPercentual <= 20) {
                lucroEntre10e20++;
            } else {
                lucroMais20++;
            }
            lucroTotal += (precoVenda - precoCompra);

            System.out.println("Lucro percentual para " + nome + ": " + lucroPercentual + "%");
            System.out.println("----------------------------------");
        }
        System.out.println("\nResultados finais:");
        System.out.println("Total de compra: R$" + totalCompra);
        System.out.println("Total de venda: R$" + totalVenda);
        System.out.println("Lucro total: R$" + lucroTotal);
        System.out.println("Quantidade de mercadorias com lucro:");
        System.out.println("- Menos de 10%: " + lucroMenos10);
        System.out.println("- Entre 10% e 20%: " + lucroEntre10e20);
        System.out.println("- Mais de 20%: " + lucroMais20);
        scan.close();
    }

    public static void main(String[] args) {
        new Uni5Exe14();
    }

}
