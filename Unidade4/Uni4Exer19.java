//Entrada: Valor de X e valor de y
//Saída: Informar o quadrante
//Lógica:
// lerValor x 
// lerValor y
//se (x= 0 e y=0) = escreva(0 quadrante)
//se (x> 0 e y>0) = escreva(1 quadrante)
//se (x> 0 e y<0) = escreva(2 quadrante)
//se (x< 0 e y<0) = escreva(3 quadrante)
//se (x< 0 e y>0) = escreva(4 quadrante)
import java.util.Scanner;
public class Uni4Exer19 {
    public Uni4Exer19() {
        int X,Y;
        Scanner scan= new Scanner(System.in);
        System.out.println("Informe o valor de X");
        X=scan.nextInt();
        System.out.println("Informe o valor de Y");
        Y=scan.nextInt();
        if(X==0 && Y==0){
            System.out.println("Quandrate 0");
        }
        else if(X>0 && Y>0){
            System.out.println("Quadrante 1");
        }
        else if(X>0 && Y<0){
            System.out.println("Quadrante 2");
        }
        else if(X<0  && Y<0){
            System.out.println("Quadrante 3");
        } 
        else{
            System.out.println("Quadrante 4");
        }
        scan.close();
    }

    public static void main(String[] args) {
        new Uni4Exer19();
    }
}
