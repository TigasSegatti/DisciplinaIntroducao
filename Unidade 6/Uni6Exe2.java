import java.util.Scanner;

public class Uni6Exe2 {
    public Uni6Exe2() {
        
        float numero[] = new float[12];
        float soma = 0,media=0;
        
        this.ler(numero,soma,media);
        this.escrever(media, soma, numero);
        

    }
    public void ler(float[] array,float soma,float media){
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 12; i++) {
            System.out.println("Informe um valor para armazenar: ");
            array[i] =scan.nextInt();
            soma += array[i];
            media=soma/12;
        }
        scan.close();
    }
    public void escrever(float media,float soma,float[] array){
        for(int i=0;i<12;i++){
            if(media<array[i]){
                System.out.println("O index "+i+" que possui valor: "+array[i]+" é MAIOR que a média "+media);
            }
            else{
                System.out.println("O index "+i+" que possui valor: "+array[i]+" é MENOR que a média "+media);
            }
        }
    }

    public static void main(String[] args) {
        new Uni6Exe2();
    }
}
