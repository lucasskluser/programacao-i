package br.furb.sis.programacao.sala;

import java.util.HashMap;

public class ExemploHash {

    public static void main() {
        HashMap<String, String> pessoas = new HashMap<String, String>();

        pessoas.put("123", "Joao");
        pessoas.put("456", "Maria");
        pessoas.put("789", "Pedro");
        pessoas.put("035", "Marta");
        pessoas.put("157", "Mateus");
        pessoas.put("359", "Madalena");

        System.out.println(pessoas.get("123"));
    }
}