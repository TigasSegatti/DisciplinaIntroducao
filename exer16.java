import java.util.Scanner;
public class exer16 {
 public exer16(){
    Scanner scan= new Scanner(System.in);
    int compra,pagamento,troco,nota1,nota10,nota100;
    System.out.println("Informe o valor da compra: ");
    compra=scan.nextInt();
    System.out.println("Informe o valor do pagamentos: ");
    pagamento=scan.nextInt();
    troco=pagamento-compra;
    nota100=troco / 100;
    nota10=(troco % 100)/10;
    nota1=(troco % 100)%10;
    System.out.println("Troco total: " + troco);
    System.out.println("Total de nota(s) de R$100: " + nota100);
    System.out.println("Total de nota(s) de R$10: " + nota10);
    System.out.println("Total de nota(s) de R$1: " + nota1);
    scan.close();
 }
    public static void main(String[] args) {
        new exer16();
    }
 }