import java.util.Scanner;

public class exer12 {
    public exer12(){
        Scanner scan= new Scanner(System.in);
        String nome;
        float horas;
        double descontoInss,salarioBruto,salarioLiquido,descontoImposto;
        System.out.println("Informe o nome do funcionário: ");
        nome=scan.nextLine();
        System.out.println("Informe a quantidade de horas: ");
        horas=scan.nextFloat();
        salarioBruto=horas*10;
        descontoInss= (float) (salarioBruto*0.085);
        descontoImposto= (float) (salarioBruto*0.05);
        double descontoTotal= descontoImposto+descontoInss;
        salarioLiquido=salarioBruto-descontoTotal;
        System.out.println("Nome: "+nome+"\nSalário Bruto: R$"+salarioBruto+"\nSalário liquído: R$"+salarioLiquido);
        scan.close();
    }
    public static void main(String[] args) {
        new exer12();
    }
}
