import java.util.Scanner;
//Dada uma pergunta, “a cor é azul?”, faça um programa que leia uma variável lógica com a resposta e responda “Sim”,
//Caso a resposta seja true, ou “Não”, caso seja false.
//Para resolver este problema pode se utilizar do algoritmo descrito no fluxograma
// Entrada: Resposta sim ou não 
// Saida: se é azul ou não
// teste:
//1) resposta é Sim == é azul  
//2) resposta é Não == não é azul
//3) reposta é diferente == erro 
//algoritmo:
//
public class Uni4Exer5 {
    public Uni4Exer5(){
        Scanner scan = new Scanner(System.in);
        boolean verificar;
        String resposta;
        System.out.println("É azul? ");
        resposta=scan.nextLine();
    if(resposta.trim().equalsIgnoreCase("Sim"))
        {
        verificar= true;
        }
        else
        {
        verificar = false;
        }

        if (verificar) 
        {
        System.out.println("É azul!");    
        }
        else
        {
            System.out.println("Não é azul");
        }
        scan.close();
    }
    public static void main(String[] args) {
        new Uni4Exer5();
    }
}
