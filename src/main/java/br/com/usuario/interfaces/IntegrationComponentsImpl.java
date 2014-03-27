/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.usuario.interfaces;

import br.com.usuario.beans.Usuario;
import br.com.usuario.data.Consulta;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;

/**
 *
 * @author karol
 */
@WebService(endpointInterface = "br.com.usuario.interfaces.IntegrationComponents")

public class IntegrationComponentsImpl implements IntegrationComponents{
    
    private Consulta consulta;
    
    @Override
    public Usuario consultaUsuario(String token, String tif) {
        Usuario usuario = new Usuario();
        try {
            usuario = consulta.consulta(tif, token);
        } catch (SQLException ex) {
            Logger.getLogger(IntegrationComponentsImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return usuario;
    }
    
}
