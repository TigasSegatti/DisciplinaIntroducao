package Prova;
import java.util.Scanner;

public class ProvaQest1 {
    public ProvaQest1() {

        Scanner scan = new Scanner(System.in);
        int op = 1;
        System.out.println("informe o tamanho da mochila");
        int tamanhoMochila = scan.nextInt();
        System.out.println("Informe o peso máximo da mochila: ");
        int pesoMochila = scan.nextInt();
        int mochilaNumeral[] = new int[tamanhoMochila];
        String mochilaVisual[] = new String[tamanhoMochila];
        int pesoAtualMochila = 0;
        int contador = 0;
        do {
            System.out.println("___________\nMenu\nInforme o que deseja fazer: ");
            System.out.println("1-Inserir item na mochila ");
            System.out.println("2-Imprimir(inversamente) a mochila: ");
            System.out.println("3-Valor do item mais pesado: ");
            System.out.println("4-Ordenar mochila: ");
            System.out.println("5-Excluir item da mochila: ");
            System.out.println("6-Sair do programa: ");
            op = scan.nextInt();
            switch (op) {
                case 1:
                this.inserir(contador, scan, pesoAtualMochila, pesoMochila, contador, mochilaNumeral, mochilaVisual);
                    break;
                case 2:
                    mostrarInversa(mochilaNumeral, mochilaVisual);
                    break;
                case 3:
                    pesarMaior(mochilaNumeral, mochilaVisual);
                    break;
                case 4:
                    ordernar(mochilaNumeral, mochilaVisual, pesoMochila);
                    break;
                case 5:
                    pesoAtualMochila = excluir(scan, mochilaVisual, mochilaNumeral, pesoAtualMochila, contador);
                    break;
                case 6:
                    System.out.println("Saindo do programa");
                    op = 6;
                    break;
                default:
                    System.out.println("Erro ao informar opção");
                    break;
            }

        } while (op != 6);

        scan.close();
    }

    public void inserir(int tamanhoMochila,Scanner scan,int pesoAtualMochila,int pesoMochila,int contador,int[] mochilaNumeral,String[] mochilaVisual){
        if (contador < tamanhoMochila) {
            System.out.println("O que deseja inserir?: ");
            String novoItem = scan.next();
            System.out.println("Informe o peso: ");
            int pesoNovoItem = scan.nextInt();
            if ((pesoNovoItem + pesoAtualMochila) <= pesoMochila) {
                mochilaVisual[contador] = novoItem;
                mochilaNumeral[contador] = pesoNovoItem;
                contador++;
                pesoAtualMochila += pesoNovoItem;
                System.out.println(novoItem + " colocado(a) dentro da mochila com sucesso");
                System.out.println("Novo peso da mochila: " + pesoAtualMochila);
            } else {
                System.out.println("Item pesado demais");
            }
        } else {
            System.out.println("Mochila cheia");
        }
    }

    private void ordernar(int[] mochilaNumeral, String[] mochilaVisual, int contador) {
        int aux = 0;
        String auxDois = "";
        for (int i = 0; i < mochilaNumeral.length; i++) {
            for (int j = 0; j < mochilaNumeral.length - 1; j++) {
                if (mochilaNumeral[j] > mochilaNumeral[j + 1]) {
                    aux = mochilaNumeral[j];
                    auxDois = mochilaVisual[j];
                    mochilaNumeral[j] = mochilaNumeral[j + 1];
                    mochilaVisual[j] = mochilaVisual[j + 1];
                    mochilaNumeral[j + 1] = aux;
                    mochilaVisual[j + 1] = auxDois;
                }
            }
        }
        System.out.println("Ordenada!");
    }

    private int excluir(Scanner scan, String[] mochilaVisual, int[] mochilaNumeral, int pesoAtualMochila,int contador) {
        System.out.println("_______\nInforme o item que deseja excluir: ");
        String itemExcluir = scan.next();
        boolean achei = true;
        for (int i = 0; i < contador; i++) {
            if (itemExcluir.equals(mochilaVisual[i])) {
                pesoAtualMochila -= mochilaNumeral[i];
                mochilaNumeral[i] = mochilaNumeral[contador - 1];
                mochilaVisual[i] = mochilaVisual[contador - 1];
                mochilaNumeral[contador - 1] = 0;
                mochilaVisual[contador - 1] = "Vazio";
                contador--;
                achei = true;
                break;
            } else {
                achei = false;
            }
        }
        if (achei) {
            System.out.println("Deletado com sucesso!");
        } else {
            System.out.println("Não encontrei o item!");
        }
        return pesoAtualMochila;
    }

    private void mostrarInversa(int[] mochilaNumeral, String[] mochilaVisual) {
        System.out.println("_______\nImprimindo inversamente mochila: ");
        System.out.println("Item e pesagem");
        for (int j = mochilaNumeral.length - 1; j >= 0; j--) {
            System.out.println((mochilaVisual[j]) + " " + (mochilaNumeral[j]));
        }
    }

    private void pesarMaior(int[] mochilaNumeral, String[] mochilaVisual) {
        int maisPesado = Integer.MIN_VALUE;
        String maisPesadoEscrito = "";
        for (int i = 0; i < mochilaNumeral.length; i++) {
            if (mochilaNumeral[i] > maisPesado) {
                maisPesado = mochilaNumeral[i];
                maisPesadoEscrito = mochilaVisual[i];
            }
        }
        System.out.println("O item mais pesado é: " + maisPesadoEscrito + " pesando " + maisPesado + " Kilos.");
    }

    public static void main(String[] args) {
        new ProvaQest1();
    }
}