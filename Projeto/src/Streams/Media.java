package Streams;

public class Media {

    private double total;
    private int quantidade;

    public Media adicionar(double valor) {
        total += valor;
        quantidade++;
        return this;
    }

    public double getValor() {
        return total / quantidade;
    }

    public static Media combinar (Media m1, Media m2) {
        Media resutlante = new Media();
        resutlante.total = m1.total + m2.quantidade;
        resutlante.quantidade = m1.quantidade + m2.quantidade;
        return resutlante;

    }
}
