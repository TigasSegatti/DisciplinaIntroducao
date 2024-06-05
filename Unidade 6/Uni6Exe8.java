import java.util.Scanner;

public class Uni6Exe8 {
    public Uni6Exe8(){
        Scanner scan = new Scanner(System.in);
        int N=-1;
        do{
            System.out.println("Informe um valor entre 0 a 20: ");
            N=scan.nextInt();
        }while(N<=0 ||N>=20);
        float vetor[]=new float[N];
        for(int i=0;i<vetor.length;i++){
            System.out.println("Informe um valor para armazenar: ");
            vetor[i]=scan.nextFloat();
        }
        float numerosDiferentes[] = new float[vetor.length];
        int tamanho = 0;
       
        for (int i = 0; i < vetor.length; i++) {
            //popula os elementos no vetor 2:
            boolean achou = false;           
            for (int j = 0; j < tamanho; j++) {
                if (vetor[i] == numerosDiferentes[j]) {
                    achou = true;
                }
            }
            if (!achou) { //if ((achou == false) == true)
                numerosDiferentes[tamanho] = vetor[i];
                tamanho++;
            }
        }

        for (int i = 0; i < tamanho; i++) {
            int quantidadeRepeticao = 0;
            for (int j = 0; j < vetor.length; j++) {
                if (numerosDiferentes[i] == vetor[j]) {
                    quantidadeRepeticao++;
                }
            }
            System.out.println(numerosDiferentes[i] + " | " + quantidadeRepeticao);
        }
        System.out.println("Fim");
        scan.close();


    }
    public void lerVetor(Scanner scan, float[] vetor, int n) {      
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Informe um valor para armazenar: ");
            vetor[i] = scan.nextFloat();
        }
    }
    public static void main(String[] args) {
        new Uni6Exe8();
    }
}

