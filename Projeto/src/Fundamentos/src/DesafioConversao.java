import java.math.BigDecimal;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class DesafioConversao {
    public static void main(String[] args) {
        //fieot por mim, antes da solução
        //só faltou o REPLACE pra conversar virgula em ponto.
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro salario: ");
        String num1 = entrada.nextLine().replace(",",".");

        System.out.println("Digite o segundo salario: ");
        String num2 = entrada.nextLine().replace(",",".");

        System.out.println("Digite o segundo salario: ");
        String num3 = entrada.nextLine().replace(",",".");

        double salario1 = Double.parseDouble(num1);
        double salario2 = Double.parseDouble(num1);
        double salario3 = Double.parseDouble(num1);

        double soma = salario1 + salario2 + salario3;
        double media = soma / 3;

        System.out.println("A média é:" + media);

        entrada.close();
        // vídeo solução
        Scanner entrada1 = new Scanner(System.in);
        System.out.print("Informe o primeiro salário: ");
        String valor1 = entrada.next().replace(",",".");

        System.out.print("\nInforme o segundo salário: ");
        String valor2 = entrada.next().replace(",",".");

        System.out.print("I\nnforme o terceiro salário: ");
        String valor3 = entrada.next().replace(",",".");

        double nume1 = Double.parseDouble(valor1);
        double nume2 = Double.parseDouble(valor2);
        double nume3 = Double.parseDouble(valor3);

        double media1 = (salario1 + salario2 + salario3) / 3;

        System.out.println("A média dos salários é " + media1);

        entrada1.close();
    }
}
