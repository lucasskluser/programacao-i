public class SuperHeroi  extends Personagem {
    public SuperHeroi(String nome, String nomeVidaReal) {
        super(nome, nomeVidaReal);
    }

    @Override
    public double getPoderTotal() {
        return super.getPoderTotal() + (super.getPoderTotal() * 0.1);
    }
}