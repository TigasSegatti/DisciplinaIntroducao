import java.util.Scanner;

//Entrada: Informar horas trabalhadas e a quantidade paga por hora
//Saída: O salário no final do mes 
public class Uni4Exer1 {
    public Uni4Exer1() {
        Scanner scan = new Scanner(System.in);
        float horas, salTotal, salExtra, ganhoHora;
        System.out.println("Informe horas trabalhadas neste mês: ");
        horas = scan.nextFloat();
        System.out.println("Informe a quantidade paga por hora: ");
        ganhoHora = scan.nextFloat();
        salTotal = horas * ganhoHora;
        if (horas > 160) {
            salExtra = (horas - 160) * (ganhoHora / 2);
            salTotal = salTotal + salExtra;
        }
        System.out.println("Salário este mês será R$" + salTotal);
        scan.close();
    }

    public static void main(String[] args) {
        new Uni4Exer1();
    }
}
