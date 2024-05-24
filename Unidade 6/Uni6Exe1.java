import java.util.Scanner;

public class Uni6Exe1 {
    public Uni6Exe1() {
        Scanner scan = new Scanner(System.in);
        int numeros[] = new int[10];
        this.lerValores(scan, numeros);
       this.exibirVetor(numeros);
        scan.close();
    }
/////// Aqui pode colocar 
    public void lerValores(Scanner scan,int[] numeros){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Informe um valor para guardar no index " + i);
            numeros[i]=scan.nextInt();
        }
    }

    public void exibirVetor(int [] vetor){
        for(int i= vetor.length-1;i>=0;i--){
            System.out.println("index: "+i+" valor guardado: "+vetor[i]);
        }
    }

    public static void main(String[] args) {
        new Uni6Exe1();
    }

    /////////
}
