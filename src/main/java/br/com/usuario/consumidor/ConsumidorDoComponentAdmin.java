package br.com.usuario.consumidor;

import br.com.administrador.soap.IntegrationUserComponent;
import br.com.administrador.soap.IntegrationUserComponentImplService;
import br.com.administrador.soap.Usuario;

public class ConsumidorDoComponentAdmin {

	private IntegrationUserComponentImplService service;

	public Usuario buscaUsuarioPorTif(String tif) {
		try {
			service = new IntegrationUserComponentImplService();
			IntegrationUserComponent port = service
					.getIntegrationUserServicePort();
			return port.buscaUsuarioPorTif(tif);
		} catch (Exception e) {
			return null;
		}
	}
}
