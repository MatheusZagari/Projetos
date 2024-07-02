package org.example.composicao.heranca.Desafio;

public class Ferrari extends Carro implements Esportivo, Luxo{
    protected boolean ligarTurbo;
    protected boolean ligarAr;


    public Ferrari() {
        this(280);
    }
    public Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
        setDelta(15);
    }
    @Override
    public void ligarTurbo() {
        ligarTurbo = true;
    }
    @Override
    public void desligarTurbo() {
        ligarTurbo = false;
    }
    @Override
    public void ligarAr() {
        ligarAr = true;
    }
    @Override
    public void desligarAr() {
        ligarAr = false;
    }

    @Override
    public int getDelta() {
        if (ligarTurbo && !ligarAr) {
            return 35;
        }
        else if (ligarTurbo && ligarAr) {
            return 30;
        }
        else if (!ligarTurbo && !ligarAr) {
            return 20;
        }
        else {
            return 15;
        }
    }
}

