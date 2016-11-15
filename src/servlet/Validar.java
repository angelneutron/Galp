package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Validar
 */
@WebServlet("/Validar")
public class Validar extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Validar() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String minombre = new String ("angel");
		String misapellidos = new String ("exposito");
		String minumero = new String ("679308278");
		String misbilletes = new String ("5");
		
		String nombre = request.getParameter("nombre");
		String apellidos = request.getParameter("apellidos");
		String numero = request.getParameter("numero tarjeta");
		String enviartarjeta = request.getParameter("enviar tarjeta");
		String numerobilletes = request.getParameter("numero billetes");
		String enviarefectivo = request.getParameter("enviar efectivo");
		
		if (enviartarjeta != null) {
			if ((nombre.equals(minombre)) && (apellidos.equals(misapellidos)) && (numero.equals(minumero))) {
				request.setAttribute("variable", "tarjeta");
				request.getRequestDispatcher("html/combustible.jsp").forward(request, response);
			} else {
				response.sendRedirect("index.html");
			}
		}
		
		if (enviarefectivo != null) {
			if ((nombre.equals(minombre)) && (apellidos.equals(misapellidos)) && (numerobilletes.equals(misbilletes))) {
				request.setAttribute("variable", "efectivo");
				request.getRequestDispatcher("html/combustible.jsp").forward(request, response);
			} else {
				response.sendRedirect("index.html");
			}
		}
	}

	

}
