public class ConversaoTipoPrimitivoNumero {
    public static void main(String[] args) {
        double a = 1; //conversão implicita
        System.out.println(a);

        float b = (float) 1.12313123123; //conversão explicita (CAST)
        System.out.println(b);

        int c = 128;
        byte d = (byte) c; //conversão explicita (CAST)
        System.out.println(d);

        double e = 1.9999;
        int f = (int) e; //conversão explicita (CAST)
        System.out.println(f);
    }
}
