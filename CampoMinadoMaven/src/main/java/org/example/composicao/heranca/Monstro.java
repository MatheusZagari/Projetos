package org.example.composicao.heranca;

public class Monstro extends Jogador{

    public Monstro(){
        this(0,0);
    }
    Monstro (int x, int y) {
        this.x = x;
        this.y = y;
    }

        public boolean atacar(Jogador oponente) {
        int deltaX = Math.abs(x - oponente.x);
        int deltaY = Math.abs(y - oponente.y);

        if (deltaX == 0 && deltaY == 1) {
            oponente.vida -= 10;
            return true;
        }
        else if (deltaX == 1 && deltaY == 0) {
            oponente.vida -= 20;
            return true;
        }
        else {
            return false;
        }
    }
}
