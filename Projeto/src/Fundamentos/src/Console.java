import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        System.out.print("Bom");
        System.out.print(" dia!\n");
        // O scanner serve pra você conseguir monitorar as informações que estão sendo inseridas no código duarnte o processo.
        Scanner entrada = new Scanner(System.in);
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o seu idade: ");
        int idade = teclado.nextInt();
        teclado.nextLine(); //lê o "\n" que o telado.nextLine() deixa pra trás.

        System.out.println("Digite o seu nome: ");
        String nome = teclado.nextLine();

        System.out.println("Digite o seu sobrenome: ");
        String sobrenome = teclado.nextLine();

        System.out.printf("\nNome = %s %s %d ", nome, sobrenome, idade);

        teclado.close(); // O comando scanner tem que ser fechado pra não pegar processamento desnecessario
    }
}
