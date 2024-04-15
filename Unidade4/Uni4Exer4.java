import java.util.Scanner;
//Dado um número de ponto flutuante maior do que 0,
// informe se foram digitadas ou não casas decimais no número.

//Entrada: Número real com virgula
//Saída: Se ele tem ou não casas decimais pós virgula
//teste 
//1) numero = 3,00 == não tem
//2) numero = 4,54 == tem 
//3) numero = 5,87 == tem
//algoritmo 
//ler numero
//se(numero - (inteiro dele mesmo= 0)) -> não tem numero após a virgula
//senao ->  tem número após a vírgula   
public class Uni4Exer4 {
    public Uni4Exer4() {
        Scanner scan = new Scanner(System.in);
        float numero;
        numero = scan.nextFloat();
        if (numero - (int) numero == 0) {
            System.out.println("Não tem número após a virgula ");
        } else {
            System.out.println("Tem número após a vírgula");
        }
        scan.close();
    }

    public static void main(String[] args) {
        new Uni4Exer4();
    }
}
