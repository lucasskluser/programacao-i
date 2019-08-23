package br.furb.sis.programacao.lista.primeira;

/*
     * Crie uma classe chamada VetorReais, que internamente possui um vetor de n
     * reais (double). n é passado como parâmetro na criação do objeto. Implemente
     * métodos para:
     * a) Receber os n valores;
     * b) Retornar o valor da multiplicação (M) entre este objeto de VetorReais e
     * outro objeto recebido como parâmetro, de tal modo que
     * M = (A[1] * B[n]) + (A[2] * B[n-1]) + ...
     * c) Retornar um novo objeto de VetorReais, criado a partir da divisão deste
     * objeto por outro objeto recebido como parâmetro, sendo novo[i] = A[i] / B[i];
     * d) Inverter a posição dos elementos do vetor, ou seja, o primeiro elemento vai
     * para a posição do último elemento e o último elemento vai para a posição do
     * primeiro elemento, o segundo elemento vai para a posição do penúltimo elemento
     * e o penúltimo elemento vai para a posição do segundo elemento, e assim por
     * diante;
     * e) Retornar a maior diferença entre dois elementos consecutivos do vetor.
 */
public class VetorReais {
    double[] vetor;

    public VetorReais(int tamanho) {
        vetor = new double[tamanho];
    }

    public void defineVetor(double[] vetor) {
        this.vetor = vetor;
    }

    public double multiplicacao(VetorReais obj) throws Exception {
        double multiplicacao = 0;

        if(this.vetor.length != obj.vetor.length) {
            throw new Exception("Os vetores devem ter o mesmo tamanho!");
        }

        // M = (A[1] * B[n]) + (A[2] * B[n-1]) + ...
        for(int i = 0, j = (obj.vetor.length - 1); i < this.vetor.length; i++, j--) {
            multiplicacao += (this.vetor[i] * obj.vetor[j]);
        }

        return multiplicacao;
    }

    public VetorReais novoObjeto(VetorReais obj) throws Exception {
        VetorReais novoObjeto = new VetorReais(this.vetor.length);

        if(this.vetor.length != obj.vetor.length) {
            throw new Exception("Os vetores devem ter o mesmo tamanho!");
        }

        for(int i = 0; i < this.vetor.length; i++) {
            novoObjeto.vetor[i] = (this.vetor[i] / obj.vetor[i]);
        }

        return novoObjeto;
    }

    public void inverteVetor() {
        double[] aux = vetor;

        for(int i = 0, j = vetor.length - 1; i < vetor.length; i++, j--) {
            vetor[i] = aux[j];
        }
    }

    public double[] retornaVetor() {
        return this.vetor;
    }
}
