import java.util.Scanner;

public class Uni5Exe29 {
    public Uni5Exe29(){
         Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor desejado: ");
        int valor = scan.nextInt();

        int qtdCedulas20 = 0, qtdCedulas10 = 0, qtdCedulas5 = 0, qtdCedulas2 = 0, qtdCedulas1 = 0;
        
        int valorRestante = valor;

        qtdCedulas20 = valorRestante / 20;
        valorRestante %= 20;

        qtdCedulas10 = valorRestante / 10;
        valorRestante %= 10;

        qtdCedulas5 = valorRestante / 5;
        valorRestante %= 5;

        qtdCedulas2 = valorRestante / 2;
        valorRestante %= 2;

        qtdCedulas1 = valorRestante;

        System.out.println("Para o valor " + valor + ", a quantidade mínima de cédulas necessária é:");

        if (qtdCedulas20 > 0) {
            System.out.println(qtdCedulas20 + " cédula(s) de 20");
        }
        if (qtdCedulas10 > 0) {
            System.out.println(qtdCedulas10 + " cédula(s) de 10");
        }
        if (qtdCedulas5 > 0) {
            System.out.println(qtdCedulas5 + " cédula(s) de 5");
        }
        if (qtdCedulas2 > 0) {
            System.out.println(qtdCedulas2 + " cédula(s) de 2");
        }
        if (qtdCedulas1 > 0) {
            System.out.println(qtdCedulas1 + " cédula(s) de 1");
        }

        scan.close();
    }
    public static void main(String[] args) {
        new Uni5Exe29();
    }
    
}
