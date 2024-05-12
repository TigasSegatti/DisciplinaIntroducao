public class Uni5Exe10{
   public Uni5Exe10(){
      int soma=0;
      for(int i=1;i<=10;i++){
      soma=i+25;   
      System.out.println(i+"+25 ="+soma+"->"+soma+"²="+Math.pow(soma,2));

      }
   } 
   public static void main(String[] args) {
      new Uni5Exe10();
   }
}