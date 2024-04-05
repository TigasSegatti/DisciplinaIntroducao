import java.util.Scanner;

public class exer10 {
    public exer10(){
    float cateto1,cateto2,hipotenusa,h;
    Scanner sc= new Scanner(System.in);
    System.out.println("Informe o valor do cateto adjacete: ");
    cateto1=sc.nextFloat();
    System.out.println("Informe o valor do cateto oposto: ");
    cateto2=sc.nextFloat();
    h= (float) (Math.pow(cateto1, 2)+Math.pow(cateto2, 2));
    hipotenusa=(float) Math.sqrt(h);
    System.out.println(hipotenusa);
    System.out.println("A hipotenusa do triângulo será: "+hipotenusa+" metros");
    sc.close();   
    }
    public static void main(String[] args) {
        new exer10();
    }
    
}
