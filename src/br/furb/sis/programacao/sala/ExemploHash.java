package br.furb.sis.programacao.sala;

import java.util.HashMap;
import java.util.Iterator;

public class ExemploHash {

    public static void main()
    {
        // Instanciando um HashMap onde as chaves e os valores são do tipo String
        HashMap<String, String> pessoas = new HashMap<String, String>();

        // Adicionando valores
        pessoas.put("123", "Joao");
        pessoas.put("456", "Maria");
        pessoas.put("789", "Pedro");
        pessoas.put("035", "Marta");
        pessoas.put("157", "Mateus");
        pessoas.put("359", "Madalena");

        // Obtendo um valor
        System.out.println(pessoas.get("035"));

        // Obtendo o tamanho do HashMap
        System.out.println("Tamanho antes: " + pessoas.size());

        // Removendo um valor
        System.out.println(pessoas.remove("456"));

        // Obtendo o tamanho após a remoção
        System.out.println("Tamanho depois: " + pessoas.size());

        // Percorrendo os valores com Iterator
        Iterator itPessoas = pessoas.values().iterator();

        while (itPessoas.hasNext()){
            System.out.println(itPessoas.next());
        }

        // Ou, percorrendo as chaves do HashMap
        for (String chave : pessoas.keySet()) {
            System.out.println(pessoas.get(chave));
        }
    }
}