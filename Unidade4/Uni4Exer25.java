import java.util.Scanner;
//Entrada: ler opção do menu 
//Saída: Executar uma das opções
/*1 - Soma de dois números.
2 - Diferença entre dois números.
3 - Produto entre dois números.
4 - Divisão entre dois números (o denominador não pode ser zero). */

public class Uni4Exer25 {
    public Uni4Exer25() {
        Scanner scan = new Scanner(System.in);
        int opcao;
        System.out.println("Informe uma opção");
        System.out.println("1 - Soma de dois números.");
        System.out.println("2 - Diferença entre dois números.");
        System.out.println("3 - Produto entre dois números.");
        System.out.println("4 - Divisão entre dois números (o denominador não pode ser zero)");
        opcao = scan.nextInt();
        switch (opcao) {
            case 1:
                int num1, num2;
                System.out.println("Informe um número: ");
                num1 = scan.nextInt();
                System.out.println("Informe outro número : ");
                num2 = scan.nextInt();
                System.out.println("A soma dos dois números será: " + (num1 + num2) + ".");

                break;
            case 2:
                System.out.println("Informe um número: ");
                num1 = scan.nextInt();
                System.out.println("Informe outro número : ");
                num2 = scan.nextInt();
                System.out.println("A diferença entre dois números será: " + (num1 - num2) + ".");
                break;
            case 3:
                System.out.println("Informe um número: ");
                num1 = scan.nextInt();
                System.out.println("Informe outro número : ");
                num2 = scan.nextInt();
                System.out.println("O produto entre dois número será: " + (num1 * num2) + ".");
                break;
            case 4:
                float numerador, denominador;
                System.out.println("Informe o valor do denominador: ");
                denominador = scan.nextFloat();
                System.out.println("Informe o valor do numerador: ");
                numerador = scan.nextFloat();
                if (denominador != 0) { // Verifica se o denominador é zero
                    System.out.println("A divisão por estes número será: " + (numerador / denominador));
                } else {
                    System.out.println("Denominador informado é zero.");
                }
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

        scan.close();
    }

    public static void main(String[] args) {
        new Uni4Exer25();
    }
}
