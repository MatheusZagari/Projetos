package jbdc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import static jbdc.FabricaConexao.getConexao;

public class AlteraNomePessoa {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o código da pessoa: ");
        int codigo = sc.nextInt();

        String select = "SELECT * FROM pessoas WHERE codigo = ?";
        String updade = "UPDATE pessoas SET nome = ? WHERE codigo = ?";

        Connection conexao = getConexao();
        PreparedStatement stmt = conexao.prepareStatement(select);
        stmt.setInt(1, codigo);
        ResultSet r = stmt.executeQuery();


        if (r.next()) {
            Pessoa p = new Pessoa(r.getInt(1), r.getString(2));

            System.out.println("O nome atual é " + p.getNome());
            sc.nextLine();

            System.out.print("Informe o novo nome: ");
            String novoNome = sc.nextLine();


            stmt.close();

            stmt = conexao.prepareStatement(select);
            stmt.setString(1, novoNome);
            stmt.setInt(2, codigo);
            stmt.execute();

            System.out.println("Nome alterado com sucesso!");
        }
        else {
            System.out.println("Pessoa não encontrada!");
        }
        conexao.close();
        sc.close();
    }
}
