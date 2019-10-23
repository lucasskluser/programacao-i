package br.furb.sis.programacao;

import br.furb.sis.programacao.lista.matriz.primeira.exercicio_doze.Doze;
import br.furb.sis.programacao.lista.orientacao.primeira.exercicio_dezessete.Linha;
import br.furb.sis.programacao.lista.orientacao.primeira.exercicio_doze.PrincipalApolice;
import br.furb.sis.programacao.lista.orientacao.primeira.exercicio_nove.Retangulo;
import br.furb.sis.programacao.lista.orientacao.primeira.exercicio_sete.Ponto;
import br.furb.sis.programacao.lista.vetor.primeira.ExercicioNumerico;
import br.furb.sis.programacao.lista.vetor.primeira.VetorInteiro;
import br.furb.sis.programacao.lista.vetor.primeira.VetorReais;

public class Main {
    public static void main(String[] args) {
        try {
            //PrincipalApolice.main();
            ExercicioNumerico.sete();
        } catch (Exception e) {
            e.printStackTrace();
        }
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

    private static void exercicioRetangulo() throws Exception {
        Ponto pontoInicialRetanguloUm = new Ponto(1, 4);
        Ponto pontoFinalRetanguloUm = new Ponto(5, 0);
        Retangulo retanguloUm = new Retangulo(pontoInicialRetanguloUm, pontoFinalRetanguloUm);
        System.out.println("Retângulo um:");
        System.out.println(retanguloUm.obtemPosicoes());

        Ponto pontoInicialRetanguloDois = new Ponto(3, 3);
        Ponto pontoFinalRetanguloDois = new Ponto(4, -1);
        Retangulo retanguloDois = new Retangulo(pontoInicialRetanguloDois, pontoFinalRetanguloDois);
        System.out.println("\nRetângulo dois:");
        System.out.println(retanguloDois.obtemPosicoes());

        Retangulo intersecao = retanguloUm.calculaIntersecao(retanguloDois);
        System.out.println("\nInterseção:");
        System.out.println(intersecao.obtemPosicoes());

        Ponto ponto = new Ponto(2, 3);
        String estaDentro = retanguloUm.estaDentro(ponto) ? "está dentro" : "não está dentro";
        System.out.printf("\nO ponto (%.2f, %.2f) %s do retângulo um\n", ponto.getX(), ponto.getY(), estaDentro);

        Ponto pontoALinha = new Ponto(4, 3);
        Ponto pontoBLinha = new Ponto(6, 2);
        Linha linha = new Linha(pontoALinha, pontoBLinha);
        System.out.println("\nLinha:");
        System.out.println(linha.obtemPontos());

        estaDentro = retanguloUm.estaDentro(linha) ? "está dentro" : "não está dentro";
        System.out.printf("A linha A %s do retângulo um", estaDentro);
    }
}
