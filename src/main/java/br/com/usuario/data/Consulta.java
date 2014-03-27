/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.usuario.data;

import br.com.usuario.beans.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author karol
 */
public class Consulta {
    private Connection conexao;
    private PreparedStatement statment;

    
    public Usuario consulta(String tif, String token) throws SQLException {
        Usuario u = new Usuario();
        try {

            String command = "SELECT * FROM usuario WHERE tif = ? and token =? ";
            this.statment = this.conexao.prepareStatement(command);
            this.statment.setString(1, tif);
            this.statment.setString(2, token);
            
            
            ResultSet rs = this.statment.executeQuery(command);
            while(rs.next()){
                u.setCpf(rs.getString("cpf"));
                u.setEmail(rs.getString("email"));
                u.setTif(rs.getString("tif"));
                u.setImagem01(rs.getBytes("imagem01"));
                u.setImagem02(rs.getBytes("imagem02"));
                u.setImagem03(rs.getBytes("imagem03"));
                u.setImagem04(rs.getBytes("imagem04"));
            }

        } finally {
            conexao.close();
        }
        return u;

    }
}
