// Entrada: ler ano de nascimento 
//Saída: escrever se são trigêmeos, gemêos ou irmão. 
import java.util.Scanner;
public class Uni4Exer11 {
    public Uni4Exer11() {
        Scanner scan = new Scanner(System.in);
        int idade1, idade2, idade3;
        System.out.println("Informe a idade do 1 irmão: ");
        idade1 = scan.nextInt();
        System.out.println("Informe a idade do 2 irmão: ");
        idade2 = scan.nextInt();
        System.out.println("Informe a idade do 3 irmão: ");
        idade3 = scan.nextInt();

        if (idade1 == idade2 && idade2 == idade3) {
            System.out.println("Trigêmeos");
        } else if (idade1 == idade2 && idade2 != idade3 || idade2 == idade3 && idade2 != idade1  || idade3 == idade1 && idade2 != idade1) {
            System.out.println("Gemêos");

        } else {
            System.out.println("Irmãos");
        }

        scan.close();
    }


public static void main(String[] args) {
    new Uni4Exer11();
}
}