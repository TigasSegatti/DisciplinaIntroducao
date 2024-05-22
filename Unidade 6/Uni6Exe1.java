import java.util.Scanner;

public class Uni6Exe1 {
    public Uni6Exe1() {
        Scanner scan = new Scanner(System.in);
        int numeros[] = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Informe um valor para guardar no index " + i);
            numeros[i]=scan.nextInt();
        }
        for(int j= numeros.length;j>=0;j--){
            System.out.println("index: "+j+" valor guardado: "+numeros[j]);
        }
        scan.close();
    }

    public static void main(String[] args) {
        new Uni6Exe1();
    }
}
