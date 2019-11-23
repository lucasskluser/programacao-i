import javax.naming.SizeLimitExceededException;
import java.util.ArrayList;
import java.util.List;

public class Personagem {
    private String nome;
    private String nomeVidaReal;
    private List<SuperPoder> superPoderes;

    public Personagem(String nome, String nomeVidaReal) {
        setNome(nome);
        setNomeVidaReal(nomeVidaReal);
        setSuperPoderes(new ArrayList<>());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeVidaReal() {
        return nomeVidaReal;
    }

    public void setNomeVidaReal(String nomeVidaReal) {
        this.nomeVidaReal = nomeVidaReal;
    }

    public List<SuperPoder> getSuperPoderes() {
        return superPoderes;
    }

    public void setSuperPoderes(List<SuperPoder> superPoderes) {
        this.superPoderes = superPoderes;
    }

    public void adicionaSuperPoder(SuperPoder superPoder) throws SizeLimitExceededException {
        if (getSuperPoderes().size() < 4) {
            getSuperPoderes().add(superPoder);
        } else {
            throw new SizeLimitExceededException("O personagem pode conter, no máximo, 4 super-poderes");
        }
    }

    public double getPoderTotal() {
        double poderTotal = 0;

        for (SuperPoder superPoder : getSuperPoderes()) {
            poderTotal += superPoder.getCategoria();
        }

        return poderTotal;
    }
}
