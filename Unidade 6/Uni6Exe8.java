import java.util.Scanner;

public class Uni6Exe8 {
    public Uni6Exe8(){
        Scanner s = new Scanner(System.in);
        int n = 0;
        do {
            System.out.print("Digite o tamanho do vetor: ");
            n = s.nextInt();
        } while (n > 20);
        float numeros[] = new float[n];
        this.popular(numeros, s);
        this.imprimirValores(numeros);
        
        s.close();
    }
    private void imprimirValores(float[] numeros) {
        float numerosDiferentes[] = new float[numeros.length];
        int tamanho = 0;
       
        for (int i = 0; i < numeros.length; i++) {
            //popula os elementos no vetor 2:
            boolean achou = false;           
            for (int j = 0; j < tamanho; j++) {
                if (numeros[i] == numerosDiferentes[j]) {
                    achou = true;
                }
            }
            if (!achou) { //if ((achou == false) == true)
                numerosDiferentes[tamanho] = numeros[i];
                tamanho++;
            }
        }
        for (int i = 0; i < tamanho; i++) {
            int quantidadeRepeticao = 0;
            for (int j = 0; j < numeros.length; j++) {
                if (numerosDiferentes[i] == numeros[j]) {
                    quantidadeRepeticao++;
                }
            }
            System.out.println(numerosDiferentes[i] + " | " + quantidadeRepeticao);
        }
        System.out.println("Fim");
    }
    private void popular(float[] vetor, Scanner leitor) {
        for (int posicao = 0; posicao < vetor.length; posicao++) {
            System.out.print("Digite um número real[" + posicao + "]: ");
            vetor[posicao] = leitor.nextFloat();
        }
    }
    public static void main(String[] args) {
        new Uni6Exe8();
    }
}

