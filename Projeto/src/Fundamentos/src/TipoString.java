public class TipoString {
    public static void main(String[] args) {
        System.out.println("Olá Pessoal".charAt(4));

        String s = "boa Tarde";
        System.out.println(s.concat("!!!"));
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.toLowerCase().startsWith("boa"));
        System.out.println(s.toLowerCase().startsWith("boa"));
        System.out.println(s.endsWith("TARDE"));
        System.out.println(s.length());
        System.out.println(s.equals("boa tarde"));
        System.out.println(s.equalsIgnoreCase("boa tarde"));

        var nome = "Pedro";
        var sobrenome = "Santos";
        var idade = 53;
        var salario = 12345.44;

        System.out.printf("O senhor %s %s tem %d anos e ganhar R$%.2f.", nome, sobrenome, idade, salario);

        String frase = String.format ("\n\nO Senhor %s %s tem %d anos e ganhar R$%.2f.", nome, sobrenome, idade, salario);
        System.out.println(frase);
    }
}
