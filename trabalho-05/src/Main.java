import java.util.ArrayList;
import java.util.Date;

/**
 * Disciplina de Programação I
 * Professor Aurélio Hoppe
 * Aluno Lucas Samuel Kluser
 * Trabalho 05
 * */
public class Main {
    private static ArrayList<Professor> professores = new ArrayList<>();

    public static void main(String[] args) {
        Artigo artigoA = novoArtigo("Uma reinterpretação da cascata de coagulação", "Natural", new Date(2019, 10, 13), 'A', 1);
        Artigo artigoB = novoArtigo("Uma análise socio-religiosa dos povos hindo-europeus", "Science and Religion", new Date(2015, 4, 25), 'C');
        Artigo artigoC = novoArtigo("Algoritmos simétricos na segurança de informação quântica", "Science Magazine", new Date(2017, 5, 8), 'B');
        Artigo artigoD = novoArtigo("A curvatura do tecido espaço-temporal de acordo com a Teoria da Relatividade", "Siggraph", new Date(2015, 8, 12), 'B', 1);

        novoProfessor("Felisbino Silveira", "Hematologia", artigoA);
        novoProfessor("Agostinho de Hipona", "Filosofia da Religião", artigoB);
        novoProfessor("Maicon Sibertino", "Computação Quântica", artigoC);
        novoProfessor("Jéssica Aborine", "Física relativística", artigoD);

        System.out.println("========= DADOS ESTATÍSTICOS =========");
        for (Professor professor : professores) {
            System.out.println(professor.mostrarEstatistica() + "\n");
        }
    }

    public static void novoProfessor(String nome, String area, Artigo artigo) {
        professores.add(new Professor(nome, area, artigo));
    }

    public static Artigo novoArtigo(String titulo, String periodico, Date dataPublicacao, char qualis) {
        return new Artigo(titulo, periodico, dataPublicacao, qualis);
    }

    public static Artigo novoArtigo(String titulo, String periodico, Date dataPublicacao, char qualis, int fatorImpacto) {
        return new ArtigoImportante(titulo, periodico, dataPublicacao, qualis, fatorImpacto);
    }
}
