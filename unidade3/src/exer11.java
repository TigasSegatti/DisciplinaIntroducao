import java.util.Scanner;

public class exer11 {
    public exer11() {
        Scanner scan = new Scanner(System.in);
        float grauC, grauF;
        System.out.println("Informe a temperatura em graus celsius: ");
        grauC = scan.nextFloat();
        grauF = (grauC *9 / 5)+ 32;
        System.out.println("A temperatura será de  " + grauF + " F");
        scan.close();
    }

    public static void main(String[] args) {

        new exer11();
    }
}
