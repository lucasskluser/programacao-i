import javax.naming.SizeLimitExceededException;
import java.util.ArrayList;
import java.util.List;

public class Jogo {
    private static String simboloImpressao = "=";
    private static String tituloImpressao = "";

    public static void main(String[] args) throws SizeLimitExceededException {
        SuperHeroi chapolinColorado = new SuperHeroi("Chapolin Colorado", "");
        chapolinColorado.adicionaSuperPoder(new SuperPoder("Anteninhas de vinil", 4));
        chapolinColorado.adicionaSuperPoder(new SuperPoder("Marreta Biônica", 5));
        chapolinColorado.adicionaSuperPoder(new SuperPoder("Corneta paralisadora", 5));
        chapolinColorado.adicionaSuperPoder(new SuperPoder("Pastilhas encolhedoras", 4));

        SuperHeroi homemAranha = new SuperHeroi("Homem-Aranha", "Peter Park");
        homemAranha.adicionaSuperPoder(new SuperPoder("Soltar teia", 3));
        homemAranha.adicionaSuperPoder(new SuperPoder("Andar em paredes", 2));

        SuperHeroi superHomem = new SuperHeroi("Super-Homem", "Clark Kent");
        superHomem.adicionaSuperPoder(new SuperPoder("Voar", 3));
        superHomem.adicionaSuperPoder(new SuperPoder("Força", 5));
        superHomem.adicionaSuperPoder(new SuperPoder("Visão de raio X", 4));
        superHomem.adicionaSuperPoder(new SuperPoder("Sopro congelante", 4));

        SuperHeroi capitaoAmerica = new SuperHeroi("Capitão América", "Steve Rogers");
        capitaoAmerica.adicionaSuperPoder(new SuperPoder("Super soldado", 3));
        capitaoAmerica.adicionaSuperPoder(new SuperPoder("Escudo", 3));

        SuperHeroi flash = new SuperHeroi("Flash", "Barry Allen");
        flash.adicionaSuperPoder(new SuperPoder("Velocidade", 5));

        SuperHeroi lanternaVerde = new SuperHeroi("Lanterna Verde", "Hall Jordan");
        lanternaVerde.adicionaSuperPoder(new SuperPoder("Anel mágico", 5));

        SuperHeroi homemDeFerro = new SuperHeroi("Homem de Ferro", "Tony Stark");
        homemDeFerro.adicionaSuperPoder(new SuperPoder("Armadura", 4));
        homemDeFerro.adicionaSuperPoder(new SuperPoder("Dispositivos eletrônicos", 2));

        Vilao duendeVerde = new Vilao("Duende Verde", "Norman Osbourne", 4);
        duendeVerde.adicionaSuperPoder(new SuperPoder("Força", 5));

        Vilao lexLuthor = new Vilao("Lex Luthor", "Lex Luthor", 6);
        lexLuthor.adicionaSuperPoder(new SuperPoder("Mente aguçada", 5));

        Vilao bizarro = new Vilao("Bizarro", "Bizarro", 5);
        bizarro.adicionaSuperPoder(new SuperPoder("Voar", 3));
        bizarro.adicionaSuperPoder(new SuperPoder("Força", 5));
        bizarro.adicionaSuperPoder(new SuperPoder("Visão de raio-X", 4));
        bizarro.adicionaSuperPoder(new SuperPoder("Sopro congelante", 4));

        Vilao octopus = new Vilao("Octopus", "Otto Octavius", 3);
        octopus.adicionaSuperPoder(new SuperPoder("Tentáculos indestrutíveis", 5));
        octopus.adicionaSuperPoder(new SuperPoder("Velocidade", 1));

        confrontar(homemAranha, octopus);
    }

    public static void confrontar(SuperHeroi superHeroi, Vilao vilao) {
        tituloImpressao = String.format("Confronto entre %s e %s", superHeroi.getNome(), vilao.getNome());

        ArrayList<String> strings = new ArrayList<>();

        strings.add(
                String.format(
                        "%s - Poder total: %.1f",
                        superHeroi.getNome(), superHeroi.getPoderTotal()
                )
        );

        strings.add(
                String.format(
                        "%s - Poder total: %.1f",
                        vilao.getNome(), vilao.getPoderTotal()
                )
        );

        double resultado = Confronto.executar(superHeroi, vilao);

        if (resultado == 0) {
            strings.add(
                    String.format(
                            "RESULTADO: Empate!",
                            superHeroi.getNome(), vilao.getNome()
                    )
            );
        } else if (resultado > 0) {
            strings.add(
                    String.format(
                            "RESULTADO: Vitória para %s!",
                            superHeroi.getNome()
                    )
            );
        } else {
            strings.add(
                    String.format(
                            "RESULTADO: Vitória para %s!",
                            vilao.getNome()
                    )
            );
        }

        imprimir(strings);
    }

    public static void imprimir(List<String> strings) {
        StringBuilder cabecalho = new StringBuilder();
        StringBuilder conteudo = new StringBuilder();
        StringBuilder rodape = new StringBuilder();

        cabecalho.append(repetirCaracter(simboloImpressao, 12));
        cabecalho.append(String.format(" %s ", tituloImpressao));
        cabecalho.append(repetirCaracter(simboloImpressao, 12));

        rodape.append(repetirCaracter(simboloImpressao, cabecalho.length()));

        conteudo.append(String.format("%s\n", cabecalho.toString()));

        strings.forEach(string -> {
            conteudo.append(String.format("%s\n", string));
        });

        conteudo.append(rodape.toString());

        System.out.println(conteudo.toString());
    }

    private static String repetirCaracter(String caracter, int repeticao) {
        StringBuilder resultado = new StringBuilder();

        for(int i = 0; i < repeticao; i++) {
            resultado.append(caracter);
        }

        return resultado.toString();
    }
}
