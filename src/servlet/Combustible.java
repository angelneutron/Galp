package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Combustible
 */
@WebServlet("/Combustible")
public class Combustible extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Combustible() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		int importe = Integer.parseInt(request.getParameter("importe"));
		
		String pagar = request.getParameter("pagar");
		
		if(pagar != null ){
			if(importe <= 60){
				response.sendRedirect("html/gracias.html");
			}else{
				response.sendRedirect("html/combustible.jsp");
			}
		}
		
	
	}

	

}
