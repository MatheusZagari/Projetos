package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost?useSSL=false";
        final String usuario = "root";
        final String senha = "12345678";

        Connection conexao = DriverManager.getConnection(url, usuario, senha);
        System.out.println("Conexão estabelecida com sucesso!");
        conexao.close();
    }
}
