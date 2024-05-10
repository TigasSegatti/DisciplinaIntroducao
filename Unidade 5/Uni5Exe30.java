import java.util.Scanner;

public class Uni5Exe30 {
    public Uni5Exe30() {
        Scanner scanner = new Scanner(System.in);
        String elementosMochila = "", elementosFora = "";
        int n = 0, k = 0, m = 0, somaMochila = 0, somaFora = 0;
        do {
            System.out.print("Digite o valor de N (tamanho da sequência): ");
            n = scanner.nextInt();
        } while (n < 0);
        do {
            System.out.print("Digite o valor de K (decremento): ");
            k = scanner.nextInt();
        } while (k < 0);
        do {
            System.out.print("Digite o valor de M (tamanho da mochila): ");
            m = scanner.nextInt();
        } while (m < 0);
        System.out.println("Os elementos para serem colocados na mochila são: ");
        while (n > 0) {
            System.out.println(n + " ");
            if (m > 0) {
                elementosMochila += n + ", ";
                somaMochila += n;
                m--;
            } else {
                elementosFora += n + ", ";
                somaFora+=n;
            }
            n -= k;
        }
        System.out.println();
        elementosMochila= elementosMochila.trim().substring(0,elementosMochila.length()-2);
        System.out.println("Elementos dentro da mochila: " + elementosMochila);
        elementosFora= elementosFora.trim().substring(0,elementosFora.length()-2);
        System.out.println("Elementos fora da mochila: " + elementosFora);
        System.out.println("Soma dos elementos que entraram na mochila: " + somaMochila);
        System.out.println("Soma dos elementos que não entraram na mochila: " + somaFora);
        scanner.close();
    }

    public static void main(String[] args) {
        new Uni5Exe30();
    }

}
