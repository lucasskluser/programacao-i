package br.furb.sis.programacao.lista.vetor.primeira;

import java.util.Random;

public class ExercicioNumerico {

    /*
     * Faça um programa que leia dois vetores de 10 posições de caracteres.
     * A seguir, troque o 1º elemento do vetorA com o 10º do vetorB, o 2º do
     * vetorA com o 9º do vetorB, assim por diante, até trocar o 10º do vetorA
     * com o 1º do vetorB. Mostre os vetores antes e depois da troca.
     */
    public static void cinco() {
        char[] vetorA = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
        char[] vetorB = {'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        int indiceB = vetorB.length - 1;

        for (int i = 0; i < vetorA.length; i++) {
            char elementoA;
            char elementoB;

            elementoA = vetorB[indiceB];
            elementoB = vetorA[i];

            vetorA[i] = elementoA;
            vetorB[indiceB--] = elementoB;
        }

        System.out.print("Vetor A: ");

        for (char elemento : vetorA) {
            System.out.print(String.format("%s, ", elemento));
        }

        System.out.print("\nVetor B: ");

        for (char elemento : vetorB) {
            System.out.print(String.format("%s, ", elemento));
        }
    }

    /*
     * Dado um vetor com MAX elementos, inicialize-o com números N inteiros
     * aleatórios entre -50 e 50. O valor de N (N ≤ MAX)  também  deve  ser
     * determinado  aleatoriamente.  Exiba  o  vetor  gerado  na  tela  e,
     * em  seguida,  remova  do  vetor todos os valores negativos, fazendo os
     * deslocamentos necessários no vetor. Exiba o vetor novamente após a operação.
     */
    public static void seis() {
        // Gera o tamanho aleatório
        Random random = new Random();
        int maximo = random.nextInt((50 - (-50)) + 1) + (-50);

        // Valor reservado para substituir números negativos
        int negativo = 99;

        // Enquanto o tamanho máximo for negativo
        while (maximo < 0) {
            // Gera um novo tamanho aleatório
            maximo = random.nextInt((50 - (-50)) + 1) + (-50);
        }

        // Define o vetor com o tamanho máximo aleatório
        int[] numeros = new int[maximo];

        // variável para armazenar o número de elementos não negativos no vetor aleatório.
        // Dessa forma, será possível gerar um vetor resultado com o tamanho necessário para
        // armazenar os elementos não negativos.
        int tamanhoResultado = 0;

        // Define o valor de cada elemento no vetor aleatóriamente
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt((50 - (-50)) + 1) + (-50);
        }

        // Exibe o vetor gerado
        for (int numero : numeros) {
            System.out.print(String.format("%d, ", numero));
        }

        // Percorre o vetor de números aleatórios
        for (int i = 0; i < numeros.length; i++) {
            // Se o numero[i] for menor que zero
            if (numeros[i] < 0) {
                // Substitui ele pelo valor da variável 'negativo'
                numeros[i] = negativo;
                // Se o numero[i] não for menor que zero
            } else {
                // Soma um no tamanhoResultado
                tamanhoResultado++;
            }
        }

        // Declara um vetor com o tamanho definido pela variável 'tamanhoResultado'
        int[] resultado = new int[tamanhoResultado];
        // Variável que armazenará a posição no vetor resultado
        int posicaoResultado = 0;

        // Percorre o vetor de números aleatórios
        for (int numero : numeros) {
            // Se o 'numero' for mairo que zero e menor que 50
            if (numero >= 0 && numero <= 50) {
                // Salva ele na posição disponível no vetor 'resultado' e soma + 1 na 'posicaoResultado'
                resultado[posicaoResultado++] = numero;
            }
        }

        // Pula uma linha no console
        System.out.println("");

        // Exibe o vetor gerado
        for (int numero : resultado) {
            System.out.print(String.format("%d, ", numero));
        }
    }

    /*
     * Dada uma seqüência de Nnúmeros reais, determinar os números que compõem a
     * seqüência e a quantidadede vezes que cada um deles ocorre na mesma.
     */
    public static void sete() {
        // Declara um vetor de números inteiros
        double[] numeros = new double[]{-1.7, 3.0, 0.0, 1.5, 0.0, -1.7, 2.3, -1.7};

        // Declara um vetor para armazenar o número inteiro de forma única
        double[] numerosUnicos = new double[numeros.length];
        // Declara um vetor para armazenar o número de vezes que o número inteiro se repete
        int[] repeticaoNumeros = new int[numerosUnicos.length];

        // Percorre o vetor de números inteiros
        for (double numero : numeros) {

            // Escreve o número no console
            System.out.print(String.format("%.2f, ", numero));

            // Declara uma variável lógica
            // Essa variável ajudará a determinar se o número inteiro já está
            // alocado no vetor de números únicos ou não
            boolean contemNumero = false;

            // Percorre o vetor de números únicos
            for (int i = 0; i < numerosUnicos.length; i++) {
                // Se o 'numero' for igual ao numerosUnicos[i]
                if (numero == numerosUnicos[i]) {
                    // Soma + 1 na repeticaoNumeros[i]
                    repeticaoNumeros[i]++;
                    // Define que o número já está no vetor de números únicos
                    contemNumero = true;
                    // Interrompe o loop
                    break;
                }
            }

            // Se o vetor de números únicos não contém o número inteiro
            if (!contemNumero) {
                // Percorre o vetor de números únicos
                for (int i = 0; i < repeticaoNumeros.length; i++) {
                    // Se a posição repeticaoNumeros[i] estiver vazia (= 0)
                    if (repeticaoNumeros[i] == 0) {
                        // Salva o número inteiro naquela posição
                        numerosUnicos[i] = numero;
                        // Soma um na repeticaoNumeros[i]
                        repeticaoNumeros[i]++;
                        // Interrompe o loop
                        break;
                    }
                }
            }
        }

        // Pula uma linha no console
        System.out.println("");

        // Percorre o vetor de números únicos
        for (int i = 0; i < numerosUnicos.length; i++) {
            // Se o repeticaoNumeros[i] for maior que zero
            if (repeticaoNumeros[i] > 0) {
                // Escreve o número inteiro e o número de repetições no console
                System.out.println(String.format("%.1f ocorre %d vezes", numerosUnicos[i], repeticaoNumeros[i]));
            }
        }
    }

