import java.util.Scanner;

public class exer2 {

    public exer2() {
        /*
         * Uma loja de calçados está concedendo 12% de desconto nos produtos. Escreva um programa para calcular e
         *  exibir o valor de desconto a ser dado num par de sapatos e quanto deve custar o produto com o desconto. 
         * O preço do par de sapatos deve ser informado 
         * pelo usuário. Como resultado, o programa deverá exibir as seguintes mensagens:
         * 
         * Análise ok
         * Entrada: valor do sapato
         */
        float preco, descont, valor;
        /*
         * Algoritmo
         * Ler valorSapato
         * desconto= (valorsapato * (12/100f)
         * valorFinal= valorSapato – desconto
         * Escrever (valor do desconto será de desconto)
         * Escrever (valor do produto será de valorFinal)
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o preço do calçado: ");
        preco = sc.nextFloat();
        descont = ((preco * 12) / 100);
        valor = preco - descont;
        /*
         * Saída: valor do sapato com desconto aplicado e desconto
         */
        System.out.println(
                "O preço do desconto será de R$ " + descont + "\nO preço do calçado com desconto será de R$: " + valor);
        sc.close();

    }

    public static void main(String[] args) {
        new exer2();
    }
}
