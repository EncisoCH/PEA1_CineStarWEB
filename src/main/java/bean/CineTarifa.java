package bean;

import java.util.ArrayList;
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


	public List<CineTarifa> getCineTarifaList(String[][] xRegistros) {
		if ( xRegistros == null ) return null;
		
		List<CineTarifa> lstCineTarifa = new ArrayList<>();
		for( String[] aCineTarifa : xRegistros )
			lstCineTarifa.add( new CineTarifa( aCineTarifa[0], aCineTarifa[1] ) );
		
		return lstCineTarifa;
	}


	
}
