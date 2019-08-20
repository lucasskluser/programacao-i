package br.furb.sis.programacao.teste;

public class Vetor {
    public int[] inverteVetor(int[] vetor, int posicaoInicial, int posicaoFinal) {

        if(posicaoInicial >= posicaoFinal) {
            return vetor;
        } else {
            int aux = vetor[posicaoInicial];
            vetor[posicaoInicial] = vetor[posicaoFinal];
            vetor[posicaoFinal] = aux;
            vetor = inverteVetor(vetor, posicaoInicial + 1, posicaoFinal - 1);
        }

        return vetor;
    }
}
