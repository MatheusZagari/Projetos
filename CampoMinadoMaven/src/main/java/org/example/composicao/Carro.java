package org.example.composicao;

public class Carro {
    Motor motor = new Motor();

    void acelerar() {
        if (motor.fatorInjecao < 2.5); {
            motor.fatorInjecao += 0.4;
        }

    }
    void frear() {
        if (motor.fatorInjecao > 0.5) {
            motor.fatorInjecao -= 0.4;
        }

    }
    void ligar(){
        motor.ligado = true;
    }
    boolean estaLigado () {
        return motor.ligado;
    }
}
