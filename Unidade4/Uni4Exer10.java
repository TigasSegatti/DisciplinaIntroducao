import java.util.Scanner;

//Entrada:Idade de cada Irmão
//Saída: o mais novo entre os 3 irmãos 
//Se (marquinho for mais novo que zezinho e luluzinha) = sera o caçula
//Se (zezinho for mais novo que marquinhos e luluzinha) = sera o caçula
//Se (luluzinha for mais novo que zezinho e marquinhos) = sera o caçula
public class Uni4Exer10 {
    public Uni4Exer10() {
        Scanner scan = new Scanner(System.in);
        int idadeMarquinhos, idadeLuluzinha, idadeZezinho;
        System.out.println("Digite a idade de Marquinhos:");
        idadeMarquinhos = scan.nextInt();

        System.out.println("Digite a idade de Zezinho:");
        idadeZezinho = scan.nextInt();

        System.out.println("Digite a idade de Luluzinha:");
        idadeLuluzinha = scan.nextInt();
       
        if (idadeMarquinhos < idadeZezinho && idadeMarquinhos < idadeLuluzinha) {
            System.out.println("Marquinhos é o caçula.");
        } else if (idadeZezinho < idadeLuluzinha && idadeMarquinhos > idadeZezinho) {
            System.out.println("Zezinho é o caçula.");
        } else if(idadeLuluzinha< idadeZezinho && idadeLuluzinha< idadeMarquinhos) {
            System.out.println("Luluzinha é a caçula.");
        }
        scan.close();

    }
    public static void main(String[] args) {
        new Uni4Exer10();
    }

}
