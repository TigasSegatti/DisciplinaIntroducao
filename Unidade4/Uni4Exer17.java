import java.util.Scanner;

//Entrada: Renda anual  e número de dependentes
//Saída: o imposto de renda   
public class Uni4Exer17 {
    public Uni4Exer17() {
        Scanner scan = new Scanner(System.in);
        double rendaLiquida, rendaAnual, imposto;
        int dependentes;
        System.out.println("Informe sua renda anual: ");
        rendaAnual = scan.nextDouble();
        System.out.println("Informe a quantidade de dependentes: ");
        dependentes = scan.nextInt();
        rendaLiquida = rendaAnual - ((rendaAnual * 0.02) * dependentes);// Renda liquida é feito pela renda anual menos 2% por depentende
        System.out.println("Renda Líquida R$: " + rendaLiquida);

        if (rendaLiquida <= 2000) { //Renda até 2000 não paga
            imposto = 0;
        } else if (rendaLiquida <= 5000 && rendaLiquida > 2000) { //Renda entre 2000 e 5000 paga 5%
            imposto = rendaLiquida * 0.05;
        } else if (rendaLiquida <= 10000 && rendaLiquida > 5000) { //Entre 5000 e 10000 pagam 10%
            imposto = rendaLiquida * 0.10;
        } else {
            imposto = rendaLiquida * 0.15; // Superior paga 10000
        }
        if (imposto == 0) {
            System.out.println("Insentado de imposto");
        } else {
            System.out.println("Imposto de renda a ser pago: R$" + imposto);
        }

        scan.close();
    }

    public static void main(String[] args) {
        new Uni4Exer17();
    }
}