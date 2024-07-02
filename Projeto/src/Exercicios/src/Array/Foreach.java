package Array;

/**
 * The Foreach class demonstrates the use of the enhanced for loop (foreach loop) in Java.
 */
public class Foreach {
    public static void main(String[] args) {
        double[] notas = {9.9, 8.7, 7.2, 9.4 };

        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i] + " ");
        }

        for(double nota: notas) {
            System.out.println(notas + " ");
        }
    }
}
