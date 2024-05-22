import java.util.Scanner;

public class Uni6Exe8 {
    public Uni6Exe8(){
        Scanner scan = new Scanner(System.in);
        
        
        
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

