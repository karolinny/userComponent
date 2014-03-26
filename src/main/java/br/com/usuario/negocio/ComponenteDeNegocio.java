package br.com.usuario.negocio;

import br.com.administrador.soap.Usuario;
import br.com.usuario.consumidor.ConsumidorDoComponentAdmin;

public class ComponenteDeNegocio {

	private ConsumidorDoComponentAdmin consumidorDoComponentAdmin;

	public ComponenteDeNegocio() {
		consumidorDoComponentAdmin = new ConsumidorDoComponentAdmin();
	}

	public Usuario getUsuario(String token, String tif) {
		if (validaTempoDoToken(token))
			return consumidorDoComponentAdmin.buscaUsuarioPorTif(tif);
		else
			return null;
	}

	private boolean validaTempoDoToken(String token) {
		return false;
	}

}
