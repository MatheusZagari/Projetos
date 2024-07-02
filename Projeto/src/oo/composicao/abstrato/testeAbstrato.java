package oo.composicao.abstrato;

public class testeAbstrato extends Cachorro {
    public static void main(String[] args) {
        Animal a = new Cachorro();
        System.out.println(a.mover());
        System.out.println(a.mamar());
        System.out.println(a.respirar());
    }
}
