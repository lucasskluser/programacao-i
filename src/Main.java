import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //cinco();
        seis();
        //dezessete();
    }

    //Faça um programa que leia dois vetores de 10 posições de caracteres.
    // A seguir, troque o 1º elemento do vetorA com o 10º do vetorB, o 2º do
    // vetorA com o 9º do vetorB, assim por diante, até trocar o 10º do vetorA
    // com o 1º do vetorB. Mostre os vetores antes e depois da troca.
    private static void cinco() {
        char[] vetorA = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
        char[] vetorB = {'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        int indiceB = 9;

        for(int i = 0; i < vetorA.length; i++) {
            char elementoA;
            char elementoB;

            elementoA = vetorB[indiceB];
            elementoB = vetorA[i];

            vetorA[i] = elementoA;
            vetorB[indiceB--] = elementoB;
        }

        System.out.print("Vetor A: ");

        for(char elemento : vetorA) {
            System.out.print(String.format("%s, ", elemento));
        }

        System.out.print("\nVetor B: ");

        for(char elemento : vetorB) {
            System.out.print(String.format("%s, ", elemento));
        }
    }

    // Dado um vetor com MAX elementos, inicialize-o com números N inteiros
    // aleatórios entre -50 e 50. O valor de N (N ≤MAX)  também  deve  ser
    // determinado  aleatoriamente.  Exiba  o  vetor  gerado  na  tela  e,
    // em  seguida,  remova  do  vetor todos os valores negativos, fazendo os
    // deslocamentos necessários no vetor. Exiba o vetor novamente após a operação.
    private static void seis() {
        // Gera o tamanho aleatório
        Random random = new Random();
        int maximo = random.nextInt((50 - (-50)) + 1) + (-50);

        // Enquanto o tamanho máximo for negativo
        while(maximo < 0) {
            // Gera um novo tamanho aleatório
            maximo = random.nextInt((50 - (-50)) + 1) + (-50);
        }

        // Define os vetores com o tamanho máximo aleatório
        int[] numeros = new int[maximo];
        int[] resultado = new int[maximo];

        // Define o valor de cada elemento no vetor
        for(int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt((50 - (-50)) + 1) + (-50);
        }

        // Exibe o vetor gerado
        for(int numero : numeros) {
            System.out.print(String.format("%d, ", numero));
        }

        int elemento;

        for(int i = 0; i < numeros.length; i++) {
            if(numeros[i] < 0) {
                for(int j = i; j < ((numeros.length - 1) - i); j++) {
                    numeros[]
                }
            }
        }
    }
    private static void dezessete() {
        int[] seq1 = {8, 2, 4, 3, 4, 2, 5, 1};
        int[] seq2 = {2, 1, 9, 5, 2, 3, 6, 7};

        // Declara um vetor no tamanho do maior vetor + 1
        int[] result = new int[seq1.length + 1];
        boolean estouro = false; // Armazena o estouro da soma
        for(int i = (seq1.length - 1); i >= 0; i--) {
            int soma = estouro ? seq1[i] + seq2[i] + 1 : seq1[i] + seq2[i];
            estouro = soma >= 10;

            result[i+1] = soma % 10;
        }

        result[0] = estouro ? 1 : 0;

        for(int resultado : result) {
            System.out.print(resultado + ", ");
        }


    }
}