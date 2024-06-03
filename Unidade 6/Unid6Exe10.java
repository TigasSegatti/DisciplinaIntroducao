import java.util.Scanner;

public class Unid6Exe10 {
    /*
     * Uni6Exe10.java - Dado um vetor de números inteiros, com capacidade limitada a
     * 50 elementos, faça um programa que construa um menu com as seguintes opções:
     * 
     * “1 – Incluir valor”: nesta opção inclua o valor no fim do vetor, se houver
     * espaço. Informe o usuário se o valor foi incluído no vetor ou não;
     * “2 – Pesquisar valor”: nesta opção leia um valor e informe se o mesmo está no
     * vetor;
     * “3 – Alterar valor”: nesta opção informe um número a ser alterado e um novo
     * número a ser colocado no lugar (só para a primeira ocorrência deste número).
     * Caso o número a ser alterado exista no vetor, substitua-o pelo novo número.
     * Caso contrário, informe “número não encontrado”;
     * “4 – Excluir valor”: nesta opção leia um valor e, caso ele esteja no vetor,
     * exclua-o. Informe o usuário se o valor foi excluído do vetor ou não. A
     * posição que foi excluída o valor deve ser preenchida pelo valor seguinte,
     * sucessivamente até o final dos valores do vetor;
     * “5 – Mostrar valores”: nesta opção mostre todos os valores armazenados no
     * vetor;
     * “6 – Ordenar valores”: ordene todos os valores do vetor em ordem crescente;
     * “7 – Inverter valores”: desafio (ver abaixo);
     * “8 – Sair do sistema”: nesta opção deve ser finalizada a execução do
     * programa.
     * Faça um método para cada uma das opções do menu. O menu deve-se repetir até
     * que o usuário escolha a opção 8.
     * 
     * Desafio: adapte o código acima para ter mais uma opção no menu para também
     * poder inverter os elementos dentro de um vetor.
     */
    public Unid6Exe10() {
        Scanner teclado = new Scanner(System.in);
        int vetor[] = new int[50];
        int quantidade = 0;
        int menu = 0;

        do {

            System.out.println("Escolha uma opção:");
            System.out.println("1 - Inserir\n2 - Pesquisar\n3 - Alterar");
            System.out.println("4 - Excluir\n5 - Mostrar\n6 - Ordenar");
            System.out.println("7 - Inverter\n8 - Sair");

            menu = teclado.nextInt();

            switch (menu) {
                case 1:
                    System.out.print("Digite um número para inserir: ");
                    int numero = teclado.nextInt();
                    quantidade = inserir(vetor, numero, quantidade);
                    break;
                case 2:
                    System.out.print("Digite um número para pesquisar: ");
                    numero = teclado.nextInt();
                    if (pesquisar(vetor, numero, quantidade) != -1) {
                        System.out.println("Número encontrado");
                    } else {
                        System.out.println("Número não existe no vetor");
                    }
                    break;
                case 3:
                    System.out.print("Digite um número para alterar: ");
                    numero = teclado.nextInt();
                    System.out.print("Digite o novo número: ");
                    int novoNumero = teclado.nextInt();
                    alterar(vetor, numero, novoNumero, quantidade);
                    break;
                case 4:
                    System.out.print("Digite um número para excluir: ");
                    numero = teclado.nextInt();
                    int tamanho = excluir(vetor, numero, quantidade);
                    if (tamanho != -1) {
                        quantidade = tamanho;
                        System.out.println("Número excluído com sucesso");
                    } else {
                        System.out.println("Número inexistente, não foi excluído");
                    }
                    break;
                case 5:
                    mostrar(vetor, quantidade);
                    break;
                case 6: // Bolha
                    break;
                case 7: // Inverter
                    inverter(vetor, quantidade);
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (menu != 8);

        teclado.close();
    }
    private void inverter(int vet[], int tamanho) {
        int temp = 0;
        for (int i = 0; i < tamanho; i++) {
          for (int x = 0; x < i; x++) {
            temp = vet[i];
            vet[i] = vet[x];
            vet[x] = temp;
          }
        }
      }

    private void mostrar(int[] vetor, int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            System.out.println(vetor[i]);
        }
    }

    private int excluir(int[] vetor, int numero, int tamanho) {
        int indice = pesquisar(vetor, numero, tamanho);
        if (indice != -1) {
            for (int i = indice; i < tamanho - 1; i++) {
                vetor[i] = vetor[i + 1];
            }
            tamanho--;
            return tamanho;
        } else {
            return -1;
        }
    }

    private void alterar(int[] vetor, int numero, int novoNumero, int tamanho) {
        int indice = pesquisar(vetor, numero, tamanho);
        if (indice != -1) {
            vetor[indice] = novoNumero;
            System.out.println("Número foi alterado");
        } else {
            System.out.println("Não foi possível alterar o número, pois não existe");
        }
    }

    private int pesquisar(int[] vetor, int numero, int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == numero) {
                return i;
            }
        }
        return -1;
    }

    private int inserir(int[] vetor, int numero, int tamanho) {
        if (tamanho < vetor.length) {
            vetor[tamanho] = numero;
            tamanho++;
            System.out.println("Dados inseridos com sucesso");
        } else {
            System.out.println("Vetor está cheio. Não é possível inserir");
        }
        return tamanho;
    }

    public static void main(String[] args) {
        new Unid6Exe10();
    }
}