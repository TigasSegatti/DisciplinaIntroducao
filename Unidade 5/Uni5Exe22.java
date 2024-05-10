public class Uni5Exe22 {
    public Uni5Exe22(){
        double salario=20000,salFinal=0,salPrimeiroAumento;
        int anoAtual=2024;
        salPrimeiroAumento=salario*(1.5f/100);
        while (salFinal!=4644.49) {
    
    double aumento = salPrimeiroAumento * Math.pow(2, anoAtual - 1997);

    salFinal = salario + aumento;
    anoAtual++; 
        }
        System.out.printf("Ano em que o salário final atinge R$ 4.644,49: %d", anoAtual - 1);
    }
    public static void main(String[] args) {
        new Uni5Exe22();
    }
}
