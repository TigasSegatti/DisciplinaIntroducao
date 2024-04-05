import java.util.Scanner;

public class exer15 {
    public exer15() {
        Scanner scan = new Scanner(System.in);
        int num, unidade, dezena,centena;
        System.out.println("Informe um número com 3 casas decimais: ");
        num=scan.nextInt();
        centena=num/100;
        dezena=(num%100)/10;
        unidade=num%10;
        System.out.println("O valor da centena é: "+centena);
        System.out.println("O valor da dezena é: "+dezena);
        System.out.println("O valor da unidade é: "+unidade);
        
        scan.close();

    }

    public static void main(String[] args) {

        new exer15();
    }
}