public class SuperPoder {
    private String nome;
    private int categoria;

    public SuperPoder(String nome, int categoria) {
        setNome(nome);
        setCategoria(categoria);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }
}
