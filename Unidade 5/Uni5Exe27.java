import java.util.Scanner;

public class Uni5Exe27 {
    public Uni5Exe27() {
        Scanner scanner = new Scanner(System.in);

        int dia = 0, producaoManha = 0, producaoTarde = 0,
                maiorProducaoDia = -1, maiorProducaoQuantidade = 0,
                producaoManhaTotal = 0, producaoTardeTotal = 0;

        boolean maisFuncionarios = true;

        while (maisFuncionarios) {
            while (true) {
                System.out.print("Digite o dia do mês de abril (1 a 30): ");
                dia = scanner.nextInt();
                if (dia >= 1 && dia <= 30) {
                    break;
                } else {
                    System.out.println("Dia inválido");
                }
            }

            System.out.print("Produção no turno da manhã: ");
            producaoManha = scanner.nextInt();

            System.out.print("Produção no turno da tarde: ");
            producaoTarde = scanner.nextInt();

            int producaoTotal = producaoManha + producaoTarde;
            double valorRecebido = 0.0;

            if (dia >= 1 && dia <= 15) {
                if (producaoTotal > 100 && producaoManha >= 30 && producaoTarde >= 30) {
                    valorRecebido = producaoTotal * 0.80;
                } else {
                    valorRecebido = producaoTotal * 0.50;
                }
            } else if (dia >= 16 && dia <= 30) {
                valorRecebido = (producaoManha * 0.40) + (producaoTarde * 0.30);
            }

            System.out.printf("R$ %.2f (valor recebido)\n", valorRecebido);

            if (producaoTotal > maiorProducaoQuantidade) {
                maiorProducaoDia = dia;
                maiorProducaoQuantidade = producaoTotal;
            }

            producaoManhaTotal += producaoManha;
            producaoTardeTotal += producaoTarde;

            System.out.println("Novo funcionário: (1.sim 2.não)?");
            int resposta = scanner.nextInt();

            if (resposta != 1) {
                maisFuncionarios = false;
            }
        }

        if (producaoManhaTotal > producaoTardeTotal) {
            System.out.println("O turno com maior produção é o da manhã com " + producaoManhaTotal + " peças.");
        } else {
            System.out.println("O turno com maior produção é o da tarde com " + producaoTardeTotal + " peças.");
        }

        if (maiorProducaoDia != -1) {
            System.out.println("O dia com a maior produção foi o dia " + maiorProducaoDia);
        }

        scanner.close();
    }

    public static void main(String[] args) {

        new Uni5Exe27();
    }
}
