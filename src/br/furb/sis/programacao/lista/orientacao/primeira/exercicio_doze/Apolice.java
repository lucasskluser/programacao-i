package br.furb.sis.programacao.lista.orientacao.primeira.exercicio_doze;

public class Apolice {
    private String nome;
    private int idade;
    private double valorPremio;

    public Apolice(String nome, int idade, double valorPremio) {
        setNome(nome);
        setIdade(idade);
        setValorPremio(valorPremio);
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private String getNome() {
        return nome;
    }

    private void setIdade(int idade) {
        this.idade = idade;
    }

    private int getIdade() {
        return idade;
    }

    private void setValorPremio(double valorPremio) {
        this.valorPremio = valorPremio;
    }

    private double getValorPremio() {
        return valorPremio;
    }

    public void calcularPremio() {
        if (getIdade() > 36) {
            setValorPremio(getValorPremio() * 1.1);
        } else if (getIdade() > 25) {
            setValorPremio(getValorPremio() * 1.5);
        } else if (getIdade() >= 18) {
            setValorPremio(getValorPremio() * 1.2);
        }
    }

    public void oferecerDesconto(String cidade) {
        switch (cidade.toLowerCase()) {
            case "ilhota":
                setValorPremio(getValorPremio() * 0.95);
                break;
            case "blumenau":
                setValorPremio(getValorPremio() * 0.97);
                break;
            case "itajaí":
                setValorPremio(getValorPremio() * 0.99);
        }
    }

    public String imprimir() {
        return String.format("Imprimindo os dados inicializados" +
                        "\nNome: %s" +
                        "\nIdade: %d" +
                        "\nValor prêmio: %.2f",
                getNome(), getIdade(), getValorPremio()
        );
    }

    public String imprimir(String sufixo) {
        return String.format("Imprimindo os dados inicializados %s" +
                        "\nNome: %s" +
                        "\nIdade: %d" +
                        "\nValor prêmio: %.2f",
                sufixo, getNome(), getIdade(), getValorPremio()
        );
    }
}
