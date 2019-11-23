package br.furb.sis.programacao.lista.matriz.primeira.exercicio_nove;

public class Compromisso {
    private String descricao, local;

    public Compromisso(String descricao, String local) {
        setDescricao(descricao);
        setLocal(local);
    }

    private void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    private String getDescricao() {
        return descricao;
    }

    private void setLocal(String local) {
        this.local = local;
    }

    private String getLocal() {
        return local;
    }
}
