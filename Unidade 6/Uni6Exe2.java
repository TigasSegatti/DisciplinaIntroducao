import java.util.Scanner;

public class Uni6Exe2 {
    public Uni6Exe2() {
        Scanner entrada = new Scanner(System.in);
        double soma = 0, media = 0;
        double[] valores = new double[4];
        soma = this.metodoLer(valores, entrada);
        media = this.metodoCalculo(soma, valores);
        this.metodoExibir(valores, media);
    }

    public double metodoLer(double[] valores, Scanner entrada) {
        double soma = 0;
        for (int i = 0; i < valores.length; i++) {
            System.out.println("Digite um valor para o índice " + i);
            valores[i] = entrada.nextDouble();
            soma += valores[i];
        }
        return soma;
    }

    public double metodoCalculo(double soma, double[] valores) {
        double media = soma / 4;
        return media;
    }

    public void metodoExibir(double[] valores, double media) {
        for (int cont = 0; cont < valores.length; cont++) {
            if (valores[cont] > media) {
                System.out.println("O valor do índice " + cont + " é maior que a média, confira:");
                System.out.println("Valor da média: " + media);
                System.out.println("Valor do número: " + valores[cont]);
            }

        }
    } 
    public static void main(String[] args) {
        new Uni6Exe2();
    }

}