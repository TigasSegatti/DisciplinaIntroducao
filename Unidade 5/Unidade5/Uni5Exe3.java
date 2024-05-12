public class Uni5Exe3{
  public Uni5Exe3(){
      float soma=0; 
     for(int i= 1; i<=100;i++){
    soma=soma+1f/i;
     } 
     System.out.println("O total da soma dos 100 termos será: "+soma);
  }
  public static void main(String[] args) {
      new Uni5Exe3();
  }
}
