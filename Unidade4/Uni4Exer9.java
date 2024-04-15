import java.util.Scanner;
//Entrada: dois valores
//saida: se são ou não multiplos 
public class Uni4Exer9 {
    public Uni4Exer9(){
Scanner scan= new Scanner(System.in);
int valor1,valor2;
System.out.println("Informe o valor1: ");
valor1=scan.nextInt();
System.out.println("Informe o valor 2: ");
valor2=scan.nextInt();
//se o resto da divisão é 0, eles são divisões exatas
if(valor1% valor2==0 || valor2 % valor1 == 0){
    System.out.println("São múltiplos ");
}
else{
    System.out.println("Não são multiplos");
}

scan.close();
    }
    public static void main(String[] args) {
        new Uni4Exer9();
    }
}
