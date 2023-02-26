package svl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;

import bean.Cine;

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
    	
    	//-----LISTAS CINES
    	//List<Cine> lstCines = CineDAO.getVerCinesList();
    	//session.setAttribute("id", lstCines == null ? null : "cines");
    	//session.setAttribute("lstCines", lstCines);
    	
    } else {
    	
    	String[] aCine = CineDAO.getVerCine( idCine );
    	session.setAttribute("id", aCine == null ? null : "cine");
    	session.setAttribute("cine", aCine);
    	session.setAttribute("tarifas", CineDAO.getCineTarifa( idCine ));
    	session.setAttribute("peliculas", CineDAO.getCinePelicula( idCine ));
    	
    	//-----LISTAS CINE
    	//Cine cine = CineDAO.getCineList( idCine );
    	//session.setAttribute("ID", cine == null ? null : "cine" );
    	//session.setAttribute("cine", cine);
    	//session.setAttribute("lstCineTarifa", CineDAO.getCineTarifaList( idCine ) );
    	//session.setAttribute("lstCinePelicula", CineDAO.getCinePeliculaList( idCine ) );
    
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
