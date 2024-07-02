package oo.composicao.heranca.Teste;

import oo.composicao.heranca.Direcao;
import oo.composicao.heranca.Heroi;
import oo.composicao.heranca.Monstro;

import javax.management.monitor.Monitor;
import javax.management.monitor.MonitorSettingException;

public class Jogo {
    public static void main(String[] args) {

        Monstro monstro = new Monstro();
        monstro.x = 10;
        monstro.y = 10;

        Heroi heroi = new Heroi(10,11);

        System.out.println("Mosntro tem => " + monstro.vida);
        System.out.println("Heroi tem => " + heroi.vida);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        monstro.andar(Direcao.NORTE);
        monstro.atacar(heroi);
        heroi.atacar(monstro);

        System.out.println("Mosntro tem => " + monstro.vida);
        System.out.println("Heroi tem => " + heroi.vida);
    }
}
