import java.util.Scanner;

/*
 entrada: O peso do prato
 saida : cust do selo a pagar
 algoritmo
 ler peso
 se(peso >=50) pesoExcedido = peso -50
 qtdAdicional = (pesoExcedido/20)+1
 valorPagar=0.45f + (0.45f *qtdAdicional)
  senao -> valorPagar=0.45
  escrever("custo d selo "+valorPagar)
 */
public class Uni4Exer7 {
    public Uni4Exer7() {
        Scanner scan = new Scanner(System.in);
        float peso, valorPagar, qtdAdicional, pesoExcedido;
        System.out.println("Informe o peso do prato: ");
        peso = scan.nextFloat();
        valorPagar = 0;
        if (peso >= 50) {
            pesoExcedido = peso - 50;
            qtdAdicional = (pesoExcedido / 20);
            valorPagar = 0.45f + (0.45f * qtdAdicional);

        } else {
            valorPagar=0.45f;
        }
        System.out.println("Custo do selo será : "+valorPagar);

        scan.close();
    }

    public static void main(String[] args) {
        new Uni4Exer7();
    }
}
