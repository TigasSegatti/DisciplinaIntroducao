import java.util.Scanner;
//Entrada: Idade de 2 homens e duas mulheres
//Saida: Soma da idade do homem mais velho com a mulher mais nova e produto da idade
//do homem mas novo com a idade da mulher mais velha
public class Uni4Exer16 {
    public Uni4Exer16(){
        Scanner scan= new Scanner(System.in);
        int idadeHomem1,idadeHomem2,idadeMulher1,idadeMulher2;

        System.out.println("Informe a idade de dois homens: ");
        idadeHomem1=scan.nextInt();
        idadeHomem2=scan.nextInt();
        System.out.println("Agora de duas mulheres: ");
        idadeMulher1=scan.nextInt();
        idadeMulher2=scan.nextInt();
        if(idadeHomem1!=idadeMulher1 && idadeHomem1 != idadeMulher2 && idadeHomem2!= idadeMulher2 ){
            if(idadeHomem1>idadeHomem2) 
            {
            if(idadeMulher1>idadeMulher2){
                System.out.println("Soma: "+(idadeHomem1+idadeMulher2)+"Produto: "+(idadeHomem2*idadeMulher1));
            }
            else if(idadeMulher2>idadeMulher1){
                System.out.println("Soma: "+(idadeHomem1+idadeMulher1)+"Produto: "+(idadeHomem2*idadeMulher2));
            }
            }
            else if(idadeHomem2>idadeHomem1){
                if(idadeMulher1>idadeMulher2){
                    System.out.println("Soma: "+(idadeHomem2+idadeMulher2)+"Produto: "+(idadeHomem1*idadeMulher1));
                }
                else if(idadeMulher2>idadeMulher1){
                    System.out.println("Soma: "+(idadeHomem2+idadeMulher2)+"Produto: "+(idadeHomem1*idadeMulher1));
                }
            }
        }
        scan.close();
        }
        
        
        
    public static void main(String[] args) {
        new Uni4Exer16();
    }
}
