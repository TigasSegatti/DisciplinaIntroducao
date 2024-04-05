import java.util.Scanner;

public class exer2 {

    public exer2() {
       
        float preco, descont, valor;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o preço do calçado: ");
        preco = sc.nextFloat();
        descont = ((preco * 12) / 100);
        valor = preco - descont;
        System.out.println("O preço do desconto será de R$ " + descont + "\nO preço do calçado com desconto será de R$: " + valor);
        sc.close();

    }

    public static void main(String[] args) {
        new exer2();
    }
}
