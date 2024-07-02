public class operadoresTernarios {
    public static void main(String[] args) {

        double media = 5.6;

        String resultadoParcial = media >= 5.0 ? "recuperação" : "reprovado";
        String resultadoFinal = media >= 7.0 ? "Aprovado" : resultadoParcial;

        System.out.println("o aluno está " +resultadoFinal);

        double nota = 9.9;
        boolean bomComportamento = true;
        boolean passouPorMedia = nota >= 7; // Nota maior ou igual a 7
        boolean temDesconto = bomComportamento && passouPorMedia; // bom comportamento E passou por nota
        String resultado = temDesconto ? "Sim" : "Não";

        System.out.println("Tem Desconto?  " + resultado);
    }
}
