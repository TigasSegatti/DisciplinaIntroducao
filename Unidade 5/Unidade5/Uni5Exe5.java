import java.util.Scanner;

public class Uni5Exe5 {
    public Uni5Exe5(){
Scanner s= new Scanner(System.in);
int valor=0;
System.out.println("Informe um valor maior que 2: ");
valor=s.nextInt();
int numeroUm=8,numeroDois=0;
if(valor>2){
    for(int i=0;i<(valor/2);i++){
        System.out.println(numeroUm+" ");
        numeroDois=numeroUm+2;
        System.out.println(numeroDois+" ");
        numeroUm *=2;
    }
    if(valor%2 !=0){
        numeroDois=numeroUm+2;
        System.out.println(numeroDois+ " ");
    }
}


s.close();
    }
    public static void main(String[] args) {
        new Uni5Exe5();
    }
}
