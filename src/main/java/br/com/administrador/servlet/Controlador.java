package br.com.administrador.servlet;

import br.com.usuario.data.ConnectionFactory;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.usuario.negocio.ComponenteDeNegocio;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

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
	/*	Usuario usuario = componenteDeNegocio.getUsuario(tif, token);
		if (usuario == null) {
			request.setAttribute("mensagem", "Usuario n�o encontrado!");
		} else {
			request.setAttribute("mensagem", "Usuario encontrado!");
			request.setAttribute("usuario", usuario);
		}

		request.getRequestDispatcher("/resultado.jsp").forward(request,
				response);

	}*/
                 
        ConnectionFactory con = new ConnectionFactory();
            try {
                System.out.println(con.getConnection());
            } catch (SQLException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

}
