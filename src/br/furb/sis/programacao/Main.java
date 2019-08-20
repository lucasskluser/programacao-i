package br.furb.sis.programacao;

import br.furb.sis.programacao.lista.primeira.ExercicioNumerico;
import br.furb.sis.programacao.lista.primeira.VetorInteiro;

public class Main {
    public static void main(String[] args) {
        //ExercicioNumerico.oito();
        int[] vetor = new int[]{-10, 9, 3, 45, -98, 302};
        VetorInteiro vetorInteiro = new VetorInteiro(vetor);

        System.out.printf("Soma: %d\n", vetorInteiro.soma());
        System.out.printf("Maior elemento: %d\n", vetorInteiro.maiorElemento());
        System.out.printf("Posição menor elemento: %d\n", vetorInteiro.posicaoMenorElemento());
        System.out.printf("Elemento 3: %d\n", vetorInteiro.elemento(3));
        System.out.printf("Existe o número 3? - %s\n", vetorInteiro.verificaSeExiste(3) ? "Sim" : "Não");
    }
}
