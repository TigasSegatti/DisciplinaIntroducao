import java.util.Scanner;

public class Uni5Exe33 {
    public Uni5Exe33() {
        Scanner scan = new Scanner(System.in);
        int votoUm = 0, votoDois = 0, votoTres = 0, votoQuatro = 0, nulo = 0, branco = 0, voto = 1,total=0;
        do {
            System.out.print("Informe seu voto: ");
            voto = scan.nextInt();
            switch (voto) {
                case 0:
                    System.out.println("Saindo...");
                    voto = 0;
                    break;
                case 1:
                    System.out.println("Voto para o canditado 1");
                    votoUm++;
                    total++;
                    break;
                case 2:
                    System.out.println("Voto para o canditado 2");
                    votoDois++;
                    total++;
                    break;
                case 3:
                    System.out.println("Voto para o canditado 3");
                    votoTres++;
                    total++;
                    break;
                case 4:
                    System.out.println("Voto para o canditado 4");
                    votoQuatro++;
                    total++;
                    break;
                case 5:
                    System.out.println("Voto anulado");
                    nulo++;
                    total++;
                    break;
                case 6:
                    System.out.println("Voto em branco");
                    branco++;
                    total++;
                    break;
                default:
                    System.out.println("Voto inválido");
                    break;
            }
            
        } while (voto != 0);
        System.out.println("Total de votos para o canditado 1: " + votoUm + "\nTotal de votos para o canditado 2: "
        + votoDois +
        "\nTotal de votos para o canditado 3: " + votoTres + "\nTotal de votos para o canditado 4: "
        + votoQuatro);
        System.out.println("Total de votos nulos: "+nulo+"\nTotal de votos em branco: "+branco);
        System.out.println("O percentual de votos nulos é: "+(nulo*100)/total);
        System.out.println("O percentual de votos brancos é: "+(branco*100)/total);
        scan.close();
    }

    public static void main(String[] args) {
        new Uni5Exe33();
    }
}
