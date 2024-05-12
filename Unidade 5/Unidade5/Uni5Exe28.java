import java.util.Scanner;

public class Uni5Exe28 {
    public Uni5Exe28(){
        Scanner scanner = new Scanner(System.in);
        
        int votosNenhumDeNos = 0, votosCPM22 = 0, votosSkank = 0, votosJotaQuest = 0,
            totalVotos, vencedor;
        
        double percentualNenhumDeNos, percentualCPM22, percentualSkank, percentualJotaQuest;
        
        String vencedorGrupo;
        
        boolean continuarVotacao = true;

        while (continuarVotacao) {
            System.out.println("Escolha o conjunto para votar:");
            System.out.println("1. Nenhum de Nós");
            System.out.println("2. CPM22");
            System.out.println("3. Skank");
            System.out.println("4. Jota Quest");

            int voto = scanner.nextInt();

            switch (voto) {
                case 1:
                    votosNenhumDeNos++;
                    break;
                case 2:
                    votosCPM22++;
                    break;
                case 3:
                    votosSkank++;
                    break;
                case 4:
                    votosJotaQuest++;
                    break;
                default:
                    System.out.println("Voto inválido. Tente novamente.");
                    continue;
            }

            System.out.print("Mais um voto: s (SIM) / n (NÃO)? ");
            String resposta = scanner.next().toLowerCase();

            if (resposta.equals("n")) {
                continuarVotacao = false;
            }
        }

        totalVotos = votosNenhumDeNos + votosCPM22 + votosSkank + votosJotaQuest;

        percentualNenhumDeNos = (votosNenhumDeNos / (double) totalVotos) * 100;
        percentualCPM22 = (votosCPM22 / (double) totalVotos) * 100;
        percentualSkank = (votosSkank / (double) totalVotos) * 100;
        percentualJotaQuest = (votosJotaQuest / (double) totalVotos) * 100;

        vencedor = Math.max(Math.max(votosNenhumDeNos, votosCPM22), Math.max(votosSkank, votosJotaQuest));

        if (vencedor == votosNenhumDeNos) {
            vencedorGrupo = "Nenhum de Nós";
        } else if (vencedor == votosCPM22) {
            vencedorGrupo = "CPM22";
        } else if (vencedor == votosSkank) {
            vencedorGrupo = "Skank";
        } else {
            vencedorGrupo = "Jota Quest";
        }

        System.out.println("\nTotal de votos para cada grupo:");
        System.out.println("Nenhum de Nós: " + votosNenhumDeNos + " (" + percentualNenhumDeNos + "%)");
        System.out.println("CPM22: " + votosCPM22 + " (" + percentualCPM22 + "%)");
        System.out.println("Skank: " + votosSkank + " (" + percentualSkank + "%)");
        System.out.println("Jota Quest: " + votosJotaQuest + " (" + percentualJotaQuest + "%)");

        System.out.println("\nGrupo vencedor: " + vencedorGrupo);

        scanner.close();
    }
public static void main(String[] args) {
    new Uni5Exe28();
}    
}
