

//Descreva um algoritmo que calcule e escreva a soma dos números pares e a soma dos números ímpares entre 1 e 100.
public class Uni5Exe2 {
    public Uni5Exe2() {
        int somaPar=0,somaImpar=0;
        for (int qtd = 1; qtd <=100; qtd++) {    
         if(qtd%2==0){
             somaPar+=qtd;
            
         } 
         else{
             somaImpar+=qtd;
            
         }
        
        }
        System.out.println("Soma dos pares: "+somaPar);
        System.out.println("Soma dos ímpares: "+somaImpar);  

    }

    public static void main(String[] args) {
        new Uni5Exe2();
    }
}
