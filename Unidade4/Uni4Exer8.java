/*
 * entrada: uma letra
 * saida: se esta letra é uma vogal
 * algoritmo
 * ler letra
 * se(letra ==(a||e||i||o||u))
 * escreva("é vogal")
 * senao 
 * escreva ("Não é vogal")
 */

import java.util.Scanner;

public class Uni4Exer8 {
    public Uni4Exer8(){
        Scanner scan= new Scanner(System.in);
        String caracter;
        char letra;

        System.out.println("Informe uma letra: ");
        caracter=scan.nextLine();
        caracter=caracter.toUpperCase();
        letra =caracter.charAt(0);
        if(letra == 'a' || letra == 'e'||letra == 'i'||letra == 'o'||letra == 'u'){
            System.out.println("É vogal");
        }
        else{
            System.out.println("Não é vogal");
        }
        
        
        scan.close();    
    }
    public static void main(String[] args) {
        new Uni4Exer8();
    } 
}
