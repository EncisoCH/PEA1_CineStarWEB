package bean;

import java.util.ArrayList;
import java.util.List;

public class CinePelicula {

	String Titulo="", Horarios="";
	
	public CinePelicula() {  
	}
	
	public CinePelicula( String Titulo, String Horarios) {
		this.Titulo = Titulo;
		this.Horarios = Horarios;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public String getHorarios() {
		return Horarios;
	}

	public void setHorarios(String horarios) {
		Horarios = horarios;
	}

	public List<CinePelicula> getCinePeliculaList(String[][] registros) {
		if ( registros == null ) return null;
		
		List<CinePelicula> lstCinePelicula = new ArrayList<>();
		for( String[] aCinePelicula : registros )
			lstCinePelicula.add( new CinePelicula( aCinePelicula[0], aCinePelicula[1]));
		
		return lstCinePelicula;
	}
	
}
