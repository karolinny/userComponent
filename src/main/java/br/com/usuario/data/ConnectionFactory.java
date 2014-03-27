/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.usuario.data;

/**
 *
 * @author karol
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory {
    private String url;
    private String password;
    private String user;
    private String driver;
    private static ConnectionFactory instance = null;

    public ConnectionFactory() {
        //dados da conexao de cazuza
        this.url = "jdbc:mysql://10.1.1.101:3306/pos_autentication";
        this.password = "123456";
        this.user = "root";
        this.driver = "com.mysql.jdbc.Driver";
    }

    public static ConnectionFactory getInstance() {
        if (instance == null) {
            instance = new ConnectionFactory();
        }
        return instance;
    }

    public Connection getConnection() throws SQLException {
        try {
            Class.forName(this.driver);
            return DriverManager.getConnection(this.url, this.user, this.password);                  
        } catch (ClassNotFoundException Driver) {
            throw new SQLException("Driver não localizado: "+Driver);
        } catch(SQLException Fonte){
        throw new SQLException("Deu erro na conexao com a Fonte de Dados: " + Fonte);
        }
    }

}