import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Disciplina de Programação I
 * Professor Aurélio Hoppe
 * Aluno Lucas Samuel Kluser
 * Trabalho 05
 * */
public class Artigo {
    private String titulo;
    private String periodico;
    private Date dataPublicacao;
    private char qualis;

    public Artigo(String titulo, String periodico, Date dataPublicacao, char qualis) {
        setTitulo(titulo);
        setPeriodico(periodico);
        setDataPublicacao(dataPublicacao);
        setQualis(qualis);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPeriodico() {
        return periodico;
    }

    public void setPeriodico(String periodico) {
        this.periodico = periodico;
    }

    public String getDataPublicacao() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");
        return dateFormat.format(dataPublicacao);
    }

    public void setDataPublicacao(Date dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public char getQualis() {
        return qualis;
    }

    public void setQualis(char qualis) {
        this.qualis = qualis;
    }

    public String exibirDados() {
        return String.format(
                "Título: %s" +
                "\nPeriódico: %s" +
                "\nData de publicação: %s" +
                "\nQualis: %s",
                getTitulo(), getPeriodico(), getDataPublicacao(), getQualis()
        );
    }
}
