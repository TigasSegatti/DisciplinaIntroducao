//Entrada: Número de um mês
//Saída: Mês de Janeiro a dezembro de acordo com número escolhido 
//Algoritmo:
//ler mes
//switch(mes)
//caso 1 == escreva("Janeiro")
//caso 2 == escreva("Fevereiro")
//caso 3 == escreva("Março")
//caso 4 == escreva("Abril")
//caso 5 == escreva("Maio")
//caso 6 == escreva("junho")
//caso 7 == escreva("Julho")
//caso 8 == escreva("Agosto")
//caso 9 == escreva("Setembro")
//caso 10 == escreva("Outubro")
//caso 11 == escreva("Novembro")
//caso 12 == escreva("Dezembro")
//padrao == escreva("Escolha Inválida")

import java.util.Scanner;

public class Uni4Exer23 {
public Uni4Exer23(){    
Scanner scan= new Scanner(System.in);
int mes;
System.out.println("Entre com o número do mês: ");
mes= scan.nextInt();
switch (mes) {
    case 1:
        System.out.println("Janeiro");
        break;
    case 2:
    System.out.println("Fevereiro");
    break;
    case 3: 
    System.out.println("Março");
    break;
    case 4:
    System.out.println("Abril"); 
    break;
    case 5:
    System.out.println("Maio");
    break;
    case 6:
    System.out.println("Junho");
    break;
    case 7 : 
    System.out.println("Julho");
    break;
    case 8 : 
    System.out.println("Agosto");
    break;
    case 9 :
    System.out.println("Setembro");
    break;
    case 10:
    System.out.println("Outubro");
    break;
    case 11 :
    System.out.println("Novembro");
    break;
    case 12 :
    System.out.println("Dezembro");
    break;
    default:
    System.out.println("Número Inválido");
        break;
}
scan.close();
    }
    public static void main(String[] args) {
        new Uni4Exer23();
    }
}
