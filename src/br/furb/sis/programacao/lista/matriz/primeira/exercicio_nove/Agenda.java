package br.furb.sis.programacao.lista.matriz.primeira.exercicio_nove;

public class Agenda {
    private Compromisso[][] compromissos;
    private int quantidadeHoras = 24;
    private int quantidadeDias = 30;

    public Agenda() {
        setCompromissos();
    }

    public Agenda(int quantidadeDias) {
        setQuantidadeDias(quantidadeDias);
        setCompromissos();
    }

    public Agenda(int quantidadeDias, int quantidadeHoras) {
        setQuantidadeDias(quantidadeDias);
        setQuantidadeHoras(quantidadeHoras);
        setCompromissos();
    }

    private void setCompromissos() {
        this.compromissos = new Compromisso[quantidadeDias][quantidadeHoras];
    }

    private void setQuantidadeDias(int quantidadeDias) {
        this.quantidadeDias = quantidadeDias;
    }

    private void setQuantidadeHoras(int quantidadeHoras) {
        this.quantidadeHoras = quantidadeHoras;
    }

    public void novoCompromisso(Compromisso compromisso, int dia, int hora) {
        this.compromissos[dia - 1][hora] = compromisso;
    }

    public Compromisso[] obterDia(int dia) {
        return this.compromissos[dia - 1];
    }

    public Compromisso obterCompromisso(int dia, int hora) {
        return this.compromissos[dia - 1][hora];
    }

    public Compromisso[][] obterTodosCompromissos() {
        return this.compromissos;
    }
}
