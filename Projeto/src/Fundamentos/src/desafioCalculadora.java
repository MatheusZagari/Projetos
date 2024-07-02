import java.util.Scanner;

public class desafioCalculadora {
    public static void main(String[] args) {
        /* Fazer uma calculadora com as informações descritas abaixo
           Ler num1
           Ler num2
           + - * / %
        */

        //Feito antes do video resolução


        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o número: ");
        double num1 = entrada.nextDouble();

        System.out.print("Informe o número: ");
        double num2 = entrada.nextDouble();

        System.out.print("Informe a operação");
        String op = entrada.next();

        //Lopgica
        double resutlado = "+".equals(op) ? num1 + num2 : 0;
        resutlado = "-".equals(op) ? num1 - num2 : resutlado;
        resutlado = "*".equals(op) ? num1 * num2 : resutlado;
        resutlado = "/".equals(op) ? num1 / num2 : resutlado;
        resutlado = "%".equals(op) ? num1 % num2 : resutlado; // Resto da divisão e depois fala se é positivo ou negativo

        System.out.printf("%f %s %f = %.2f", num1, op, num2, resutlado);
        entrada.close();
    }
}
