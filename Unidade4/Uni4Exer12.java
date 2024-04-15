import java.util.Scanner;
//Entrada: Ler 3 lados do triângulo
//Saída: informar se é equilatero, escaleno ou isoceles 

public class Uni4Exer12 {
    public Uni4Exer12() {
        Scanner scan = new Scanner(System.in);
        double lado1,lado2,lado3;
        System.out.println("Informe o lado 1: ");
        lado1=scan.nextDouble();
        System.out.println("Informe o lado 2: ");
        lado2=scan.nextDouble();
        System.out.println("Informe o lado 3: ");
        lado3=scan.nextDouble();
        if(lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1 ){
            System.out.println("É um triângulo");
            if(lado1 == lado2 && lado2 == lado3){
                System.out.println("Equilátero");

            }
            else if(lado1 == lado2 || lado2 == lado3 || lado3 == lado1 ){
                System.out.println("Isósceles");
            }
            else{
                System.out.println("Escaleno");
            }
        }
        else{
            System.out.println("Não é um triângulo");
        }
        scan.close();
    }
        
    
    public static void main(String[] args) {
        new Uni4Exer12();
    }
}