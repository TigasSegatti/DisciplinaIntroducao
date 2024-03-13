import java.util.Scanner;

public class exer7 {
    public exer7(){
        Scanner scan= new Scanner(System.in);
        float qtdLatas, qtdGarrafaMenor, qtdGarrafaMaior,total; 
        System.out.println("Informe quantas latas de 350ml foram compradas: ");
        qtdLatas=scan.nextFloat();
        System.out.println("Informe quantas Garrafas de 600ml foram compradas: ");
        qtdGarrafaMenor=scan.nextFloat();
        System.out.println("Informe quantas Garrafas de 2 litros foram compradas: ");
        qtdGarrafaMaior=scan.nextFloat();
        total=((qtdLatas*350)/1000)+((qtdGarrafaMenor*600)/1000)+( qtdGarrafaMaior*2);
        System.out.println("Foi comprado: "+total+" litros"); 
        scan.close();
    }
    public static void main(String[] args) {
        new exer7();
    }
    
}
