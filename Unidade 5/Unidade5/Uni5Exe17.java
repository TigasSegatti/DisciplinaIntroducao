/*Descreva um algoritmo que leia o número de inscrição e a altura de um atleta em uma competição e informe:
o número de inscrição e a altura do atleta mais alto;
o número de inscrição e a altura do atleta mais baixo;
a altura média do grupo de atletas.
A leitura deve ser finalizada ao digitar 0 para o número de inscrição.
 * 
 */

import java.util.Scanner;

public class Uni5Exe17 {
public Uni5Exe17(){
    int inscricao=1,contador=0;
    float altura,alturaMaior=0,alturaMenor=2.00f,media=0;
    Scanner s= new Scanner(System.in);
while (inscricao!=0) {
    System.out.println("informe a altura: ");
    altura=s.nextFloat();
    if (altura>alturaMaior) {
        alturaMaior=altura;
        media+=altura;
        contador++;
    }
    else if(altura<alturaMenor){
        alturaMenor=altura;
        media+=altura;
        contador++;

    }
    System.out.println("Informe o número de inscrição: ");
    inscricao=s.nextInt();

}
    s.close();
    System.out.println("Média da altura: "+media/contador);
    System.out.println("Maior altura: "+alturaMaior);
    System.out.println("Menor altura: "+alturaMenor);
    }
    public static void main(String[] args) {
        new Uni5Exe17();
    }
    
}
