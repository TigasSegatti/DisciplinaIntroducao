import java.util.Scanner;

//Entrada: Dia do pagamento,dia do vencimento e valor da prestação 
//Saída: valor a ser pago o cliente
public class Uni4Exer18 {
    public Uni4Exer18() {
        Scanner scan = new Scanner(System.in);
        float valorPrestação, valorFinal = 0, multa;
        int diaVencimento, diaPagamento, diaAtraso;
        System.out.println("Informe o valor da prestação: ");
        valorPrestação = scan.nextFloat();
        System.out.print("Digite o dia do pagamento: ");
        diaPagamento = scan.nextInt();
        System.out.println("Informe o dia de vencimento: ");
        diaVencimento = scan.nextInt();

        // se o pagamento ocorre até o dia do vencimento, o cliente ganha 10% de
        // desconto e é avisado que o pagamento está em dia
        if (diaPagamento <= diaVencimento) {
            valorFinal = valorPrestação - (valorPrestação * 0.1f);
        }
        // Se o pagamento é realizado até cinco dias após o vencimento o cliente perde o
        // desconto
        else if (diaPagamento <= (diaVencimento + 5)) {
            valorFinal = valorPrestação;
        }
        // se o pagamento atrasa mais de cinco dias, é cobrada uma multa de 2% por cada
        // dia de atraso
        else {
            diaAtraso = diaPagamento - diaVencimento;
            multa = diaAtraso * 0.02f;
            valorFinal = valorPrestação + (valorPrestação * multa);
            System.out.println("Pagamento foi realizado com atraso de " + diaAtraso + " dia(s). Multa de "
                    + (multa * 100) + " aplicada.");
        }

        System.out.println("Valor a ser pago: " + valorFinal);
        scan.close();
    }

    public static void main(String[] args) {
        new Uni4Exer18();
    }
}
