package br.furb.sis.programacao.lista.matriz.primeira;

public class ExercicioNumerico {

    public static void seis(int[][] matriz) {
        int somaTotal = 0;

        for(int[] linha : matriz) {
            int somaColuna = 0;

            for(int coluna : linha) {
                somaColuna += coluna;
            }
            System.out.printf("Total da coluna: %d\n", somaColuna);
            somaTotal += somaColuna;
        }

        System.out.printf("\nTotal: %d", somaTotal);
    }
}
