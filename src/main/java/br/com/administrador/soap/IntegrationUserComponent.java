
package br.com.administrador.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IntegrationUserComponent", targetNamespace = "http://soap.administrador.com.br/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IntegrationUserComponent {


    /**
     * 
     * @param arg0
     * @return
     *     returns br.com.administrador.soap.Usuario
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://soap.administrador.com.br/IntegrationUserComponent/buscaUsuarioPorTifRequest", output = "http://soap.administrador.com.br/IntegrationUserComponent/buscaUsuarioPorTifResponse")
    public Usuario buscaUsuarioPorTif(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0);

}
