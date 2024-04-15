import java.util.Scanner;

public class Uni4Exer24 {
    //Entrada: 3 valores
    //Saída: valores em uma ordem desejada
    // se opção = 1, escreva os 3 valores em ordem crescente
    // se opção = 2, escreva os 3 valores em ordem decrescente
    // se opção = 3, escreva os 3 valores de forma que o maior valor fique no meio
    public Uni4Exer24() {
        Scanner scan = new Scanner(System.in);
        int op, valor1 = 1, valor2 = 2, valor3 = 3, maior = 0, medio = 0, menor = 0;
        System.out.println("Escolha um número para valor 1: ");
        valor1 = scan.nextInt();
        System.out.println("Escolha um número para valor 2: ");
        valor2 = scan.nextInt();
        System.out.println("Escolha um número para valor 3: ");
        valor3 = scan.nextInt();
        if (valor1 > valor2) {  
            if (valor2 > valor3) {
                maior = valor1; // Armazena em ordem de valor
                medio = valor2;
                menor = valor3;
            } else if (valor3 > valor2) {
                maior = valor1;// Armazena em ordem de valor
                medio = valor3;
                menor = valor2;
            }
        }
        if (valor2 > valor1) {
            if (valor1 > valor3) {
                maior = valor2;// Armazena em ordem de valor
                medio = valor1;
                menor = valor3;
            } else if (valor3 > valor1) {
                maior = valor2;// Armazena em ordem de valor
                medio = valor3;
                menor = valor1;
            }
        }
        if (valor3 > valor2) {
            if (valor1 > valor2) {
                maior = valor3;// Armazena em ordem de valor
                medio = valor1;
                menor = valor2;
            } else if (valor2 > valor1) {
                maior = valor3;// Armazena em ordem de valor
                medio = valor2;
                menor = valor1;
            }
        }
        System.out.println("Escolha de 1 a 3");
        op = scan.nextInt();

        switch (op) {
            case 1:
                System.out.println("Opção 1: ");
                System.out.println(menor + "\n" + medio + "\n" + maior);
                break;
            case 2:
                System.out.println("Opção 2: ");
                System.out.println(maior + "\n" + medio + "\n" + menor);
                break;
            case 3:
                System.out.println("Opção 3: ");
                System.out.println(medio + "\n" + maior + "\n" + menor);
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
        scan.close();
    }

    public static void main(String[] args) {
        new Uni4Exer24();
    }
}
