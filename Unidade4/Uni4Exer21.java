//Entrada: Massa e Altura 
//Saída: Informar a classificação de acordo com o IMC
//Algoritmo:
//Ler massa, ler altura
//IMC= massa/(altura*altura)
//se(IMC <18.5) =escreva("Magreza")
//se (IMC >=18.5 || IMC<= 24.9)= escreva("Saudavel")
//se (IMC >25.0 || IMC<= 29.9)= escreva("Sobrepeso")
//se (IMC >30.0 || IMC< 34.9= escreva("Obesidade Grau I")
//se (IMC >35.0 || IMC< 39.9)= escreva("Obesidade Grau II (severa)")
//se (IMC >=40.0) = escreva("Obesidade Grau III(mórbida)")

import java.util.Scanner;

public class Uni4Exer21 {
    public Uni4Exer21(){
        float altura,massa,IMC;
        Scanner scan= new Scanner(System.in);
        System.out.println("Informe sua altura: ");
        altura=scan.nextFloat();
        System.out.println("Informe sua massa: ");
        massa=scan.nextFloat();
        IMC= massa/(altura*altura);
        scan.close();
        if (IMC <18.5) {
            System.out.println("Magreza");
        }
        else if(IMC >=18.5 || IMC<= 24.9){
            System.out.println("Saudável");
        }
        else if(IMC >25.0 || IMC<= 29.9){
            System.out.println("Sobrepeso");
        }
        else if(IMC>=30.0 || IMC <=34.9){
            System.out.println("Obesidade Grau I");
        }
        else if(IMC >35.0 || IMC< 39.9){
            System.out.println("Obesidade II (Severa)");
        }
        else if(IMC >=40.0){
            System.out.println("Obesidade grau III ( mórbida)");
        }
        

    }
    public static void main(String[] args) {
        new Uni4Exer21();
    }
}
