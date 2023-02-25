package svl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

public class svlCines extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public svlCines() {
        super();
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
    	response.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();
		//---CineDAO
		dao.CineDAO CineDAO = new dao.CineDAO();
	
    
    Object idCine = request.getParameter("idCine");
    
    if ( idCine == null ) {
    	String[][] aCines = CineDAO.getVerCines();
    	session.setAttribute("id", aCines == null ? null : "cines");
    	session.setAttribute("aCines", aCines);
    	
    } else {
    	
    	String[] aCine = CineDAO.getVerCine( idCine );
    	session.setAttribute("id", aCine == null ? null : "cine");
    	session.setAttribute("cine", aCine);
    	session.setAttribute("tarifas", CineDAO.getCineTarifa( idCine ));
    	session.setAttribute("peliculas", CineDAO.getCinePelicula( idCine ));
    
    }
    
    response.sendRedirect("index.jsp");
    
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}


	

}
