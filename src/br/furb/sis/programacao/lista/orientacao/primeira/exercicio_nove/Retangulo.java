package br.furb.sis.programacao.lista.orientacao.primeira.exercicio_nove;

import br.furb.sis.programacao.lista.orientacao.primeira.exercicio_dezessete.Linha;
import br.furb.sis.programacao.lista.orientacao.primeira.exercicio_sete.Ponto;

public class Retangulo {
    /*
     * A classe retângulo possui 4 atributos que se referem a cada um
     * dos quatro pontos extremos de um retângulo, que são definidos
     * no sentido anti-horário, partindo do ponto extremo
     * superior-esquerdo
     * A |-------| D
     *   |       |
     * B |-------| C
     */
    // Ponto superior-esquerdo
    private Ponto pontoA;
    // Ponto inferior-esquerdo
    private Ponto pontoB;
    // Ponto inferior-direito
    private Ponto pontoC;
    // Ponto superior-direito
    private Ponto pontoD;

    /*
     * Construtor da classe
     *
     * O construtor recebe dois pontos como parâmetro e chama o
     * método calculaPontos(), que definirá os demais pontos do
     * retângulo.
     *
     * Caso os pontos inicial e final não sejam opostos, o método
     * lançará uma exceção.
     */
    public Retangulo(Ponto pontoInicial, Ponto pontoFinal) throws Exception {
        if ((pontoInicial.getX() == pontoFinal.getX()) || pontoInicial.getY() == pontoFinal.getY()) {
            throw new Exception("Os pontos inicial e final devem ser opostos");
        }

        calculaPontos(pontoInicial, pontoFinal);
    }

    /*
     * =================
     * GETTERS E SETTERS
     * =================
     *
     * Os getters e setters são privados para garantir a integridade
     * dos dados do retângulo, de forma que seja impossível definir
     * pontos com posições não-lógicas.
     */

    private void setPontoA(Ponto pontoA) {
        this.pontoA = pontoA;
    }

    private Ponto getPontoA() {
        return pontoA;
    }

    private void setPontoB(Ponto pontoB) {
        this.pontoB = pontoB;
    }

    private Ponto getPontoB() {
        return pontoB;
    }

    private void setPontoC(Ponto pontoC) {
        this.pontoC = pontoC;
    }

    private Ponto getPontoC() {
        return pontoC;
    }

    private void setPontoD(Ponto pontoD) {
        this.pontoD = pontoD;
    }

    private Ponto getPontoD() {
        return pontoD;
    }

    /*
     * Método responsável por calcular a área de um retângulo
     *
     * A base e a altura são calculadas levando em conta os pontos
     * definidos pelo método calculaPontos() chamado no construtor
     */
    public double calculaArea() {
        double base = getPontoC().getX() - getPontoB().getX();
        double altura = getPontoD().getY() - getPontoC().getY();

        return base * altura;
    }

    /*
     * Método responsável por calcular os 4 pontos (A, B, C, D) de um
     * objeto da classe Retângulo. Esse método é privado porque não
     * há necessidade de chamá-lo de forma externa à classe, já que o
     * mesmo é invocado no construtor da classe.
     *
     * Para calcular os pontos, as posições dos pontos inicial e final
     * passados no construtor da classe são comparadas, de forma que se
     * possa inferir a posição dos demais pontos.
     */
    private void calculaPontos(Ponto pontoInicial, Ponto pontoFinal) {
        // Se o ponto inicial estiver à esquerda do ponto final
        if (pontoInicial.getX() < pontoFinal.getX()) {
            // Se o ponto inicial estiver acima do ponto final
            if (pontoInicial.getY() > pontoFinal.getY()) {
                // O ponto A será o ponto inicial
                setPontoA(pontoInicial);
                // O ponto B será um novo ponto com o X igual ao ponto inicial e o Y igual ao ponto final
                setPontoB(new Ponto(pontoInicial.getX(), pontoFinal.getY()));
                // O ponto C será o ponto final
                setPontoC(pontoFinal);
                // O ponto D será um novo ponto com o X igual ao ponto final e o Y igual ao ponto inicial
                setPontoD(new Ponto(pontoFinal.getX(), pontoInicial.getY()));
                // Se o ponto inicial estiver abaixo do ponto final
            } else {
                // O ponto A será um novo ponto com o X igual ao ponto inicial e o Y igual ao ponto final
                setPontoA(new Ponto(pontoInicial.getX(), pontoFinal.getY()));
                // O ponto B será o ponto inicial
                setPontoB(pontoInicial);
                // O ponto C será um novo ponto com o X igual ao ponto final e o Y igual ao ponto inicial
                setPontoC(new Ponto(pontoFinal.getX(), pontoInicial.getY()));
                // O ponto D será o ponto final
                setPontoD(pontoFinal);
            }
            // Se o ponto inicial estiver à direita do ponto final
        } else {
            // Se o ponto inicial estiver acima do ponto final
            if (pontoInicial.getY() > pontoFinal.getY()) {
                // O ponto A será um novo ponto com o X igual o ponto final e o Y igual ao ponto inicial
                setPontoA(new Ponto(pontoFinal.getX(), pontoInicial.getY()));
                // O ponto B será o ponto final
                setPontoB(pontoFinal);
                // O ponto C será um novo ponto com o X igual ao ponto inicial e o Y igual ao ponto final
                setPontoC(new Ponto(pontoInicial.getX(), pontoFinal.getY()));
                // O ponto D será o ponto inicial
                setPontoD(pontoInicial);
                // Se o ponto inicial estiver abaixo do ponto final
            } else {
                // O ponto A será o ponto final
                setPontoA(pontoFinal);
                // O ponto B será um novo ponto com o X igual ao ponto final e o Y igual ao ponto inicial
                setPontoB(new Ponto(pontoFinal.getX(), pontoInicial.getY()));
                // O ponto C será o ponto inicial
                setPontoC(pontoInicial);
                // O ponto D será um novo ponto com o X igual ao ponto inicial e o Y igual ao ponto final
                setPontoD(new Ponto(pontoInicial.getX(), pontoFinal.getY()));
            }
        }
    }

