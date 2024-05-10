import java.util.Scanner;

public class Uni5Exe34 {
    public Uni5Exe34() {
        Scanner scan = new Scanner(System.in);
        int op = 0, dias, contasEncerradas = 0;
        float total;
        String nome;
        do {
            System.out.println("Informe o que deseja fazer: ");
            System.out.println("1)Encerrar a conta de um hóspede\n2)Verificar número de contas encerradas" +
                    "\n3)Sair");
            op = scan.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Informe o nome do hóspede: ");
                    nome = scan.next();
                    System.out.println("Informe a quantidade de dias hospedados:  ");
                    dias = scan.nextInt();
                    if (dias > 15) {
                        total = dias * 7.50f;
                    } else if (dias == 15) {
                        total = dias * 6.50f;
                    } else {
                        total = dias * 5.00f;
                    }
                    contasEncerradas++;
                    System.out.println("Hóspede:" + nome + "\nTotal a pagar: " + total);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Total de contas encerradas no momento: " + contasEncerradas);
                    System.out.println();
                    break;
                case 3:
                    op = 3;
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }

        } while (op != 3);

        scan.close();

    }

    public static void main(String[] args) {
        new Uni5Exe34();
    }
}
