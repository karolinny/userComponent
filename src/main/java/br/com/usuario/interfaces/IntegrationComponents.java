/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.usuario.interfaces;

import br.com.usuario.beans.Usuario;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.BindingType;

/**
 *
 * @author karol
 */
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface IntegrationComponents {

    @WebMethod
    public Usuario consultaUsuario(@WebParam String token,@WebParam String tif);
}
