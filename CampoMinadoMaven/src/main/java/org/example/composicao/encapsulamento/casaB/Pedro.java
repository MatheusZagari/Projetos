package org.example.composicao.encapsulamento.casaB;

import oo.composicao.encapsulamento.casaA.Ana;

public class Pedro extends Ana {
    void testeAcessos(){

//        private String segredo = "...";
//        String facoDentroDeCasa = "..."; //default ou pacote
//        protected String formaDeFalar = "...";
//        public String todosSabem = "...";

//        System.out.println(esposa.segredo);
//        System.out.println(mae.facoDentroDeCasa);
        boolean formaDeFalar;
        System.out.println(formaDeFalar);
        boolean todosSabem;
        System.out.println(todosSabem);
        System.out.println(new Ana().todosSabem);
    }
}
