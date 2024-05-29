import java.util.Scanner;

public class Uni6Exe4 {
    public Uni6Exe4() {

        // Definindo vetores
        int vetor1[]= new int[12];
        int vetor2[]= new int[12];
        int vetorSoma[]= new int[12];
        
        // parte Ler
        this.ler(vetor1, vetor2);
        //Parte soma
        this.somar(vetor1, vetor2, vetorSoma);
        //Parte escrita
        this.escrever(vetorSoma);
    }
    public void ler(int[] array1,int[] array2){
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe valores para o 1 vetor: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Informe o " + i + " valor a guardar");
            array1[i]=scan.nextInt();
        }
        System.out.println("Informe valores para o 2 vetor: ");
        for(int j=0;j<array2.length;j++){
            System.out.println("Informe o " + j + " valor a guardar");
            array2[j]=scan.nextInt();
        }
        scan.close();
    }
    public void somar(int[] array1,int[] array2,int[] array3){
        for(int a=0;a<array3.length;a++){
            array3[a]=array1[a]+array2[a];
        }
    }
    public void escrever(int[] array3){
        for(int r=0;r<array3.length;r++){
            System.out.println("Endereço: "+r+" Armazenado após soma:"+array3[r]);
        }
    }
    public static void main(String[] args) {
        new Uni6Exe4();
    }
}
