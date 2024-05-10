import java.util.Scanner;

public class Uni5Exe16 {
    public Uni5Exe16(){
     Scanner scan= new Scanner(System.in);
     String genero;
     float altura=1,somaF=0,SomaGeral=0;
     int contadorGeral=0,contadorF=0;

     while (altura!=0) {
       System.out.println("informe o gênero: ");
       genero=scan.next();
       char letra=genero.charAt(0);

       if(letra=='F' || letra=='f'){
        System.out.println("Genero feminino");
        System.out.println("Infome a altura:");
        altura=scan.nextFloat();
        somaF+=altura;
        contadorGeral++;
        contadorF++;
       }
       else if(letra=='M' || letra=='m'){
        System.out.println("Genero masculino");
        System.out.println("Infome a altura:");
        altura=scan.nextFloat();
        SomaGeral+=altura;
        contadorGeral++;
       }
       else if(letra=='O' || letra=='o'){
        System.out.println("Outro");
        System.out.println("Infome a altura:");
        altura=scan.nextFloat();
        SomaGeral+=altura;
        contadorGeral++;
     }
     else{
        System.out.println("Genero Invalido");
     }
    }
    System.out.println("Média da altura do genero feminino: "+somaF/contadorF);
    System.out.println("Média de altura do grupo geral: "+SomaGeral/contadorGeral);
    scan.close();
}
    public static void main(String[] args) {
        new Uni5Exe16();
    }
    
}
