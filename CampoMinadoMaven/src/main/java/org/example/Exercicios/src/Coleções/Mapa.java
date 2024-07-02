package org.example.Exercicios.src.Coleções;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<>();

        usuarios.put(1, "roberto");
        usuarios.put(10, "alan");
        usuarios.put(20, "rodrido");

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());


        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());

        System.out.println(usuarios.containsKey(20));
        System.out.println(usuarios.containsValue("roberto"));

        System.out.println(usuarios.get(4));

        for (int chave: usuarios.keySet()) {
            System.out.println(chave);

        }
        for (String valor: usuarios.values()) {
            System.out.println(valor);
        }

        for (Map.Entry<Integer, String> registro: usuarios.entrySet()) {
            System.out.println(registro.getKey());
            System.out.println(registro.getValue());
        }
    }
}
