import java.util.Scanner;

public class Uni5Exe32 {
    public Uni5Exe32() {
        Scanner scan = new Scanner(System.in);
        int primeiroDiaSemana, qtdDiasMes;
        System.out.print("Informe o dia da semana do primeiro dia do mês (1=Domingo, 2=Segunda,...,7=Sábado): ");
        primeiroDiaSemana = scan.nextInt();
        System.out.print("Informe o número de dias do mês: ");
        qtdDiasMes = scan.nextInt();

        // Dias da semana
        System.out.println("Dom Seg Ter Qua Qui Sex Sab");

        // Variável ser o dia atual
        int diaAtual = 1;
        // Loop para imprimir as linhas
        while (diaAtual <= qtdDiasMes) {
            // Loop para imprimir os dias da semana
            int diaSemana = 1;
            while (diaSemana <= 7) {
                // Imprime os espaços até chegar ao primeiro dia do mês
                // Se dia da semana é menor que o dia começa e o dia atual é igual
                if (diaSemana < primeiroDiaSemana && diaAtual == 1) {
                    System.out.print("    "); // Imprime espaço
                } else {
                    // Imprimir o dia atual
                    // Se o dia atual é menor que a quantidade de dias dos meses
                    if (diaAtual <= qtdDiasMes) {
                        // Se dia atual é menor que 10
                        if (diaAtual < 10) {
                            // Imprime espaço
                            System.out.print(" ");
                        }
                        // Senão imprime o dia atual e espaço
                        System.out.print(diaAtual + "  ");
                    } else {
                        // Se ultrapassou o número de dias do mês, imprime espaços em branco
                        System.out.print("    ");
                    }
                    // Incrementa o dia atual
                    diaAtual++;
                }
                // Incrementa o dia da semana
                diaSemana++;
            }
            // Quebra de linha para começar uma nova linha do calendário
            System.out.println();
        }
        scan.close();
    }

    public static void main(String[] args) {
        new Uni5Exe32();
    }
}
