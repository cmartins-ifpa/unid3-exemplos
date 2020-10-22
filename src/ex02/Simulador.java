package ex02;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/Simulador")
public class Simulador extends HttpServlet {
	@Override
	public void service(ServletRequest req, ServletResponse resp)
			throws ServletException, IOException {
		// receber os dados do formul�rio e converte para os tipos. 
		 String tipoAplic = req.getParameter("aplicacao");
		 Float  valor = Float.valueOf(req.getParameter("valor"));
		 Integer meses = Integer.valueOf(req.getParameter("meses"));
		 System.out.println("valores = " + tipoAplic + " v=" + valor + " meses="+ meses);
		
		 // atribui os dados ao objeto "rend"
		 Rendimento rend = new Rendimento();
		 rend.setMeses(meses);
		 rend.setTipoAplicacao(tipoAplic);
		 rend.setValor(valor);
		  
		 // salva o objeto Vector com os rendimentos mensais (como bean de request).
		 req.setAttribute("rend_bean", rend.getRendMensais());
        
		 // repassa para a página de resultado.
		//  req.getRequestDispatcher("result.jsp").forward(req, resp);
		 req.getRequestDispatcher("resultDisplay.jsp").forward(req, resp);
	}
	 // 

	
	
}
