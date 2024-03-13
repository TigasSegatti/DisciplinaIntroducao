import java.util.Scanner;

public class exer4 {
    public exer4(){
        Scanner novo = new Scanner(System.in);
        float nota1,nota2,nota3,media;
        System.out.println("Informe a nota 1: ");
        nota1=novo.nextFloat();
        System.out.println("Informe a nota 2: ");
        nota2=novo.nextFloat();
        System.out.println("Informe a nota 3: ");
        nota3=novo.nextFloat();
        media=(nota1*5+nota2*3+nota3*2)/10;
        System.out.println("Sua média será de : "+media);

        novo.close();
    }
    public static void main(String[] args) {
        new exer4();
    }
}
