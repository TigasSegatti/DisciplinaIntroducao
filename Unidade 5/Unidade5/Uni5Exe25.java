import java.util.Scanner;

public class Uni5Exe25 {
    public Uni5Exe25(){
 Scanner scanner = new Scanner(System.in);

        int pontosDireita = 0, pontosEsquerda = 0;
        boolean jogoAtivo = true;
        String jogada;

        while (jogoAtivo) {
            System.out.print("Informe a jogada (D para direita, E para esquerda): ");
             jogada = scanner.next().trim().toUpperCase();

            if (jogada.equals("D")) {
                pontosDireita++;
            } else if (jogada.equals("E")) {
                pontosEsquerda++;
            } else {
                System.out.println("Entrada inválida. Tente novamente.");
                continue;
            }

            if ((pontosDireita >= 21 && pontosDireita - pontosEsquerda >= 2) ||
                (pontosEsquerda >= 21 && pontosEsquerda - pontosDireita >= 2)) {
                jogoAtivo = false;
            }
        }

        if (pontosDireita > pontosEsquerda) {
            System.out.println("Jogador do lado direito venceu com " + pontosDireita + " pontos!");
        } else {
            System.out.println("Jogador do lado esquerdo venceu com " + pontosEsquerda + " pontos!");
        }

        scanner.close();
    }
    public static void main(String[] args) {
        new Uni5Exe25();
    }
}
