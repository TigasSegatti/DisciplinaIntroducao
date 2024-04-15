//Entrada: Quantidade de meses que foi admitido e salário
//Saida: Quanto o funcionário recebera de salário + reajuste

import java.util.Scanner;

public class Uni4Exer15 {
    public Uni4Exer15() {
        Scanner scan = new Scanner(System.in);
        float salario, salarioAjustado=0;
        int meses;
        System.out.println("Informe seu salário: ");
        salario = scan.nextFloat();
        System.out.println("Informe a quantidade de meses apos admissão: ");
        meses = scan.nextInt();
        if (meses <= 12) {
            salarioAjustado = salario + ((salario * 5) / 100);

        } else if (meses >= 13 && meses <= 48) {
            salarioAjustado = salario + ((salario * 7) / 100);
        }
        else{
            salarioAjustado=salario;
        }
        System.out.println("Seu salário será com ajuste: "+salarioAjustado);
        scan.close();
    }

    public static void main(String[] args) {
        new Uni4Exer15();
    }
}
