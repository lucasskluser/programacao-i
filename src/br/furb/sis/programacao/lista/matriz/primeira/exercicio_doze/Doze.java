package br.furb.sis.programacao.lista.matriz.primeira.exercicio_doze;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Doze {
    public static void executar() throws Exception {
        char[] aminoacidos = new char[] {
            'A', 'R', 'N', 'D', 'C', 'Q', 'E', 'G', 'H', 'I', 'L', 'K', 'M', 'F', 'P', 'S', 'T', 'W', 'Y', 'V'
        };

        int[][] matrizPesos = new int[][] {
            {4, -1, -2, -2, 0, -1, -1, -1, -2, -1, -1, -1, -1, -2, -1, 1, 0, -3, -2, 0},        // A
            {-1, 5, 0, -2, -3, 1, 0, -2, 0, -3, -2, 2, -1, -3, -2, -1, -1, -3, -2, -3},         // R
            {-2, 0, 6, 1, -3, 0, 0, 0, 1, -3, -3, 0, -2, -3, -2, 1, 0, -4, -2, -3},             // N
            {-2, -2, 1, 6, -3, 0, 2, -1, -1, -3, -4, -1, -3, -3, -1, 0, -1, -4, -3, -3},        // D
            {0, -3, -3, -3, 9, -3, -4, -3, -3, -1, -1, -3, -1, -2, -3, -1, -1, -2, -2, -1},     // C
            {-1, 1, 0, 0, -3, 5, 2, -2, 0, -3, -2, 1, 0, -3, -1, 0, -1, -2, -1, -2},            // Q
            {-1, 0, 0, 2, -4, 2, 5, -2, 0, -3, -3, 1, -2, -3, -1, 0, -1, -3, -2, -2},           // E
            {-1, -2, 0, -1, -3, -2, -2, 6, -2, -4, -4, -2, -3, -3, -2, 0, -2, -2, -3, -3},      // G
            {-2, 0, 1, -1, -3, 0, 0, -2, 8, -3, -3, -1, -2, -1, -2, -1, -2, -2, 2, -3},         // H
            {-1, -3, -3, -3, -1, -3, -3, -4, -3, 4, 2, -3, 1, 0, -3, -2, -1, -3, -1, 3},        // I
            {-1, -2, -3, -4, -1, -2, -3, -4, -3, 2, 4, -2, 2, 0, -3, -2, -1, -2, -1, 1},        // L
            {-1, 2, 0, -1, -3, 1, 1, -2, -1, -3, -2, 5, -1, -3, -1, 0, -1, -3, -2, -2},         // K
            {-1, -1, -2, -3, -1, 0, -2, -3, -2, 1, 2, -1, 5, 0, -2, -1, -1, -1, -1, 1},         // M
            {-2, -3, -3, -3, -2, -3, -3, -3, -1, 0, 0, -3, 0, 6, -4, -2, -2, 1, 3 , -1},        // F
            {-1, -2, -2, -1, -3, -1, -1, -2, -2, -3, -3, -1, -2, -4, 7, -1, -1, -4, -3, -2},    // P
            {1, -1, 1, 0, -1, 0, 0, 0, -1, -2, -2, 0, -1, -2, -1, 4, 1, -3, -2, -2},            // S
            {0, -1, 0, -1, -1, -1, -1, -2, -2, -1, -1, -1, -1, -2, -1, 1, 5, -2, -2, 0},        // T
            {-3, -3, -4, -4, -2, -2, -3, -2, -2, -3, -2, -3, -1, 1, -4, -3, -2, 11, 2, -3},     // W
            {-2, -2, -2, -3, -2, -1, -2, -3, 2, -1, -1, -2, -1, 3, -3, -2, -2, 2, 7, -1},       // Y
            {0, -3, -3, -3, -1, -2, -2, -3, -3, 3, 1, -2, 1, -1, -2, -2, 0, -3, -1, 4}          // V
        };

        //  TKVSRY
        char[] umAminoacido = new char[] {
            'T', 'K', 'V', 'S', 'R', 'Y', 'V'
        };

        // TDVAYYL
        char[] outroAminoacido = new char[] {
                'T', 'D', 'V', 'A', 'Y', 'Y', 'L'
        };

        int alinhamento = 0;

        for(int i = 0; i < umAminoacido.length; i++) {
            for(int j = 0; j < aminoacidos.length; j++) {
                if(umAminoacido[i] == aminoacidos[j]) {
                    for(int k = 0; k < aminoacidos.length; k++) {
                        if(outroAminoacido[i] == aminoacidos[k]) {
                            alinhamento += matrizPesos[j][k];
                            break;
                        }
                    }
                    break;
                }
            }
        }

        System.out.print("Aminoácido 1: ");
        for(char aminoacido : umAminoacido) {
            System.out.printf("%s, ", aminoacido);
        }

        System.out.print("\nAminoácido 2: ");
        for(char aminoacido : outroAminoacido) {
            System.out.printf("%s, ", aminoacido);
        }

        System.out.printf("\nAlinhamento total: %d", alinhamento);
    }
}
