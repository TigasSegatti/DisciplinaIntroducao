import java.util.Scanner;

public class Uni6Exe10 {
    public Uni6Exe10() {
        Scanner scan = new Scanner(System.in);
        int capacidade = 50;
        int tamanho = 0;
        int vetor[] = new int[10];
        int valor=0;
        int op = 0;
        int indice=0;
        do {
            this.exibirMenu(scan, op);
            switch (op) {
                case 1:
                this.inserirValor(op, tamanho, capacidade, vetor, scan, valor);
                    break;
                case 2:
                this.pesquisarValor(valor, scan, vetor);
                    break;
                case 3:
                    this.alterarValor(vetor, scan, tamanho);
                    break;
                case 4:
                   this.excluirValor(vetor,indice,tamanho,scan);
                    break;
                case 5:
                    for (int i = 0; i < vetor.length; i++) {
                        System.out.print("Indice: " + i + " valor : " + vetor[i]);
                        System.out.println();
                    }
                    break;
                case 6:
                    int aux = 0;
                    for (int i = 0; i < vetor.length; i++) {
                        for (int j = 0; j < 9; j++) {
                            if (vetor[j] > vetor[j + 1]) {
                                aux = vetor[j];
                                vetor[j] = vetor[j + 1];
                                vetor[j + 1] = aux;
                            }
                        }
                    }
                    break;
                case 7:
                int temp= 0;
                for(int i= 0; i<vetor.length;i++){
                    for(int j=0;j<i;j++){
                        temp=vetor[i];
                        vetor[i]=vetor[j];
                        vetor[j]=temp;
                    }
                }
                    break;
                default:
                    System.out.println("erro");
                    break;
            }

        } while (op != 8);

        scan.close();

    }
    public void exibirMenu(Scanner scan,int op){
        System.out.println("Menu");
        System.out.println("1-Incluir valor");
        System.out.println("2-Pesquisar valor");
        System.out.println("3-Alterar valor");
        System.out.println("4-Excluir valor");
        System.out.println("5-Mostrar valores");
        System.out.println("6-Ordenar valores");
        System.out.println("7-Inverter valores");
        System.out.println("8-Sair do sistema");
        System.out.println("informe o que deseja fazer: ");
            op = scan.nextInt();
    }
    public void excluirValor(int[] vetor,int indice,int tamanho, Scanner scan){
        System.out.println("informe o indice que deseja excluir: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Indice: " + i + " valor : " + vetor[i]);
            System.out.println();
        }
        System.out.print("Digite o índice do valor a ser excluido entre 0 e 10: ");
        indice = scan.nextInt();
        if (indice >= 0 || indice <= tamanho) {
            vetor[indice] = 0;
            System.out.println("Valor excluido com sucesso.");
        } else {
            System.out.println("Índice inválido.");
        }
    }
    public void inserirValor(int op,int tamanho,int capacidade,int[] vetor,Scanner scan,int valor){
        if (tamanho < capacidade) {
            System.out.print("Digite o valor a ser incluído: ");
            valor = scan.nextInt();
            vetor[tamanho] = valor;
            tamanho++;
            System.out.println("Valor " + valor + " incluído no vetor.");
        } else {
            System.out.println("O vetor está cheio. Não é possível incluir mais valores.");
        }
    }
    public void pesquisarValor(int valor,Scanner scan,int[] vetor){
        System.out.println("informe o valor a ser procurado: ");
        valor = scan.nextInt();
        boolean achei = true;
        for (int i = 0; i < vetor.length; i++) {
            if (valor == vetor[i]) {
                System.out.println("Encontrei o valor " + valor + " no inidice: " + i);
            } else {
                achei = false;
            }
        }
        if (!achei) {
            System.out.println("Não encontrei o valor");
        }
    }
    public void alterarValor(int[] vetor,Scanner scan,int tamanho){
        System.out.println("informe o indice que deseja alterar: ");
                    for (int i = 0; i < vetor.length; i++) {
                        System.out.print("Indice: " + i);
                        System.out.println();
                        System.out.print("valor " + vetor[i] + " ");
                    }
                    System.out.print("Digite o índice do valor a ser alterado entre 0 e 10: ");
                    int indice = scan.nextInt();
                    if (indice >= 0 || indice <= tamanho) {
                        System.out.print("Digite o novo valor: ");
                        int novoValor = scan.nextInt();

                        vetor[indice] = novoValor;
                        System.out.println("Valor alterado com sucesso.");
                    } else {
                        System.out.println("Índice inválido.");
                    }
    }
    public static void main(String[] args) {
        new Uni6Exe10();
    }

}
