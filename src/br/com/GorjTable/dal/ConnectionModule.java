package br.com.GorjTable.dal;

import java.sql.*;

public class ConnectionModule {
    //Método responsavel por se conectar ao banco

    public static Connection conector() {
        java.sql.Connection conexao = null;
        String driver = "com.mysql.cj.jdbc.Driver";
        //Info Banco de dados connection
        String url = "jdbc:mysql://localhost:3306/gorjtable";
        String user = "root";
        String password = "3068";
        //Estabelecer a conexão
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }

    }

}
