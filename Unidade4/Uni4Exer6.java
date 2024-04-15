import java.util.Scanner;
//Entrada: Inserir um caracter de abreviação do sexo
//Saida: sexo inserido
public class Uni4Exer6 {
    public Uni4Exer6(){
        Scanner scan= new Scanner(System.in);
        String caractere;
        System.out.println("Escreva M para masculino, F para feminino, Ou I para não informado : ");
        caractere= scan.nextLine();
        caractere=caractere.toUpperCase();//Coloca a String em letra maiscula 
        char letra= caractere.charAt(0);// método de seleção de caracter
        
         if(letra =='M' || letra=='F' || letra=='I'){
            System.out.println("Entrada válida");
        if(letra=='M')
        {
            System.out.println("Masculino");
        }
        else if(letra=='F')
        {
            System.out.println("Feminino");
        }
        else if(letra== 'I')
        {
            System.out.println("Não Informado");
        }
     }
        else
        {
            System.out.println("Entrada Inváldida");
        }
    
        scan.close();
    }
    public static void main(String[] args) {
        new Uni4Exer6();
    }
}
