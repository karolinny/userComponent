/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.usuario.data;

import java.sql.SQLException;

/**
 *
 * @author karol
 */
public class App {
    
    public static void main(String[] args) throws SQLException {
        
        ConnectionFactory con = new ConnectionFactory();
        
        System.out.println(con.getConnection());
    }
}
