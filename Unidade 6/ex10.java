import java.util.Scanner;

public class ex10 {
    public ex10 (){
        Scanner entrada = new Scanner(System.in);

        int[] vetor = new int[50];
        int armazenarOpUm = 0;
        int op = 0;
        do {
            System.out.println("");
            System.out.println("Menu");
            System.out.println("1- Incluir valor");
            System.out.println("2-Pesquisar valor");
            System.out.println("3-Alterar valor");
            System.out.println("4-Excluir valor");
            System.out.println("5-Mostrar valores");
            System.out.println("6-Ordenar valores");
            System.out.println("7-Inverter valores");
            System.out.println("8-Sair do sistema");
            System.out.println("informe o que deseja fazer: ");
            op = entrada.nextInt();
switch (op) {
        case 1:
        armazenarOpUm = this.metodoInserir(entrada, vetor, armazenarOpUm);
        break;
        case 2:
        this.metodoPesquisar(entrada, vetor);
        break;
        case 3:
        this.metodoAlterar(entrada, vetor);
        break;
        case 4:
        this.metodoExcluir(entrada, vetor);
        break;
        case 5:
        this.metodoMostrar(vetor);
        break;
        case 6:
        this.metodoOrdenar(vetor);
        break;
        case 7:
        this.metodoInverter(vetor);
        break;
        case 8:
        break;
    default:
        break;
}
        } while (op != 8);





    }// end constructor



///Método para Inserir os valores
    public int metodoInserir (Scanner entrada, int[] vetor, int armazenarOpUm) {
        System.out.println("Digite um número inteiro para o vetor: ");
        int numero = entrada.nextInt();
            vetor[armazenarOpUm] = numero;
            armazenarOpUm++;
        
        return armazenarOpUm;
        }
    


///Método para pesquisar os valores
        public void metodoPesquisar (Scanner entrada, int[] vetor){
            System.out.println("Digite um  valor a pesquisar: ");
            int valor = entrada.nextInt();
            for (int cont = 0; cont < vetor.length; cont++) {
                if (vetor[cont] == valor) {
                    System.out.println( "O valor: " + valor + "se encontra no índece " + cont + " do vetor");
                }
            }
        }



///Método para Alterar os valores
        public void metodoAlterar (Scanner entrada, int[]vetor){
            System.out.println("Digite o valor que deseja ser transformado: ");
            int valor = entrada.nextInt();
            System.out.println("Quer transformar ele em qual número? ");
            int valorTrans = entrada.nextInt();

            boolean achou = false;
            for (int cont = 0; cont < vetor.length; cont++) {
                if (vetor[cont] == valor) {
                    vetor[cont] = valorTrans;
                    System.out.println("Valor transformado com sucesso!");
                    achou = true;
                    break;
                }
                
            }
            if (!achou == true) {
                System.out.println("O valor que deseja transformar não se encontra no vetor :( ");
            }
        }



//Método para excluir os valores
        public void metodoExcluir (Scanner entrada, int[] vetor){
            System.out.println("Digite um valor para excluir do vetor: ");
            int valor = entrada.nextInt();

            boolean excluido = false;
            for (int cont = 0; cont < vetor.length - 1; cont++){
                if (vetor[cont] == valor) {
                    for (int i = cont; i < vetor.length - 1; i++){
                        vetor[i] = vetor[i +1];
                        
                }
                vetor[vetor.length - 1] = 0;
                excluido = true;
                System.out.println("");
                System.out.println("Valor excluído com sucesso!");
                break;
                }
            }
            if (!excluido == true) {
                System.out.println("Este valor não se encontra no vetor :(");
            }
        }



///Método para mostrar os valores
        public void metodoMostrar (int[] vetor) {
            for (int cont = 0; cont < vetor.length; cont++){
                System.out.println("índice " + cont + " " + vetor[cont]);
            }
        }



///Método para ordenar os valores
        public void metodoOrdenar (int[] vetor){
            int aux;
            boolean controle;
            for (int cont = 0; cont < vetor.length; cont++){
                controle = true;
                for (int i = 0; i < (vetor.length - 1); i++){
                    if (vetor[i] > vetor[i + 1]) {
                        aux = vetor[i];
                        vetor[i] = vetor[i + 1];
                        vetor[i + 1] = aux;
                        controle = false;
                    }
                }
                if (controle) {
                    break;
                }
            }
            for (int cont = 0; cont < vetor.length; cont++){
                System.out.println("índice " + cont + ": " + vetor[cont]);
            }
        }



///Método para inverter os valores
        public void metodoInverter (int[] vetor){
            int aux = 0;
        for (int cont = 0; cont < vetor.length; cont++){
            for(int i = 0; i < cont; i++){
                aux = vetor[cont];
                vetor[cont] = vetor[i];
                vetor[i] = aux;
            }
        }
        for (int cont = 0;  cont < vetor.length; cont++) {
            System.out.println("índice " + cont + ": " + vetor[cont]);
        }
        }



    public static void main(String[] args) {
        new ex10();
    }
}