import java.util.Arrays;
import java.util.Scanner;

public class Uni6Exe7 {
    int[] vetor;
    int quantidade;

    public Uni6Exe7() {
        Scanner scan = new Scanner(System.in);
        int N;
        do {
            System.out.print("Informe o tamanho do vetor (máximo 20): ");
            N = scan.nextInt();
        } while (N < 1 || N > 20);

        vetor = new int[N];
        quantidade = 0;

        while (quantidade < N) {
            System.out.print("Informe um número inteiro: ");
            int numero = scan.nextInt();
            if (!existeNoVetor(numero)) {
                vetor[quantidade] = numero;
                quantidade++;
            } else {
                System.out.println("O número " + numero + " já existe no vetor. Informe outro número.");
            }
        }

        ordenarVetor();
        exibirVetor();
        scan.close();
    }

    public void ordenarVetor() {
        Arrays.sort(vetor);
    }

    public void exibirVetor() {
        System.out.print("Vetor ordenado: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + (i < vetor.length - 1 ? " " : "\n"));
        }
    }

    public boolean existeNoVetor(int numero) {
        for (int i = 0; i < quantidade; i++) {
            if (vetor[i] == numero) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        new Uni6Exe7();
    }

}
