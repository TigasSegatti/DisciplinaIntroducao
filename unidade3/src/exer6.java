import java.util.Scanner;

public class exer6 {
    public exer6(){
      float pratoFeito,menosPrato,total;
      Scanner scan= new Scanner(System.in);
      System.out.println("Informe o peso em kilos de seu prato: ");
      pratoFeito=scan.nextFloat();
      total=pratoFeito*25f;
      menosPrato=total-9.375f;
      System.out.println("O total a se pagar será de : "+menosPrato);
      scan.close();  
    }
    public static void main(String[] args) {
        new exer6();
    }
}
