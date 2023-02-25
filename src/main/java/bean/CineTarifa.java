package bean;

public class CineTarifa {

	String DiasSemana="", Precios="";
	
	public CineTarifa( String DiasSemana, String Precio) {
		this.DiasSemana = DiasSemana;
		this.Precios = Precio;
	}
	

	public String getDiasSemana() {
		return DiasSemana;
	}

	public void setDiasSemana(String diasSemana) {
		DiasSemana = diasSemana;
	}

	public String getPrecios() {
		return Precios;
	}

	public void setPrecios(String precios) {
		Precios = precios;
	}
	
	
}
