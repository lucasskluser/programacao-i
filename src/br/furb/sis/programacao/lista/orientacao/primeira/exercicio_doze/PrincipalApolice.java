package br.furb.sis.programacao.lista.orientacao.primeira.exercicio_doze;

public class PrincipalApolice {
    public static void main() {
        Apolice umaApolice = new Apolice("João da Silva", 27, 900);
        System.out.println(umaApolice.imprimir());

        umaApolice.calcularPremio();
        System.out.println("\n" + umaApolice.imprimir("após calcularPremio()"));

        umaApolice.oferecerDesconto("Indaial");
        System.out.println("\n" + umaApolice.imprimir("após oferecerDesconto()"));
    }
}
