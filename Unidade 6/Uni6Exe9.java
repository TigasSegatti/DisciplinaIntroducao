import java.util.Scanner;

public class Uni6Exe9 {
    public Uni6Exe9() {
        Scanner scan = new Scanner(System.in);
        int[] sexos = new int[10];
        float[] notas = new float[10];
        int[] idades = new int[10];

        this.preencherVetor(scan, 0, sexos, notas, 0, 0, idades);
        int sexo, idade;
        float somaMasculina = 0, somaNotas = 0, notaMulherNova = -1, mediaNotas;
        int qtdMulheres,qtdHomens;


        mediaNotas = somaNotas / 10;

        float mediaMasc = this.mediaMasc(sexos, notas);
        notaMulherNova = this.notaMulherNova(sexos, idades, notas);
        int qtdMulheres50 = this.qtdMulheres50(sexos, idades, notas, mediaNotas);

        this.exbirTudo(mediaNotas, mediaMasc, notaMulherNova, qtdMulheres50);
    }
    public void preencherVetor(Scanner scan,int sexo,int[] sexos,float[] notas,float somaNotas,int idade,int idades[]){
        int qtdHomens=0;
        int qtdMulheres=0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Informe 1 = Feminino e 2 = Masculino: ");
            sexo = scan.nextInt();
            while (sexo != 1 && sexo != 2) {
                System.out.println("Sexo inválido");
                System.out.println("Digite novamente: ");
                sexo = scan.nextInt();
            }
            sexos[i] = sexo;

            System.out.println("Informe uma nota de 0 a 10: ");
            float nota = scan.nextFloat();
            while (nota < 0 || nota > 10) {
                System.out.println("Nota inválida");
                System.out.println("Digite novamente: ");
                nota = scan.nextFloat();
            }
            notas[i] = nota;
            somaNotas += notas[i];

            System.out.println("Informe a sua idade: ");
            idade = scan.nextInt();
            while (idade < 0 || idade > 100) {
                System.out.println("Idade inválida");
                System.out.println("Digite novamente: ");
                idade = scan.nextInt();
            }
            idades[i] = idade;
        }
    }

    public void exbirTudo(float mediaNotas, float mediaMasc, float notaMulherNova, int qtdMulheres50) {
        System.out.println("A média de notas do cinema será: " + mediaNotas);
        System.out.println("Média de notas masculinas: " + mediaMasc);
        if (notaMulherNova != -1) {
            System.out.println("A Nota atribuída da mulher mais nova será: " + notaMulherNova);
        } else {
            System.out.println("Não há mulheres no grupo.");
        }
        System.out.println("A quantidade de mulheres com mais de 50 anos que deram nota superior à média do cinema será: " + qtdMulheres50);
    }

    public float notaMulherNova(int[] sexos, int[] idades, float[] notas) {
        float notaMulherNova = -1;
        int mulherMaisNova = Integer.MAX_VALUE;
        for (int i = 0; i < 10; i++) {
            if (sexos[i] == 1) {
                if (idades[i] < mulherMaisNova) {
                    mulherMaisNova = idades[i];
                    notaMulherNova = notas[i];
                }
            }
        }
        return notaMulherNova;
    }

    public int qtdMulheres50(int[] sexos, int idades[], float[] notas, float mediaNotas) {
        int qtdMulheres50 = 0;
        for (int i = 0; i < 10; i++) {
            if (sexos[i] == 1) {
                if (idades[i] > 50 && notas[i] > mediaNotas) {
                    qtdMulheres50++;
                }
            }
        }
        return qtdMulheres50;
    }

    public float mediaMasc(int[] sexos, float[] notas) {
        float somaMasculina = 0;
        int contadorMasculino = 0;
        for (int i = 0; i < 10; i++) {
            if (sexos[i] == 2) {
                somaMasculina += notas[i];
                contadorMasculino++;
            }
        }
        if (contadorMasculino > 0) {
            return somaMasculina / contadorMasculino;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        new Uni6Exe9();
    }
}
