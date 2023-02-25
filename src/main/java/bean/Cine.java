package bean;

import java.util.ArrayList;
import java.util.List;

public class Cine {
	int idCine, Salas, idDistrito;
	String razonSocial="", Direccion="", Telefono="", Detalles="";
	
	public Cine() { }
	
	public Cine( String[] xRegistro ) {
		setRegistro(xRegistro);
	}

	private void setRegistro(String[] xRegistro) {
		
		if( xRegistro == null ) return;
		
		idCine = Integer.parseInt(xRegistro[0]);
		razonSocial = xRegistro[1];
		Salas = Integer.parseInt(xRegistro[2]);
		idDistrito = Integer.parseInt(xRegistro[3]);
		Direccion = xRegistro[4];
		Telefono = xRegistro[5];
		Detalles = xRegistro[6];
	}

	//----Getters and Setters
	
	public int getIdCine() {
		return idCine;
	}
	public void setIdCine(int idCine) {
		this.idCine = idCine;
	}
	public int getSalas() {
		return Salas;
	}
	public void setSalas(int salas) {
		Salas = salas;
	}
	public int getIdDistrito() {
		return idDistrito;
	}
	public void setIdDistrito(int idDistrito) {
		this.idDistrito = idDistrito;
	}
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	public String getTelefono() {
		return Telefono;
	}
	public void setTelefono(String telefono) {
		Telefono = telefono;
	}
	public String getDetalles() {
		return Detalles;
	}
	public void setDetalles(String detalles) {
		Detalles = detalles;
	}
	
	
	public Object[] getRegistro() {
		return new Object[] {
				idCine, razonSocial, Salas, idDistrito, Direccion, Telefono, Detalles
		};
	}
	
	
	public List<Cine> getRegistros( String[][] yRegistros ) {
		if ( yRegistros == null ) return null;
		
		List<Cine> lstCines = new ArrayList<>();
		for( String[] aCine : yRegistros )
			lstCines.add(new Cine( aCine ));
		
		return lstCines;
	}

}
