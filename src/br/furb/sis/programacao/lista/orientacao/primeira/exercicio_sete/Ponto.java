package br.furb.sis.programacao.lista.orientacao.primeira.exercicio_sete;

public class Ponto {
    private double x;
    private double y;

    public Ponto(double x, double y) {
        setX(x);
        setY(y);
    }

    public double getX() {
        return x;
    }

    private void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    private void setY(double y) {
        this.y = y;
    }

    public double calcularDistancia(Ponto outroPonto) {
        return Math.sqrt(
                (elevarAoQuadrado(
                        (this.getX() - outroPonto.getX())
                ) + elevarAoQuadrado(
                        (this.getY() - outroPonto.getY()))
                )
        );
    }

    public double elevarAoQuadrado(double valor) {
        return Math.pow(valor, 2);
    }

    public String imprimir() {
        return String.format("X: %.2f\nY: %.2f\n", getX(), getY()).replace(",", ".");
    }
}
