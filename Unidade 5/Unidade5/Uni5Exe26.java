import java.util.Scanner;

public class Uni5Exe26 {
    public Uni5Exe26() {
        Scanner scan = new Scanner(System.in);
        double valorMaximoPedagio, valorPedagio = 1;
        int trechosAcimaValorMaximo = 0, totalTrechos = 0, trechosLongosValorAceito = 0;
        System.out.print("Valor máximo de pedágio: ");
        valorMaximoPedagio = scan.nextDouble();
        while (valorPedagio > 0) {
            System.out.print("Pedágio (R$): ");
            valorPedagio = scan.nextDouble();

            if (valorPedagio > 0) {
                System.out.print("Distância (km): ");
                double distancia = scan.nextDouble();

                totalTrechos++;

                if (valorPedagio > valorMaximoPedagio) {
                    trechosAcimaValorMaximo++;
                }

                if (distancia > 150 && valorPedagio <= valorMaximoPedagio) {
                    trechosLongosValorAceito++;
                }
            } else {
                valorPedagio = 0;
            }

        }
        System.out.println("\nResultados:");
        System.out.println("- Trechos acima do valor máximo(Que ele se recusa a pagar): " + trechosAcimaValorMaximo);
        System.out.println("- Total de trechos informados: " + totalTrechos);
        System.out.println("- Trechos acima de 150km com valor aceito: " + trechosLongosValorAceito);
        scan.close();
    }

    public static void main(String[] args) {
        new Uni5Exe26();
    }
}
