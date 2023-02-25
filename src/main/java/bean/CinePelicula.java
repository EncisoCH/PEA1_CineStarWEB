package bean;

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
	
}
