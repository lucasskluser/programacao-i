/**
 * Disciplina de Programação I
 * Professor Aurélio Hoppe
 * Aluno Lucas Samuel Kluser
 * Trabalho 05
 * */
public class Professor {
    private String nome;
    private String area;
    private Artigo artigo;

    public Professor(String nome, String area, Artigo artigo) {
        setNome(nome);
        setArea(area);
        setArtigo(artigo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Artigo getArtigo() {
        return artigo;
    }

    public void setArtigo(Artigo artigo) {
        this.artigo = artigo;
    }

    public String mostrarEstatistica() {
        return String.format(
                "Nome: %s" +
                "\nÁrea: %s" +
                "\nARTIGO: \n%s",
                getNome(), getArea(), getArtigo().exibirDados()
        );
    }
}
