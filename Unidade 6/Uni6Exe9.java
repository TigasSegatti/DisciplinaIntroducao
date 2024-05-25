import java.util.Scanner;

public class Uni6Exe9 {
    public Uni6Exe9() {
    Scanner scan= new Scanner(System.in);
    int[] sexos = new int[30];
    int[] notas = new int[30];
    int[] idades = new int[30];
    this.lerDados(scan, sexos, notas, idades);


    scan.close();
    }
    public void lerDados(Scanner scan,int sexos[], int notas[],int idades[]){
        for (int i = 0; i < 30; i++) {
            System.out.println("Digite o sexo do cliente (1=feminino, 2=masculino):");
            sexos[i] = scan.nextInt();
            System.out.println("Digite a nota do cliente (0 a 10):");
            notas[i] = scan.nextInt();
            System.out.println("Digite a idade do cliente:");
            idades[i] = scan.nextInt();
        }

    }

    public static void main(String[] args) {
        new Uni6Exe9();
    }
}
