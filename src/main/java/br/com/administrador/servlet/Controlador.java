package br.com.administrador.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.administrador.soap.Usuario;
import br.com.usuario.negocio.ComponenteDeNegocio;

/**
 * Servlet implementation class Controlador
 */
@WebServlet("/controlador")
public class Controlador extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Controlador() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		ComponenteDeNegocio componenteDeNegocio = new ComponenteDeNegocio();
		String tif = request.getParameter("tif");
		String token = request.getParameter("token");
		Usuario usuario = componenteDeNegocio.getUsuario(tif, token);
		if (usuario == null) {
			request.setAttribute("mensagem", "Usuario não encontrado!");
		} else {
			request.setAttribute("mensagem", "Usuario encontrado!");
			request.setAttribute("usuario", usuario);
		}

		request.getRequestDispatcher("/resultado.jsp").forward(request,
				response);

	}

}
