import java.util.Scanner;
//Entrada: Hora e minutos de entrada, hora e minuto de saída
//Saída: Quantidade a ser paga pelo 
public class Uni4Exer27 {
    public Uni4Exer27() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a hora de entrada: ");
        int horaEntrada = scan.nextInt();
        System.out.println("Informe o(s) minuto(s) entrada: ");
        int minEntrada = scan.nextInt();
        System.out.println("Informe a hora de saída: ");
        int horaSaida = scan.nextInt();
        System.out.println("Informe o(s) minuto(s) de saida ");
        int minSaida = scan.nextInt();

        if (horaEntrada >= 0 && horaEntrada <= 23) {
            if (horaSaida >= 0 && horaSaida <= 23) {
                if (horaEntrada < horaSaida || horaSaida == horaEntrada && minSaida > minEntrada) {
                    if (minEntrada >= 0 && minEntrada <= 59) {
                        if (minSaida >= 0 && minSaida <= 59) {
                            int duracao = horaSaida - horaSaida;
                            if ((minSaida - minEntrada) >= 30) {
                                duracao += 1;
                            }
                            float valorPagar = 0;
                            switch (duracao) {
                                case 0:
                                case 1:
                                    valorPagar = 5;
                                    break;
                                case 2:
                                    valorPagar = 10;
                                    break;
                                case 3:
                                    valorPagar = 17.5f;
                                    break;
                                case 4:
                                    valorPagar = 25;
                                    break;
                                default:
                                    int horasMais = duracao - 4;
                                    valorPagar = 25 + (10 * horasMais);
                                    break;
                            }
                            System.out.println("Duraçã em horas: " + duracao);
                            System.out.println("valor total a pagar: " + valorPagar);
                        } else {
                            System.out.println("Minutos de saídas inválidos ");
                        }
                    } else {
                        System.out.println("Minutos de entrada inválidos");
                    }
                } else {
                    System.out.println("Hora de entrada deve ser antes de saída");
                }
            } else {
                System.out.println("Hora de saida inválida");
            }
        } else {
            System.out.println("Hora de entrada inválda");
        }

        scan.close();
    }
    public static void main(String[] args) {
        new Uni4Exer27();
    }
}