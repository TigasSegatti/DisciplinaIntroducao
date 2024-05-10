import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe20 {
    public Uni5Exe20() {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df= new DecimalFormat("0.00");
        double massaInicial, massaFinal, tempoTotal = 0;
        System.out.print("Informe a massa inicial do material radioativo (em kg): ");
        massaInicial = scan.nextDouble();

        massaInicial *= 1000;

        massaFinal = 0.5;

        while (massaInicial >= massaFinal) {
            massaInicial /= 2;
            tempoTotal += 50;
        }

        int horas = (int) (tempoTotal / 3600);
        int minutos = (int) ((tempoTotal % 3600) / 60);
        int segundos = (int) (tempoTotal % 60);

        System.out.println("\nMassa inicial: " + df.format(massaInicial) + " g");
        System.out.println("Massa final: " + massaFinal + " g");
        System.out.println("Tempo total: " + horas + " horas, " + minutos + " minutos e " + segundos + " segundos");
        scan.close();
    }

    public static void main(String[] args) {
        new Uni5Exe20();
    }
}