    /*
     * Vetores de caracteres podem ser utilizados para representar cadeias de DNA.
     * Diz-se que uma dada sequência de DNA possui certo grau de similaridade de
     * acordo com o número de bases que aparecem na mesma ordem. Implemente um
     * programa que, dada duas sequências de DNA, calcule o grau de similaridade.
     */
    public static void oito() {
        // Vetores de DNA
        char[] sequenciaDNA1 = new char[]{'A', 'T', 'C', 'G', 'T', 'C'};
        char[] sequenciaDNA2 = new char[]{'A', 'C', 'T', 'G', 'T', 'T'};

        int similaridade = 0;

        for (int i = 0; i < sequenciaDNA1.length; i++) {
            if (sequenciaDNA1[i] == sequenciaDNA2[i]) {
                similaridade++;
            }
        }

        System.out.print("Sequencia 1: ");

        for (char gene1 : sequenciaDNA1) {
            System.out.printf("%s, ", gene1);
        }

        System.out.print("\nSequencia 2: ");

        for (char gene2 : sequenciaDNA2) {
            System.out.printf("%s, ", gene2);
        }

        System.out.printf("\nSimilaridade: %d", similaridade);

    }

    /*
     *  Escreva um programa que leia um vetor de 13 elementos inteiros, que é o
     * Gabarito de um teste da loteria esportiva, contendo os valores 1(coluna 1),
     * 2 (coluna 2) e 3 (coluna do meio). Leia, a seguir, para cada apostador, o
     * número do seu cartão e um vetor de Respostas de 13 posições. Verifique para
     * cada apostador os números de acertos, comparando o vetor de Gabarito com o
     * vetor de Respostas. Escreva o número do apostador e o número de acertos. Se
     * o apostador tiver 13 acertos, mostrar a mensagem "Ganhador".
     */
    public static void dez() {
        // Não entendi
    }

    /*
     * Uma das formas de se enviar uma mensagem secreta é por meio de códigos
     * matemáticos. Onde, tanto o destinatário quanto o remetente possuem um
     * vetor chave C. O destinatário recebe do remetente um vetor M, tal que
     * M+C = P, onde P é o vetor mensagem a ser decodificado. Cada número do
     * P corresponde a uma letra do alfabeto: 1 = a, 2 = b, 3 = c,..., 23 = z
     * (consideremos o alfabeto com 23 letras, excluindo as letras k, w e y e,
     * o número zero corresponde ao espaço em branco).
     *
     * Com base nos conhecimentos e nas informações descritas, faça um programa
     * que decodifique a mensagem secreta contida no vetor P, assinalando a
     * alternativa que apresenta a mensagem que foi enviada. Por fim, mostre os
     * valores do vetor M.
     */
    public static void dezesseis() {
        char[] alfabeto = new char[]{' ', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'X', 'Z'};

        int[] vetorC = new int[]{1, 1, 0, 1, 0, -1, 0, 0, 2};
        int[] vetorP = new int[]{2, -10, 1, 0, 18, 37, 17, 19, 5};
        int[] vetorM = new int[vetorC.length];

        String mensagem = "";

        for(int i = 0; i < vetorC.length; i++) {
            vetorM[i] = vetorP[i] - vetorC[i];

            int posicao = vetorP[i] % (alfabeto.length - 1);
            posicao = posicao < 0 ? alfabeto.length + posicao : posicao;

            System.out.printf("%d ", posicao);

            mensagem += alfabeto[posicao];
        }

        System.out.println(mensagem);

        System.out.print("Vetor M: ");

        for(int elemento : vetorM) {
            System.out.printf("%d, ", elemento);
        }
    }
    public static void dezessete() {
        int[] seq1 = {8, 2, 4, 3, 4, 2, 5, 1};
        int[] seq2 = {2, 1, 9, 5, 2, 3, 6, 7};

        // Declara um vetor no tamanho do maior vetor + 1
        int[] result = new int[seq1.length + 1];
        boolean estouro = false; // Armazena o estouro da soma
        for (int i = (seq1.length - 1); i >= 0; i--) {
            int soma = estouro ? seq1[i] + seq2[i] + 1 : seq1[i] + seq2[i];
            estouro = soma >= 10;

            result[i + 1] = soma % 10;
        }

        result[0] = estouro ? 1 : 0;

        for (int resultado : result) {
            System.out.print(resultado + ", ");
        }
    }
}
