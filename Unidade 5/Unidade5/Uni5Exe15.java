//Dada uma turma de alunos, contendo seu nome e nota de duas provas descreva um algoritmo para informar a média de cada aluno. 
//Considere que a leitura dos dados deve ser finalizada quando o nome do aluno for “fim”.

import java.util.Scanner;

public class Uni5Exe15 {
    
    public Uni5Exe15(){
    Scanner scan= new Scanner(System.in);
    String nome="";
    float nota1,nota2,media=0;
    while (true) {
        System.out.println("Informe o nome: ");
        nome=scan.next();
        if(nome.equals("fim")){
            break;
        }
        System.out.println("Informe a nota 1: ");
        nota1=scan.nextFloat();
        System.out.println("Informe a nota 2: ");
        nota2=scan.nextFloat();
        media=(nota1+nota2)/2;
        System.out.println("Média: "+media);
    }
    scan.close();
    }
    public static void main(String[] args) {
        new Uni5Exe15();
    }
    
}
