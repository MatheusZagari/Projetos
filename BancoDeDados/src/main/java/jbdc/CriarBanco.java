package jbdc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco  {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=false";
        final String usuario = "root";
        final String senha = "root";

        Connection conexao = DriverManager.getConnection(url, usuario, senha);
        System.out.println("Conexão estabelecida com sucesso!");

        Statement stmt = conexao.createStatement();
        stmt.execute("CREATE DATABASE IF NOT EXISTS curso_java");
        System.out.println("Banco criado com sucesso!");

        conexao.close();
    }
}
