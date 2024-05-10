import java.util.Scanner;

public class Uni5Exe26 {
    public Uni5Exe26() {
        Scanner scanner = new Scanner(System.in);

        // Ler o valor máximo de pedágio
        System.out.print("Valor máximo de pedágio: ");
        double valorMaximoPedagio = scanner.nextDouble();

        // Contadores para estatísticas
        int trechosAcimaValorMaximo = 0;
        int totalTrechos = 0;
        int trechosLongosValorAceito = 0;

        // Loop para processar os trechos
        while (true) {
            // Ler o valor do pedágio e a distância
            System.out.print("Pedágio (R$): ");
            double valorPedagio = scanner.nextDouble();

            if (valorPedagio < 0) {
                break; // Encerra o loop se valor do pedágio for negativo
            }

            System.out.print("Distância (km): ");
            double distancia = scanner.nextDouble();

            // Incrementar contadores
            totalTrechos++;

            // Verificar se o valor do pedágio excede o valor máximo
            if (valorPedagio > valorMaximoPedagio) {
                trechosAcimaValorMaximo++;
            }

            // Verificar se o trecho é longo e o valor do pedágio é aceitável
            if (distancia > 150 && valorPedagio <= valorMaximoPedagio) {
                trechosLongosValorAceito++;
            }
        }

        // Exibir os resultados
        System.out.println("\nResultados:");
        System.out.println("- Trechos acima do valor máximo: " + trechosAcimaValorMaximo);
        System.out.println("- Total de trechos: " + totalTrechos);
        System.out.println("- Trechos acima de 150km com valor aceito: " + trechosLongosValorAceito);
    scanner.close();
    }

    public static void main(String[] args) {
        new Uni5Exe26();
    }
}
