//Descreva um algoritmo que leia 20 números inteiros e escreva, para cada número lido, se o mesmo é par ou ímpar.

import java.util.Scanner;

public class Uni5Exe1 {
    public Uni5Exe1(){
        Scanner scan= new Scanner(System.in);
        for(int contador=0; contador <20; contador++)
        {
            int num;
            System.out.println("Informe um número: ");
            num=scan.nextInt();
            if(num%2==0){
                System.out.println("Número é par");
            }
            else{
                System.out.println("O número é Ímpar");
            }
        }
        
        scan.close();
    }
    public static void main(String[] args) {
        new Uni5Exe1();
    }
}
