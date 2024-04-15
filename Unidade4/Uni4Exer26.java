import java.util.Scanner;

public class Uni4Exer26 {
    public Uni4Exer26() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe uma opção: ");
        System.out.println("'T':calcular a área de um triângulo de base b e altura h");
        System.out.println("'Q':calcular a área de um quadrado de lado l ");
        System.out.println("'R':calcular a área de um retângulo de base b e altura h ");
        System.out.println("'C': calcular a área de um círculo de raio r");
        char opcao = scan.nextLine().toUpperCase().charAt(0);
        switch (opcao) {
            case 'T':
                float base, altura;
                System.out.println("Informe a base do triângulo ");
                base = scan.nextFloat();
                System.out.println("Informe a altura do triângulo");
                altura = scan.nextFloat();
                System.out.println("Área do triângulo: " + (base / altura) / 2);
                break;
            case 'Q':
                float lado;
                System.out.println("Informe um lado");
                lado = scan.nextFloat();
                System.out.println("Área do quadrado = " + (lado * lado));
                break;
            case 'R':
                float b, h;
                System.out.println("Digite a base e a altura: ");
                b = scan.nextFloat();
                h = scan.nextFloat();
                System.out.println("Área do retângulo= " + b * h);
                break;
            case 'C':
                System.out.println("Digite o raio: ");
                float r;
                r = scan.nextFloat();
                System.out.println("Área do circulo: " + Math.PI * Math.pow(r, 2));
            default:
                System.out.println("Opção inválida");
                break;
        }

        scan.close();
    }

    public static void main(String[] args) {
        new Uni4Exer26();
    }
}
