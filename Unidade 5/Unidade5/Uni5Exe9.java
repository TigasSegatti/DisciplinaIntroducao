import java.util.Scanner;

public class Uni5Exe9 {
    public Uni5Exe9(){
    Scanner sc = new Scanner(System.in);
        int alunos,acima=0,idade;
        String nome=" ",nomeDezoito=" ";
        System.out.println("Informe a quantidade de alunos");
        alunos=sc.nextInt();
        for(int i=0 ;i<alunos;i++){
            System.out.println("Informe a idade : ");
            idade=sc.nextInt();
            System.out.println("Informe o nome : ");
            nome=sc.next();
            if(idade==18){
            nomeDezoito+=nome+", ";
            }
            else if(idade>20){
                acima++;
            }
        }
        System.out.println("Nome dos que tem 18 anos: "+nomeDezoito);
        System.out.println("Quantidade de alunos acima de 20: "+acima);

    sc.close();
    }
    public static void main(String[] args) {
        new Uni5Exe9();
    }
}
