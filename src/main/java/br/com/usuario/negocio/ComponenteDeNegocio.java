package br.com.usuario.negocio;

import br.com.usuario.consumidor.ConsumidorDoComponentAdmin;

public class ComponenteDeNegocio {

	private ConsumidorDoComponentAdmin consumidorDoComponentAdmin;

	public ComponenteDeNegocio() {
		consumidorDoComponentAdmin = new ConsumidorDoComponentAdmin();
	}

	//public Usuario getUsuario(String tif, String token) {
		//if (validaTempoDoToken(token))
		//	return consumidorDoComponentAdmin.buscaUsuarioPorTif(tif);
		//else
		//	return null;
	//}

	private boolean validaTempoDoToken(String token) {
		return true;
	}

}
