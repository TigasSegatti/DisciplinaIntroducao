import java.util.Scanner;

public class Uni5Exe7 {
    // Descreva um algoritmo que leia um número inteiro n e,
    // dados n números reais informe o maior e o menor número.
    public Uni5Exe7() {
        Scanner scanner = new Scanner(System.in);
        float numero,maior,menor;
        int n;
        System.out.print("Digite o número de valores a serem lidos: ");
         n = scanner.nextInt();
    
       System.out.print("Digite o 1º número: ");
       maior = scanner.nextFloat();
       menor = maior;
    
        for (int i = 2; i <= n; i++) {
            System.out.print("Digite o " + i + "º número: ");
             numero = scanner.nextFloat();
            
            if (numero > maior) {
                maior = numero;
            }
            
            if (numero < menor) {
                menor = numero;
            }
        }
        
        System.out.println("O maior número é: " + maior+"\nO menor número é: " + menor);        
        scanner.close();
    }

    public static void main(String[] args) {
        new Uni5Exe7();
    }
}
