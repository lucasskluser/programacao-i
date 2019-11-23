package br.furb.sis.programacao.lista.orientacao.primeira.exercicio_sete;

public class Principal {
    public static void executar() {
        double x = 1.0;
        double y = 1.0;

        Ponto primeiroPonto = new Ponto(x, y);
        System.out.println(primeiroPonto.imprimir());

        Ponto segundoPonto = new Ponto(1.0, 3.0);
        System.out.println(segundoPonto.imprimir());

        System.out.printf("Distância entre os dois pontos: %.2f", primeiroPonto.calcularDistancia(segundoPonto));
    }
}
