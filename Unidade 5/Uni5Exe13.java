import java.util.Scanner;

public class Uni5Exe13 {
    public Uni5Exe13() {
        Scanner scan = new Scanner(System.in);
        int numeroReabastecimentos;
        double quilometragemTotal,litrosTotal,quilometragemParcial,litrosAbastecidos,kmPorLitroParcial;

        // Ler o número de reabastecimentos
        System.out.print("Informe o número de reabastecimentos: ");
        numeroReabastecimentos = scan.nextInt();

        // Variáveis para acumular quilometragem e litros
         quilometragemTotal = 0;
         litrosTotal = 0;

        // Loop para processar cada reabastecimento
        for (int i = 1; i <= numeroReabastecimentos; i++) {
            // Ler quilometragem parcial e litros abastecidos
            System.out.print("Informe a quilometragem parcial (" + i + "): ");
             quilometragemParcial = scan.nextDouble();

            System.out.print("Informe os litros abastecidos (" + i + "): ");
             litrosAbastecidos = scan.nextDouble();

            // Calcular quilometragem por litro na parada atual
             kmPorLitroParcial = quilometragemParcial / litrosAbastecidos;
            System.out.println("Quilometragem por litro (" + i + "): " + kmPorLitroParcial);

            // Acumular quilometragem e litros totais
            quilometragemTotal += quilometragemParcial;
            litrosTotal += litrosAbastecidos;
        }
        
        // Calcular e exibir a quilometragem média por litro na viagem
        double kmMedioPorLitro = quilometragemTotal / litrosTotal;
        System.out.println("\nQuilometragem média por litro: " + kmMedioPorLitro);
        scan.close();
    }

    public static void main(String[] args) {
        new Uni5Exe13();
    }
}
