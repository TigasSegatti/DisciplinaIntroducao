public class Uni5Exe21 {
    public Uni5Exe21(){
        double alturaChico = 1.50,alturaZe = 1.10,crescimentoChico = 0.02,crescimentoZe = 0.03;; 
        int anos = 0;
        while (alturaZe <= alturaChico) {
            
            alturaChico += crescimentoChico; // Aqui Chico cresce 2 centímetros
            alturaZe += crescimentoZe;  //Aqui Zé 3 centímetros
            anos++; 
        }
              System.out.println("Serão necessários " + anos + " anos para que Zé seja maior que Chico.");
    
    }
    public static void main(String[] args) {
        new Uni5Exe21();
    }
}
