import java.util.Scanner;

public class Uni5Exe8 {
    /*
     * Descreva um algoritmo que leia um número inteiro n e, dados n números inteiros, descreva um algoritmo que:
    escreva o menor valor negativo;
    escreva a média dos números positivos.
     */
   public Uni5Exe8(){
    int n,menorNeg=0,numero;
    float posi=0, media=0;
    Scanner scan= new Scanner(System.in);
    System.out.println("Informe um número de valores a digitar: ");
    n=scan.nextInt();
    for(int i = 1;i<=n;i++){
        System.out.println("Digite um número: ");
        numero=scan.nextInt();
        if(numero>0){
            posi+=numero;
        }
        else
        {
            if(numero<menorNeg)
            menorNeg+=numero;

        }
    }
    media=posi/n;
    System.out.println("O menor valor negativo será: "+menorNeg);
    System.out.println("A média de números positivos será: "+media);
    scan.close();


   }
   public static void main(String[] args) {
    new Uni5Exe8();
   } 
}
