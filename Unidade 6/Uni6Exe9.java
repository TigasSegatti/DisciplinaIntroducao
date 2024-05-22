import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni6Exe9 {
    public Uni6Exe9() {
        final int TOTAL_CLIENTES = 30;
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df= new DecimalFormat("0.0");
        int sexo;
        int[] sexos = new int[TOTAL_CLIENTES];
        int[] notas = new int[TOTAL_CLIENTES];
        int[] idades = new int[TOTAL_CLIENTES];

        for (int i = 0; i < TOTAL_CLIENTES; i++) {
            System.out.println("Cliente " + (i + 1) + ":");
            System.out.print("Sexo (1=feminino, 2=masculino): ");
            sexo=scanner.nextInt();
            while (sexo!=1 && sexo!=2) {
                System.out.println("Informe corretamente o sexo. \n1=feminino e 2=masculino");
                sexo=scanner.nextInt();  
              }
            sexos[i] = sexo;
            System.out.print("Nota (0 a 10): ");
            notas[i] = scanner.nextInt();
            System.out.print("Idade: ");
            idades[i] = scanner.nextInt();
        }

        double somaNotas = 0;
        for (int nota : notas) {
            somaNotas += nota;
        }
        double mediaNotas = somaNotas / TOTAL_CLIENTES;

        double somaNotasHomens = 0;
        int contagemHomens = 0;
        for (int i = 0; i < TOTAL_CLIENTES; i++) {
            if (sexos[i] == 2) {
                somaNotasHomens += notas[i];
                contagemHomens++;
            }
        }
        double mediaNotasHomens = (contagemHomens == 0) ? 0 : somaNotasHomens / contagemHomens;

        int idadeMulherMaisJovem = Integer.MAX_VALUE;
        int notaMulherMaisJovem = -1;
        for (int i = 0; i < TOTAL_CLIENTES; i++) {
            if (sexos[i] == 1 && idades[i] < idadeMulherMaisJovem) {
                idadeMulherMaisJovem = idades[i];
                notaMulherMaisJovem = notas[i];
            }
        }

        int mulheresMais50NotaSuperiorMedia = 0;
        for (int i = 0; i < TOTAL_CLIENTES; i++) {
            if (sexos[i] == 1 && idades[i] > 50 && notas[i] > mediaNotas) {
                mulheresMais50NotaSuperiorMedia++;
            }
        }

        System.out.println("Nota média recebida pelo cinema: "+ df.format(mediaNotas));
        System.out.println("Nota média atribuída pelos homens: "+df.format(mediaNotasHomens));
        if (notaMulherMaisJovem != -1) {
            System.out.println("Nota atribuída pela mulher mais jovem: "+df.format(notaMulherMaisJovem));
        } else {
            System.out.println("Não houve mulheres na pesquisa.");
        }
        System.out.printf("Mulheres com mais de 50 anos que deram nota superior à média: %d\n",
                mulheresMais50NotaSuperiorMedia);

        scanner.close();
    }

    public static void main(String[] args) {
        new Uni6Exe9();
    }
}
