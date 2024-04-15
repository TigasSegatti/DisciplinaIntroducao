import java.util.Scanner;

public class Uni4Exer2 {
    public Uni4Exer2(){
    //Entrada: valor maior que 0
    //Saida : Informar se este número é par ou ímpar
    //teste:
    //1) valor: 10 -> É par
    //2) valor: 7 -> É ímpar
    //3) valor: 20 -> É par
    //Algoritmo: lervalor
    //se(valor % 2== 0) = Escreva("número é par")
    //senão = escreva("Número é ímpar")     
        Scanner scan = new Scanner(System.in);
        int valor;
        System.out.println("Escreva um valor: ");
        valor = scan.nextInt();
        if(valor % 2== 0){
            System.out.println("Número é par");
        }
        else
        {
            System.out.println("Número é ímpar");
        }
        scan.close();

}
    public static void main(String[] args) {
        new Uni4Exer2();
    }
}
