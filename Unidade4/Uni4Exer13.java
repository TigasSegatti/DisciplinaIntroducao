import java.util.Scanner;
//Entrada: valor de 3 cartas 
//Saída: Se forma truco, nove ou seis
public class Uni4Exer13 {
    public Uni4Exer13() {
        Scanner scan = new Scanner(System.in);
        int carta1,carta2,carta3;
        System.out.println("Digite 3 cartas para seu jogo: ");
         carta1 = scan.nextInt();
         carta2 = scan.nextInt();
         carta3 = scan.nextInt();

        int qtdCartasBoas = 0;
        if (carta1 == 1 || carta1 == 2 || carta1 == 3) {
            qtdCartasBoas += 1;
        }
        if (carta2 == 1 || carta2 == 2 || carta2 == 3) {
            qtdCartasBoas+=1;
        }
        if (carta3==1||carta3==2||carta3==3) {
            qtdCartasBoas++;
        }

        if(qtdCartasBoas==1){
            System.out.println("Truco");
        }
        else if(qtdCartasBoas==2){
            System.out.println("Seis");
        }
        else if(qtdCartasBoas==3){
            System.out.println("Nove");
        }

        scan.close();

    }

    public static void main(String[] args) {
        new Uni4Exer13();
    }
}
