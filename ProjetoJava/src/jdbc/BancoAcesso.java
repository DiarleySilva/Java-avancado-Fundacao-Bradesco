package jdbc;

import java.sql.*;

/**
 * @author diarley
 */
public class BancoAcesso {

    public static void main(String[] args) {

        /*
        Para acessar o banco de dados, primeiro foi preciso cria-lo
        com os comandos: 
        
        CREATE DATABASE teste;

        USE teste;
        
        CREATE TABLE Pessoa(
            codigo int primary key, 
            nome varchar(30),
            sexo varchar(1)
        );
        
        INSERT INTO Pessoa VALUES (1, "CARLOS", "M");
        INSERT INTO Pessoa VALUES (2, "DANIEL", "M");
        INSERT INTO Pessoa VALUES (3, "JEFFERSON", "M");
        INSERT INTO Pessoa VALUES (4, "LEONARDO", "M");
        INSERT INTO Pessoa VALUES (5, "LUCCAS", "M");
        INSERT INTO Pessoa VALUES (6, "LIDIANA", "F");
        INSERT INTO Pessoa VALUES (7, "ALESSANDRA", "F");
        INSERT INTO Pessoa VALUES (8, "LIVIA", "F");
        INSERT INTO Pessoa VALUES (9, "ERICA", "F");
        INSERT INTO Pessoa VALUES (10, "PATRICIA", "F");
        
         */
        String sql = "SELECT codigo, nome, sexo FROM Pessoa";
        String url = "jdbc:mysql://localhost:3306/teste";

        try {

            Connection conexao = DriverManager.getConnection(url, "root", "Root1234@");
            PreparedStatement stm = conexao.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getString("nome"));
            }
            conexao.close();
        } catch (SQLException erro) {
            System.out.println(erro);
        } finally {
            System.out.println("Encerrando conexão...");
        }
    }
}