import java.util.Scanner;

public class exer8 {
    public exer8(){
        float qtdDolar,total;
        Scanner sc= new Scanner(System.in);
        System.out.println("Informe a quantidade de dólares entregues: ");
        qtdDolar=sc.nextFloat();
        total=qtdDolar/5;
        System.out.println("O total a ser devolvido será de: "+total);
        
        
        sc.close();
    }public static void main(String[] args) {
        new exer8();
    }
}
