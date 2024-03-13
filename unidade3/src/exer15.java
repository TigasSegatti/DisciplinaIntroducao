import java.util.Scanner;

public class exer15 {
    public exer15() {
        Scanner pc = new Scanner(System.in);
        int num;
        System.out.println("Informe um número com 3 casas decimais: ");
        num=pc.nextInt();
        System.out.println("O valor da centena é: "+((num/100)/10));
        System.out.println("O valor da dezena é: "+(num/100)/10);
        System.out.println("O valor da unidade é: "+num/100);

        pc.close();

    }

    public static void main(String[] args) {

        new exer15();
    }
}