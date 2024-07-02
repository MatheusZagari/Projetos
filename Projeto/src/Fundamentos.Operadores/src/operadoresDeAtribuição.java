public class operadoresDeAtribuição {
    public static void main(String[] args) {
        int a = 3;
        int b = a;
        int c = a + b;

        c += b; // c = c + b; | Atribuição aditiva
        c -= a; // c = c - a; | Atribuição subtrativa
        c *= b;// c = c * b; | Atribuição multiplicativa
        c /= a; // c = c / a; | Atribuição divisiva

        System.out.println(c);
        c %= 2; // c = c % 2; | 0 ou 1 | Atribuição modular vai indicar se o número é par ou impar
        System.out.println(c);
    }
}
