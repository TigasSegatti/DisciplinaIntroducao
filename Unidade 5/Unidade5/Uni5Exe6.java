import java.util.Scanner;

public class Uni5Exe6 {
    // ler altura de 20 pessoas e calcular a média das alturas
    public Uni5Exe6() {
        Scanner s = new Scanner(System.in);
        float media = 0, alturas = 0, altura = 0;

        for (int qtd = 1; qtd <= 20; qtd++) {
            System.out.println("Informe a altura: ");
            altura = s.nextFloat();
            alturas += altura;
        }
        media = alturas / 20;
        System.out.println("A média será: "+media);
        s.close();
    }

    public static void main(String[] args) {
        new Uni5Exe6();
    }
}
