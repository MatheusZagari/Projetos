package Lambdas;

//import java.lang.reflect.Array;
import java.util.List;
import java.util.Arrays;

public class Foreach {
    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");

        System.out.println("Forma trandicional...");
        for (String nome : aprovados) {
            System.out.println(nome);
        }

            System.out.println("\nLambda #01...");
            aprovados.forEach( nome -> System.out.println(nome + "!!!"));

            System.out.println("\nMethod Reference...");
            aprovados.forEach(System.out::println);

            System.out.println("\nLambda #02...");
            aprovados.forEach(nome -> meuIprimir(nome));

        System.out.println("\nMethod Reference #02...");
        aprovados.forEach(Foreach::meuIprimir);
    }
    static void meuIprimir(String nome) {
        System.out.println("Oi! Mue nome é " + nome);
    }
}
