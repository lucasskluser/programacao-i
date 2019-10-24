package br.furb.sis.programacao.lista.hashmap.primeira;

import java.util.HashMap;

public class TestePessoa {
    /**
     * Executa a classe TestePessoa
     * */
    public static void main() {
        Pessoa pessoaA = new Pessoa("Joao", "12345678910");
        Pessoa pessoaB = new Pessoa("Maria", "12345678911");
        HashMap<String, Pessoa> pessoas = new HashMap<>();

        inserir(pessoaA, pessoas);
        inserir(pessoaB, pessoas);

        System.out.println(imprimirPessoas(pessoas));
    }

    /**
     * Insere um objeto pessoa em um HashMap, usando o CFP como chave
     *
     * @param pessoa Objeto pessoa a ser inserido no HashMap
     * @param hashMap HashMap que receberá o objeto pessoa
     * */
    private static void inserir(Pessoa pessoa, HashMap<String, Pessoa> hashMap) {
        hashMap.put(pessoa.getCpf(), pessoa);
    }

    private static String imprimirPessoas(HashMap<String, Pessoa> hashMap) {
        StringBuilder dados = new StringBuilder();

        for(Pessoa pessoa : hashMap.values()) {
            dados.append(String.format("Nome: %s \nCPF: %s", pessoa.getNome(), pessoa.getCpf()));
            dados.append("\n--------------------\n");
        }

        return dados.toString();
    }
}
