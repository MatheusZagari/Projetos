package jbdc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import static jbdc.FabricaConexao.getConexao;

public class AlteraNomePessoaTeste {
    private static PreparedStatement selectStmt;
    private static PreparedStatement updateStmt;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o código da pessoa: ");
        int codigo = sc.nextInt();

        String select = "SELECT * FROM pessoas WHERE codigo = ?";
        String update = "UPDATE pessoas SET nome = ? WHERE codigo = ?";

        try (Connection conexao = getConexao()) {
            selectStmt = conexao.prepareStatement(select);
            updateStmt = conexao.prepareStatement(update);

            if (buscarPessoa(codigo)) {
                sc.nextLine(); // Consume the newline

                System.out.print("Informe o novo nome: ");
                String novoNome = sc.nextLine();

                atualizarNome(codigo, novoNome);

                System.out.println("Nome alterado com sucesso!");
            } else {
                System.out.println("Pessoa não encontrada!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            sc.close();
            fecharRecursos();
        }
    }

    private static boolean buscarPessoa(int codigo) throws SQLException {
        selectStmt.setInt(1, codigo);
        try (ResultSet r = selectStmt.executeQuery()) {
            if (r.next()) {
                Pessoa p = new Pessoa(r.getInt(1), r.getString(2));
                System.out.println("O nome atual é " + p.getNome());
                return true;
            }
        }
        return false;
    }

    private static void atualizarNome(int codigo, String novoNome) throws SQLException {
        updateStmt.setString(1, novoNome);
        updateStmt.setInt(2, codigo);
        updateStmt.execute();
    }

    private static void fecharRecursos() {
        try {
            if (selectStmt != null && !selectStmt.isClosed()) {
                selectStmt.close();
            }
            if (updateStmt != null && !updateStmt.isClosed()) {
                updateStmt.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
