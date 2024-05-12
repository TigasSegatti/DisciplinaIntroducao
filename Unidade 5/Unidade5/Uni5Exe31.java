import java.util.Scanner;

public class Uni5Exe31 {
    public Uni5Exe31() {
        Scanner scan = new Scanner(System.in);
        int numero,valorAtual;
        System.out.print("Digite um número inteiro positivo: ");
         numero = scan.nextInt();
         valorAtual = numero;

        System.out.println("número\tdecomposição");

        int divisor = 2;
        while (valorAtual > 1) {

            if (valorAtual % divisor == 0) {
                System.out.println(valorAtual + "\t" + divisor);
                valorAtual /= divisor;
            } else {
                divisor++;
            }
        }
        System.out.println("1");
        scan.close();
    }

    public static void main(String[] args) {
        new Uni5Exe31();
    }
}
