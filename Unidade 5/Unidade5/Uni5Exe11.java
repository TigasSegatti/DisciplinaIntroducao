public class Uni5Exe11 {
    /*Uma máquina de biscoito está com problemas. 
    Quando ligada, após 1 hora ela quebra 1 biscoito, 
    na segunda hora ela quebra 3 biscoitos, na hora seguinte ela quebra 3 vezes a quantidade
     de biscoitos quebrados na hora anterior, e assim por diante. Faça um algoritmo que 
     calcule quantos biscoitos são quebrados no final de cada dia (a máquina opera 16 horas por dia).*/
    public Uni5Exe11(){
        int horasDia = 16,biscoitosHora = 1,totalBiscoitosQuebrados = 0;
        for (int i = 1; i <= horasDia; i++) {
            totalBiscoitosQuebrados += biscoitosHora;
            biscoitosHora *= 3;
        }
        System.out.println("Total de biscoitos quebrados no final do dia: " + totalBiscoitosQuebrados); 
    }
    public static void main(String[] args) {
        new Uni5Exe11();
    }
    
}
