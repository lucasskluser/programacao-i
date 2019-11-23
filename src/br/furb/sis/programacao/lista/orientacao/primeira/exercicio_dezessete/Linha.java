package br.furb.sis.programacao.lista.orientacao.primeira.exercicio_dezessete;

import br.furb.sis.programacao.lista.orientacao.primeira.exercicio_sete.Ponto;
import java.lang.String;

public class Linha {
    private Ponto pontoA;
    private Ponto pontoB;

    public Linha(Ponto pontoInicial, Ponto pontoFinal) throws Exception {
        if((pontoInicial.getX() == pontoFinal.getX()) && (pontoInicial.getY() == pontoFinal.getY())) {
            throw new Exception("Os pontos devem estar em coordenadas diferentes");
        }

        setPontoA(pontoInicial);
        setPontoB(pontoFinal);
    }

    private void setPontoA(Ponto pontoA) {
        this.pontoA = pontoA;
    }

    public Ponto getPontoA() {
        return pontoA;
    }

    private void setPontoB(Ponto pontoB) {
        this.pontoB = pontoB;
    }

    public Ponto getPontoB() {
        return pontoB;
    }

    public String obtemPontos() {
        StringBuilder coordenadas = new StringBuilder();
        coordenadas.append(String.format("Ponto A (%.2f, %.2f)", getPontoA().getX(), getPontoA().getY()));
        coordenadas.append(String.format("\nPonto B (%.2f, %.2f)", getPontoB().getX(), getPontoB().getY()));

        return coordenadas.toString();
    }
}
