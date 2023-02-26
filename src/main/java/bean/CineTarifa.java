package bean;

import java.util.List;

public class CineTarifa {

	String DiasSemana="", Precios="";
	
	public CineTarifa() {
	}
	
	public CineTarifa( String DiasSemana, String Precios) {
		this.DiasSemana = DiasSemana;
		this.Precios = Precios;
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


	public List<CineTarifa> getCineTarifaList(String[][] registros) {
		// TODO Auto-generated method stub
		return null;
	}


	
}
