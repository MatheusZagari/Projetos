package br.com.cod3r.app.calculo.interno;

import java.lang.reflect.Array;

public class operacoesAritmeticas {
    public double soma(double... nums) {
        return Array.set(nums).reduce(0.0, (t, a) -> {
            int i = t + a;
            return i;
        });
    }
}
