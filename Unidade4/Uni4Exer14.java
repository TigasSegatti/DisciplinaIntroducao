import java.util.Scanner;

//Entrada: Ler dia, mes e ano
//Saida: Se a data inserida é valida ou não

public class Uni4Exer14 {
    public Uni4Exer14() {
        Scanner scan = new Scanner(System.in);
        int dia, mes, ano;
        System.out.println("Informe o dia");
        dia = scan.nextInt();
        System.out.println("Digite o mes: ");
        mes = scan.nextInt();
        System.out.println("Digite o ano: ");
        ano = scan.nextInt();
        if (dia > 0 && dia < 32 && mes > 0 && mes < 13 && ano > 0) {
            if (mes == 1 || mes == 2 || mes == 3 || mes == 4 || mes == 5 || mes == 6 || mes == 7 || mes == 8 || mes == 9
                    || mes == 10 || mes == 11 || mes == 12) {
                System.out.println("Valida");
            } else if (mes != 2 && dia < 31) {
                System.out.println("Valida");
            } else if (mes == 2 && dia < 29) {
                System.out.println("Valida");
            } else if (dia == 29 && ano % 4 == 0 && !(ano % 100 == 0 && ano % 400 != 0)) {
                System.out.println("Valida");
            } else {
                System.out.println("Não valida");
            }
        } else {
            System.out.println("Não valida");
        }

        scan.close();
    }

    public static void main(String[] args) {
        new Uni4Exer14();
    }
}
