import java.util.Scanner;

public class Uni6Exe9 {
    public Uni6Exe9() {
        Scanner scanner = new Scanner(System.in);

        int[] sexos = new int[30]; 
        int[] notas = new int[30];
        int[] idades = new int[30];

        lerDados(scanner, sexos, notas, idades);

        double notaMedia = calcularNotaMedia(notas);
        double notaMediaHomens = calcularNotaMediaHomens(sexos, notas);
        int notaMulherMaisJovem = calcularNotaMulherMaisJovem(sexos, notas, idades);
        int mulheresComMaisDe50NotaSuperiorMedia = contarMulheresComMaisDe50NotaSuperiorMedia(sexos, notas, idades, notaMedia);

        System.out.println("Nota média recebida pelo cinema: " + notaMedia);
        System.out.println("Nota média atribuída pelos homens: " + notaMediaHomens);
        System.out.println("Nota atribuída pela mulher mais jovem: " + notaMulherMaisJovem);
        System.out.println("Número de mulheres com mais de 50 anos que deram nota superior à média recebida pelo cinema: " + mulheresComMaisDe50NotaSuperiorMedia);
    }

    private static void lerDados(Scanner scanner, int[] sexos, int[] notas, int[] idades) {
        for (int i = 0; i < 30; i++) {
            System.out.println("Digite o sexo do cliente (1=feminino, 2=masculino):");
            sexos[i] = scanner.nextInt();
            System.out.println("Digite a nota do cliente (0 a 10):");
            notas[i] = scanner.nextInt();
            System.out.println("Digite a idade do cliente:");
            idades[i] = scanner.nextInt();
        }
    }

    private static double calcularNotaMedia(int[] notas) {
        double somaNotas = 0;
        for (int nota : notas) {
            somaNotas += nota;
        }
        return somaNotas / notas.length;
    }

    private static double calcularNotaMediaHomens(int[] sexos, int[] notas) {
        double somaNotasHomens = 0;
        int totalHomens = 0;
        for (int i = 0; i < sexos.length; i++) {
            if (sexos[i] == 2) {
                somaNotasHomens += notas[i];
                totalHomens++;
            }
        }
        if (totalHomens > 0) {
            return somaNotasHomens / totalHomens;
        } else {
            return 0;
        }
    }

    private static int calcularNotaMulherMaisJovem(int[] sexos, int[] notas, int[] idades) {
        int notaMulherMaisJovem = Integer.MAX_VALUE;
        int idadeMulherMaisJovem = Integer.MAX_VALUE;
        for (int i = 0; i < sexos.length; i++) {
            if (sexos[i] == 1 && idades[i] < idadeMulherMaisJovem) {
                idadeMulherMaisJovem = idades[i];
                notaMulherMaisJovem = notas[i];
            }
        }
        return notaMulherMaisJovem;
    }

    private static int contarMulheresComMaisDe50NotaSuperiorMedia(int[] sexos, int[] notas, int[] idades, double notaMedia) {
        int count = 0;
        for (int i = 0; i < sexos.length; i++) {
            if (sexos[i] == 1 && idades[i] > 50 && notas[i] > notaMedia) {
                count++;
            }
        }
        return count;
    }
    

    public static void main(String[] args) {
        new Uni6Exe9();
    }
}
