import java.util.Date;

/**
 * Disciplina de Programação I
 * Professor Aurélio Hoppe
 * Aluno Lucas Samuel Kluser
 * Trabalho 05
 * */
public class ArtigoImportante extends Artigo {
    private int fatorImpacto;

    public ArtigoImportante(String titulo, String periodico, Date dataPublicacao, char qualis, int fatorImpacto) {
        super(titulo, periodico, dataPublicacao, qualis);
        setFatorImpacto(fatorImpacto);
    }

    public int getFatorImpacto() {
        return fatorImpacto;
    }

    public void setFatorImpacto(int fatorImpacto) {
        this.fatorImpacto = fatorImpacto;
    }

    @Override
    public String exibirDados() {
        return String.format(
                "Título: %s" +
                "\nPeriódico: %s" +
                "\nData de publicação: %s" +
                "\nQualis: %s" +
                "\nFator impacto: %d",
                getTitulo(), getPeriodico(), getDataPublicacao(), getQualis(), getFatorImpacto()
        );
    }
}