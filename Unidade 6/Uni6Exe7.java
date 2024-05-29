import java.util.Scanner;

public class Uni6Exe7 {
    public Uni6Exe7() {
        Scanner scan = new Scanner(System.in);
        int tamanho;
        do {
            System.out.println("Informe o tamanho do vetor: ");
            tamanho = scan.nextInt();
            if (tamanho <= 0 || tamanho > 20) {
                System.out.println("Valor inválido! Por favor, informe um valor entre 1 e 20.");
            }
        } while (tamanho <= 0 || tamanho > 20);

        int vetor[] = new int[tamanho];
        int valor;

        // parte de inserir
        for (int i = 0; i < vetor.length; i++) {
            boolean existe = false;
            System.out.println("Informe um valor para inserir no vetor: ");
            valor = scan.nextInt();
            for (int j = 0; j < i; j++) {
                if (valor == vetor[j]) {
                    existe = true;
                    break;
                }
            }
            if (!existe) {
                vetor[i] = valor;
            } else {
                System.out.println("Valor já existente no vetor");
                i--;
            }
        }
        scan.close();
    }

    public static void main(String[] args) {
        new Uni6Exe7();
    }
}
