import java.util.Scanner;

public class Uni6Exe10 {
    public Uni6Exe10() {
        Scanner scan = new Scanner(System.in);
        int capacidade = 10;
        int tamanho = 0;
        int vetor[] = new int[10];
        int op = 0;
        do {
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
            switch (op) {
                case 1:
                    tamanho = inserir(scan, tamanho, capacidade, vetor);
                    break;
                case 2:
                    pesquisarValor(op, scan, vetor);

                    break;
                case 3:
                    alterarValor(vetor, scan, op);

                    break;
                case 4:
                    excluirValor(vetor, op, scan);
                    break;
                case 5:
                    exibirVetor(vetor);
                    break;
                case 6:
                    ordenarVetor(tamanho, vetor);
                    break;
                case 7:
                    inverterVetor(tamanho, vetor);
                    break;
                case 8:
                    System.out.println("Saindo");
                    op = 8;
                    break;
                default:
                    System.out.println("erro");

                    break;
            }

        } while (op != 8);

        scan.close();
    }

    private void ordenarVetor(int tamanho, int[] vetor) {

        // ordenar
        // colocado tamanho porque dessa forma considera apenas a quantidade de
        // elementos que foram adicionados
        // vetor.lenght iria considerar posições nulas
        int aux = 0;
        for (int i = 0; i < tamanho; i++) {
            // Tamanho -1 pois termina em um anterior, pois termina em 9 e não dez
            for (int j = 0; j < tamanho - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux; // J+1 sempre considera uma posição a mais, por isso terá que ir até
                                        // 8
                }
            }
        }
    }

    private void inverterVetor(int tamanho, int[] vetor) {
        // Mesma coisa que 6
        int temp = 0;
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < i; j++) {
                temp = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = temp;
            }
        }
    }

    private void exibirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Indice: " + i + " valor : " + vetor[i]);
            System.out.println();
        }
    }

    private void excluirValor(int[] vetor, int tamanho, Scanner scan) {
        System.out.println("informe o indice que deseja excluir: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Indice: " + i + " valor : " + vetor[i]);
            System.out.println();
        }
        System.out.print("Digite o índice do valor a ser excluido entre 0 e 10: ");
        int indice = scan.nextInt();
        if (indice >= 0 || indice <= tamanho) {
            vetor[indice] = 0;
            System.out.println("Valor excluido com sucesso.");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    private void alterarValor(int[] vetor, Scanner scan, int tamanho) {
        System.out.println("informe o indice que deseja alterar: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Indice: " + (i-1));
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

    private void pesquisarValor(int valor, Scanner scan, int[] vetor) {
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

    public int inserir(Scanner scan, int tamanho, int capacidade, int vetor[]) {
        if (tamanho < capacidade) {
            System.out.print("Digite o valor a ser incluído: ");
            int valor = scan.nextInt();
            vetor[tamanho] = valor;
            tamanho++;
            System.out.println("Valor " + valor + " incluído no vetor.");
        } else {
            System.out.println("O vetor está cheio. Não é possível incluir mais valores.");
        }
        return tamanho;
    }

    public static void main(String[] args) {
        new Uni6Exe10();
    }

}