    /*
     * Método responsável por retornar uma string com o par de
     * coordenadas de cada ponto do retângulo
     */
    public String obtemPosicoes() {
        StringBuilder posicoes = new StringBuilder();
        posicoes.append(String.format("Ponto A (%.2f, %.2f)", getPontoA().getX(), getPontoA().getY()));
        posicoes.append(String.format("\nPonto B (%.2f, %.2f)", getPontoB().getX(), getPontoB().getY()));
        posicoes.append(String.format("\nPonto C (%.2f, %.2f)", getPontoC().getX(), getPontoC().getY()));
        posicoes.append(String.format("\nPonto D (%.2f, %.2f)", getPontoD().getX(), getPontoD().getY()));

        return posicoes.toString();
    }

    /*
     * Método responsável por calcular a interseção entre dois
     * retângulos
     *
     * Para calcular a interseção, os pontos inicial e final da
     * interseção são definidos de acordo com os pontos existentes
     * nos dois retângulos que estão sendo comparados.
     *
     * Com isso, um novo retângulo é instanciado, passando os pontos
     * inicial e final calculados. Dessa forma, o método calculaPontos()
     * define os pontos da interseção.
     */
    public Retangulo calculaIntersecao(Retangulo outroRetangulo) throws Exception {
        // O ponto inicial da interseção será o ponto A do outro retângulo
        Ponto pontoIntersecaoInicial = outroRetangulo.pontoA;
        // O ponto final da interseção terá o X do outro retângulo e o Y do retângulo atual
        Ponto pontoIntersecaoFinal = new Ponto(
                outroRetangulo.getPontoC().getX(),
                this.getPontoC().getY()
        );

        // A interseção terá os demais pontos calculados no construtor da classe
        return new Retangulo(pontoIntersecaoInicial, pontoIntersecaoFinal);
    }

    /*
     * Método responsável por validar se determinado ponto está
     * dentro do objeto retângulo.
     *
     * Para validar se o ponto está dentro do retângulo, as
     * coordenadas X e Y do ponto são comparadas com as coordenadas
     * do ponto B e D do retângulo (extremo inferior-esquerdo e
     * superior-direito).
     */
    public boolean estaDentro(Ponto ponto) {
        return (
                (ponto.getX() < this.getPontoD().getX()) && (ponto.getY() < this.getPontoD().getY())
        ) && (
                (ponto.getX() > this.getPontoB().getX()) && (ponto.getY() > this.getPontoB().getY())
        );
    }

    /*
     * Método responsável por validar se determinada linha está
     * dentro do objeto retângulo.
     *
     * Para validar se a linha está dentro do retângulo, as
     * coordenadas X e Y dos pontos A e B da linha são comparadas com
     * as coordenadas do ponto B e D do retângulo (extremo
     * inferior-esquerdo e superior-direito).
     */
    public boolean estaDentro(Linha linha) {
        boolean pontoADentro = (
                (linha.getPontoA().getX() < this.getPontoD().getX()) && (linha.getPontoA().getY() < this.getPontoD().getY())
        ) && (
                (linha.getPontoA().getX() > this.getPontoB().getX()) && (linha.getPontoA().getY() > this.getPontoB().getY())
        );

        boolean pontoBDentro = (
                (linha.getPontoB().getX() < this.getPontoD().getX()) && (linha.getPontoB().getY() < this.getPontoD().getY())
        ) && (
                (linha.getPontoB().getX() > this.getPontoB().getX()) && (linha.getPontoB().getY() > this.getPontoB().getY())
        );

        return pontoADentro && pontoBDentro;
    }
}
