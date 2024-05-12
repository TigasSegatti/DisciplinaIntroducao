import java.util.Scanner;

public class Uni5Exe12 {
    public Uni5Exe12() {
        Scanner scan = new Scanner(System.in);
        int n, contador;
        System.out.print("Digite um número inteiro positivo: ");
        n = scan.nextInt();
        if (n <= 0) {
            System.out.println("Por favor, insira um número inteiro positivo.");
        } else {
            contador = 1;
            for (int i = 1; i <= n; i++) {

                for (int j = 0; j < i; j++) {
                    System.out.print(contador + " ");
                    contador++;
                    scan.close();
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        new Uni5Exe12();
    }

}
