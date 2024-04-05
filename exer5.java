import java.util.Scanner;

public class exer5 {
    public exer5(){
        Scanner ta= new Scanner(System.in);
        float frangos,anelTotal=11,total;
        System.out.println("Informe o numéro de frangos na granja: ");
        frangos=ta.nextFloat();
        total=frangos*anelTotal;
        System.out.println("Será gasto para manter está granja R$ "+total);
        ta.close();
    }
    public static void main(String[] args) {
        new exer5();
    }
}
