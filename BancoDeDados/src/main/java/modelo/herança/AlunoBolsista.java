package modelo.herança;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@DiscriminatorValue("AB")
public class AlunoBolsista extends Aluno {

    private double valorBolsa;

    //contrutor
    public AlunoBolsista() {

    }

    public AlunoBolsista(Long matricula, String nome, double valorBolsa){
            super(matricula, nome);
            this.valorBolsa = valorBolsa;
    }

        //getters e setters
    public double getValorBolsa() {
        return valorBolsa;
    }

    public void setValorBolsa(double valorBolsa) {
        this.valorBolsa = valorBolsa;
    }

}
