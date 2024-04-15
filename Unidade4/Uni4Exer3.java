import java.util.Scanner;
//Entrada: dois números
//saida: Informar qual é maior
//teste
//1) numero 1=10,  numero2= 20 == maior será 20
//2) numero 1=40,  numero2= 20 == maior será 40
//3) numero 1=0,   numero2= 8  == maior será 8
//algoritmo
//ler numero1
//ler numero2
//se(numero1 > numero2) == escreva ("Maior número é : "+ numero1)
//senao == escreva ("Maior numero é : +numero2")
public class Uni4Exer3 {
    public Uni4Exer3(){
        int numero1,numero2;

        Scanner scan= new Scanner(System.in);
        System.out.println("Informe um número: ");
        numero1=scan.nextInt();
        System.out.println("Informe outro número: ");
        numero2=scan.nextInt();
        if (numero1>numero2) {
            System.out.println("Maior número é : "+ numero1);
        }
        else{
            System.out.println("Maior número é : "+ numero2);
        }
        scan.close();
    }
    public static void main(String[] args) {
        new Uni4Exer3();
    }
}
