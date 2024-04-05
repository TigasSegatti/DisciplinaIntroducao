import java.util.Scanner;

public class exer14 {
    public exer14(){
        Scanner scan= new Scanner(System.in);
        float distanciaPercorrida,tempoGasto,media,litrosGastos;
        System.out.println("Informe a distancia percorrida em kilometros:" );
        distanciaPercorrida=scan.nextFloat();
        System.out.println("Informe o tempo decorrido em horas: ");
        tempoGasto=scan.nextFloat();
        media=distanciaPercorrida/tempoGasto;
        litrosGastos=distanciaPercorrida/12;
        System.out.println("A velocidade média foi "+media+" Km/H"+
        "\nA quantidade gasta de combustível será de: "+litrosGastos+" Litro(s)");
        scan.close();
    }
    public static void main(String[] args) {
        new exer14();
    }
}
