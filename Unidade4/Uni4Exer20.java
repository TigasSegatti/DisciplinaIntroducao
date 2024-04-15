import java.text.DecimalFormat;
import java.util.Scanner;

//Entrada: Informar nota de 3 provas e 1 de exercicios 
//Saída: Informar a média de aproveitamento e se foi aprovado ou reprovado
//A,B,C =aprovado
//D ou E = reprovado
public class Uni4Exer20 {
    public Uni4Exer20() {
        Scanner scan = new Scanner(System.in);
        float nota1, nota2, nota3, notaExercicio, media;
        System.out.println("Informe valor da nota 1: ");
        nota1 = scan.nextInt();
        System.out.println("Informe valor da nota 2: ");
        nota2 = scan.nextInt();
        System.out.println("Informe valor da nota 3: ");
        nota3 = scan.nextInt();
        System.out.println("Informe valor da nota de exercicio: ");
        notaExercicio = scan.nextInt();

        media = (nota1 + nota2 * 2 + nota3 * 3 + notaExercicio) / 7;
        DecimalFormat df = new DecimalFormat(".0");
        if (media >= 9.0) {
            System.out.println("Média: " + df.format(media) + " Conceito A ,Aprovado");
        } else if (media >= 7.5 && media < 9.0) {
            System.out.println("Média: " + df.format(media) + " Conceito B ,Aprovado");
        } else if (media >= 6.0 && media < 7.5) {
            System.out.println("Média: " + df.format(media) + " Conceito C ,Aprovado");
        } else if (media >= 4.0 && media < 6.0) {
            System.out.println("Média: " + df.format(media) + " Conceito D ,Reprovado");
        } else if (media < 4.0) {
            System.out.println("Média: " + df.format(media) + ". Conceito E ,Rprovado");
        }
        scan.close();
    }

    public static void main(String[] args) {
        new Uni4Exer20();
    }

}
