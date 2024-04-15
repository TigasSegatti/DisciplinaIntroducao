//Entrada: Numero de 1 a 3 
//Saída: Titulo recebido após concluir a graduação
//Algortimo :
//Ler escolha
//switch(escolha)
//caso 1 : Escreva("Ciência da computação")
//caso 2 : Escreva("Licenciatura da Computação")
//caso 3 : Escreva("Bacharel em Sistemas de Informação")

import java.util.Scanner;

public class Uni4Exer22 {
    public Uni4Exer22() {
        Scanner scan = new Scanner(System.in);
        int escolha;
        System.out.println("Informe o número de 1 a 3 :");
        escolha = scan.nextInt();
        switch (escolha) {
            case 1:
                System.out.println("Bacharel em Ciência da computação");
                break;
            case 2:
                System.out.println("Licenciatura da Computação");
                break;
            case 3:
                System.out.println("Bacharel em Sistemas de Informação");
                break;
            default:
                System.out.println("Escolha inválida");
                break;
        }
        scan.close();
    }

    public static void main(String[] args) {
        new Uni4Exer22();
    }
}
