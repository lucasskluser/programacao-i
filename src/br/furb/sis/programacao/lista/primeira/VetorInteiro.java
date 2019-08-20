package br.furb.sis.programacao.lista.primeira;
/*
 * Crie uma classe chamada VetorInteiros, que internamente
 * possui um vetor de 5 inteiros (int). Implemente métodos
 * para:
 * a) Receber os 5 valores (pode ser o construtor);
 * b) Retornar a soma dos elementos;
 * c) Retornar o valor do maior elemento;
 * d) Retornar a posição do menor elemento;
 * e) Retornar o N-ésimo elemento;
 * f) Verificar se o número X existe na lista.
 */
public class VetorInteiro {
    private int[] vetor;

    public VetorInteiro(int[] vetor) {
        this.vetor = vetor;
    }

    public int soma() {
        int total = 0;

        for(int elemento : this.vetor) {
            total += elemento;
        }

        return total;
    }

    public int maiorElemento() {
        int maiorElemento = -999999;

        for(int elemento : vetor) {
            if(elemento > maiorElemento) {
                maiorElemento = elemento;
            }
        }

        return maiorElemento;
    }

    public int posicaoMenorElemento() {
        int menorElemento = 100000;
        int posicaoMenorElemento = -1;

        for(int i = 0; i < vetor.length; i++) {
            if(vetor[i] < menorElemento) {
                menorElemento = vetor[i];
                posicaoMenorElemento = i;
            }
        }

        return posicaoMenorElemento;
    }

    public int elemento(int indice) {
        return vetor[indice];
    }

    public boolean verificaSeExiste(int numero) {
        for(int elemento : vetor) {
            if(elemento == numero) {
                return true;
            }
        }

        return false;
    }
}
