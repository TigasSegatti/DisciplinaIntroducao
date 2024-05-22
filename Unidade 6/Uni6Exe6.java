import java.util.Scanner;

public class Uni6Exe6 {
    public Uni6Exe6() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o tamanho do vetor: ");
        int n = scan.nextInt();
        float[] vetor = new float[n];  
        vetor = new float[n];
        this.lerVetor(scan,vetor, n);
        this.procurar(scan, vetor, n, false);
        scan.close();
    }

    public void lerVetor(Scanner scan, float[] vetor, int n) {      
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Informe um valor para armazenar: ");
            vetor[i] = scan.nextFloat();
        }
    
    }
    public void procurar(Scanner scan,float vetor[], float buscador, boolean encontrado){
        System.out.println("Informe um valor para procurar: ");
        buscador = scan.nextFloat();
        encontrado= false;
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i]==buscador){
                encontrado=true;
            }
        }
        if(encontrado){
            System.out.println("Encontrei");
        }
        else{
            System.out.println("Não encontrei");
        }
    }

    public static void main(String[] args) {
        new Uni6Exe6();
    }
}