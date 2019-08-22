package br.furb.sis.programacao;

import br.furb.sis.programacao.lista.primeira.ExercicioNumerico;
import br.furb.sis.programacao.lista.primeira.VetorInteiro;
import br.furb.sis.programacao.lista.primeira.VetorReais;

public class Main {
    public static void main(String[] args) throws Exception {
        //ExercicioNumerico.dezesseis();
        //vetorInteiro();
        //vetorReais();
    }

    private static void vetorReais() {
        double[] vetorUm = new double[]{5.0, 6.3, 2.0, 4.7, 7.1, 1.0};
        double[] vetorDois = new double[]{4.0, 5.3, 1.0, 3.7, 6.1, 0.0};

        VetorReais vetorReaisUm = new VetorReais(vetorUm.length);
        vetorReaisUm.defineVetor(vetorUm);

        VetorReais vetorReaisDois = new VetorReais(vetorDois.length);
        vetorReaisDois.defineVetor(vetorDois);

        try {
            System.out.println(vetorReaisUm.multiplicacao(vetorReaisDois));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void vetorInteiro() throws Exception {
        int[] vetor = new int[]{5, 6, 7, 8, -1};
        VetorInteiro vetorInteiro = new VetorInteiro(vetor);

        System.out.printf("Soma: %d\n", vetorInteiro.soma());
        System.out.printf("Maior elemento: %d\n", vetorInteiro.maiorElemento());
        System.out.printf("Posição menor elemento: %d\n", vetorInteiro.posicaoMenorElemento());
        System.out.printf("Elemento 3: %d\n", vetorInteiro.elemento(3));
        System.out.printf("Existe o número 3? - %s\n", vetorInteiro.verificaSeExiste(3) ? "Sim" : "Não");
    }
}
