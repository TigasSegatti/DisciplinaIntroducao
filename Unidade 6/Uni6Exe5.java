import java.util.Scanner;

public class Uni6Exe5 {
    public Uni6Exe5() {
        Scanner scan = new Scanner(System.in);
        System.out.print("0)Lista de perguntas: " +
                "\n1)Gosta de música sertaneja?" +
                "\n2)Gosta de futebol?" +
                "\n3)Gosta de redes sociais?" +
                "\n4)Gosta da Oktoberfest?\n");
        String[] respostasDele = ler(scan);
        String[] respostasDela = ler(scan);
        int afinidade = calcularAfinidade(respostasDele, respostasDela);
        exibirAfinidade(afinidade);

        scan.close();
    }

    public static String[] ler(Scanner scan) {
        String[] respostas = new String[5];
        for (int i = 0; i < respostas.length; i++) {
            System.out.println("\nInforme a resposta para pergunta :" + i);
            respostas[i] = scan.next().toUpperCase();
        }
        return respostas;

    }

    public static int calcularAfinidade(String[] respostasDele, String[] respostasDela) {
        int afinidade = 0;
        for (int i = 0; i < respostasDele.length; i++) {
            if (respostasDele[i].equals(respostasDela[i])) {
                afinidade += 3;
            } else if (respostasDele[i].equals("IND") || respostasDela[i].equals("IND")) {
                afinidade += 1;
            } else {
                afinidade -= 2;
            }
        }
        return afinidade;
    }

    public static void exibirAfinidade(int afinidade) {
        if (afinidade == 15) {
            System.out.println("Casem!");
        } else if (afinidade >= 10 && afinidade <= 14) {
            System.out.println("Vocês têm muita coisa em comum!");
        } else if (afinidade >= 5 && afinidade <= 9) {
            System.out.println("Talvez não dê certo :(");
        } else if (afinidade >= 0 && afinidade <= 4) {
            System.out.println("Vale um encontro.");
        } else if (afinidade >= -9 && afinidade <= -1) {
            System.out.println("Melhor não perder tempo");
        } else if (afinidade == -10) {
            System.out.println("Vocês se odeiam!");
        }
    }

    public static void main(String[] args) {
        new Uni6Exe5();
    }
}
