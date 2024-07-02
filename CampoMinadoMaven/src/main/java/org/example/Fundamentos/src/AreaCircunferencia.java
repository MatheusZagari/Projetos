package org.example.Fundamentos.src;

public class AreaCircunferencia {
    public static void main(String[] args) {
        int raio = 3; // INT serve pra valores inteiros
        double raio2 = 3.4; // DOUBLE serve pra valores quebrados
        final double PI = 3.14; // colocar o FINAL na frente da variável faz ela se tornar uma constante, não pode ser alterada

        double area = PI * raio2 * raio2;

        System.out.println(area);

        raio = 10;
        area = PI * raio * raio;

        System.out.println("Área = " + area);

    }
}
