import java.util.Scanner;

public class Uni5Exe24 {
    public Uni5Exe24() {
        Scanner scanner = new Scanner(System.in);
        double pesoTotal = 0, limiteDiarioKg, limiteDiarioGramas, pesoPeixe;
        boolean continuar = true;

        System.out.print("Informe o limite diário (em kg): ");
        limiteDiarioKg = scanner.nextDouble();
        limiteDiarioGramas = limiteDiarioKg * 1000;

        while (continuar) {
            System.out.print("Informe o peso do peixe (em gramas): ");
            pesoPeixe = scanner.nextDouble();
            pesoTotal += pesoPeixe;
            if (pesoTotal > limiteDiarioGramas) {
                System.out.println("Limite diário excedido! Peso total da pesca: " + pesoTotal + " gramas.");
                continuar = false;
            } else {
                System.out.println("Peso total até agora: " + pesoTotal + " gramas.");
                System.out.print("Deseja informar o peso de mais um peixe: s (SIM) / n (NÃO)? ");
                char resposta = scanner.next().charAt(0);

                if (resposta == 'n' || resposta == 'N') {
                    continuar = false;
                }
            }
        }

        System.out.println("Programa encerrado. Peso total da pesca: " + pesoTotal + " gramas.");
        scanner.close();
    }

    public static void main(String[] args) {
        new Uni5Exe24();
    }

}
