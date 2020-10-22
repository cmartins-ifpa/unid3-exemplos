package ex01;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ControladorForm
 */
@WebServlet("/ControladorForm")
public class ControladorForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// recupera o parâmetro que vem da solicitaçao 
		String nome = request.getParameter("nome");
		// instancia um objeto e salva o nome em um "bean" de sessão.
		Usuario usuario = new Usuario(nome);
		request.getSession().setAttribute("USUARIO", usuario);
		request.getRequestDispatcher("homepage.jsp").forward(request, response);
	}

}
