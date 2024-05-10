import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe18 {
    public Uni5Exe18() {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        int canal = 1, pessoas = 0, totalPessoas = 0, canalQuatro = 0, canalCinco = 0, canalNove = 0, canalDoze = 0;
        float mediaQuatro, mediaCinco, mediaNove, mediaDoze;
        String resposta;
        while (canal != 0) {
            System.out.println("A televisão está ligada?: ");
            resposta = scanner.next();
            if (resposta.equalsIgnoreCase("sim")) {

                System.out.println("Informe o canal que está ligado: ");
                canal = scanner.nextInt();
                switch (canal) {
                    case 0:
                        System.out.println("Desligando...");
                        break;
                    case 4:
                        System.out.println("Informe o número de pessoas assistindo o canal 4: ");
                        pessoas = scanner.nextInt();
                        canalQuatro += pessoas;
                        totalPessoas += pessoas;
                        break;
                    case 5:
                        System.out.println("Informe o número de pessoas assistindo o canal 5: ");
                        pessoas = scanner.nextInt();
                        canalCinco += pessoas;
                        totalPessoas += pessoas;
                        break;
                    case 9:
                        System.out.println("Informe o número de pessoas assistindo o canal 9: ");
                        pessoas = scanner.nextInt();
                        canalNove += pessoas;
                        totalPessoas += pessoas;
                        break;
                    case 12:
                        System.out.println("Informe o número de pessoas assistindo o canal 12: ");
                        pessoas = scanner.nextInt();
                        canalDoze += pessoas;
                        totalPessoas += pessoas;
                        break;
                    default:
                        System.out.println("Canal inválido.");
                        break;
                }
            } else {
                System.out.println("Televisão desligada");
            }

        }
        mediaQuatro = (canalQuatro / (float) totalPessoas) * 100;
        mediaCinco = (canalCinco / (float) totalPessoas) * 100;
        mediaNove = (canalNove / (float) totalPessoas) * 100;
        mediaDoze = (canalDoze / (float) totalPessoas) * 100;
        System.out.println("Média do canal 4: " + df.format(mediaQuatro) + "%");
        System.out.println("Média do canal 5: " + df.format(mediaCinco) + "%");
        System.out.println("Média do canal 9: " + df.format(mediaNove) + "%");
        System.out.println("Média do canal 12: " + df.format(mediaDoze) + "%");
        scanner.close();
    }

    public static void main(String[] args) {
        new Uni5Exe18();
    }
}