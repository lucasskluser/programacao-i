package br.furb.sis.programacao.lista.matriz.primeira.exercicio_nove;

public class CompromissoMain {
    public static void executar() {
        Agenda umaAgenda = new Agenda(30);

        int dia = 3;
        int hora = 2;
        Compromisso compromisso = new Compromisso("Mandar e-mail", "Minha casa");
        umaAgenda.novoCompromisso(compromisso, 2, 2);


    }
}
