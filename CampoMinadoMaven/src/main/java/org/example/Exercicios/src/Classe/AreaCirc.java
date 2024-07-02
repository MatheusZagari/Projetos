package org.example.Exercicios.src.Classe;

public class AreaCirc {
    double raio;
    static double pi;

    AreaCirc (double raioInicial) { // Contrututor
        pi = 3.14;
        raio = raioInicial;
    }

    double area() {
        return pi * Math.pow(raio, 2);
    }

    static double area (double raio) {
        return pi * Math.pow(raio, 2);
    }
}
