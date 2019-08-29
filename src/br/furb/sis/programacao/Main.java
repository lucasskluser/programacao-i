package br.furb.sis.programacao;

import br.furb.sis.programacao.lista.matriz.primeira.ExercicioNumerico;
import br.furb.sis.programacao.lista.vetor.primeira.VetorInteiro;
import br.furb.sis.programacao.lista.vetor.primeira.VetorReais;

public class Main {
    public static void main(String[] args) throws Exception {
        //ExercicioNumerico.dezesseis();
        int[][] matriz = new int[][] {
          new int[]{11, 15, 9, 5},
          new int[]{3, 8, 4, 13}
        };

        ExercicioNumerico.seis(matriz);
        //vetorInteiro();
        //vetorReais();
    }

    private static void vetorReais() {
        double[] vetorUm = new double[]{3.0, 4.0, 7.0, 9.0, 2.0};
        double[] vetorDois = new double[]{5.0, 5.0, 7.0, 3.0, 8.0};

        VetorReais vetorReaisUm = new VetorReais(vetorUm.length);
        vetorReaisUm.defineVetor(vetorUm);

        VetorReais vetorReaisDois = new VetorReais(vetorDois.length);
        vetorReaisDois.defineVetor(vetorDois);

        try {
            System.out.println(vetorReaisUm.multiplicacao(vetorReaisUm));
        } catch (Exception e) {
            e.printStackTrace();
        }

        //vetorReaisUm.inverteVetor();

        /*for(double elemento : vetorReaisUm.retornaVetor()) {
            System.out.printf("%.2f, ", elemento);
        }*/
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
