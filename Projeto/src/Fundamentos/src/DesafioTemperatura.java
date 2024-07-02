public class DesafioTemperatura {
    //Feito por mim, antes de ver a aula com a resposta
    public static void main(String[] args) {
        // (°F - 32) x 5/9 = °C
        // Colocar uma casa decimal em algum dos valores na hora da divisão pra poder retornar um valor quebrado.

        final int multi = 32;
        final double fator = 5/9.0;
        double F = 92;

        System.out.println("A temperatura em °C: " + (F - multi) * fator);


        //Aula resposta
        final double FATOR = 5.0 / 9.0;
        final double AJUSTE = 32;

        double fahrenheit  = 86;
        double celsius = (fahrenheit - AJUSTE) * FATOR;

        System.out.println("O resultado é " + celsius + "°C.");

        fahrenheit = 150;
        celsius = (fahrenheit - AJUSTE) * FATOR;

        System.out.println("O resultado é " + celsius + "°C.");
    }
}
