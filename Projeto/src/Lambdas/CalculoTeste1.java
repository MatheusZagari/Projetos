package Lambdas;

public class CalculoTeste1 {
    public static void main(String[] args) {
//        Calculo soma = new Soma();
//        Calculo multiplicacao = new Multiplicar();
        Calculo calculo = new Soma();
        System.out.println(calculo.executar(2,2));

        calculo = new Multiplicar();
        System.out.println(calculo.executar(3,5));

    }
}
