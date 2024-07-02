package org.example.composicao.encapsulamento.casaA;

public class Paulo {
    Ana esposa = new Ana();
    void testeAcessos(){

//        private String segredo = "...";
//        String facoDentroDeCasa = "..."; //default ou pacote
//        protected String formaDeFalar = "...";
//        public String todosSabem = "...";

//        System.out.println(esposa.segredo);
        System.out.println(esposa.facoDentroDeCasa);
        System.out.println(esposa.formaDeFalar);
        System.out.println(esposa.todosSabem);
    }
}
