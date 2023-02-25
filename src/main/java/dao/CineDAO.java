package dao;

public class CineDAO {
	
	db.Db db = new db.Db("CineStar");

	public String[][] getVerCines() {
		db.Sentencia("call sp_getCines()");
		return db.getRegistros();
	}

	public String[] getVerCine(Object idCine) {
		db.Sentencia( String.format("call sp_getCines(%s)", idCine));
		return db.getRegistro();
	}

	public String[][] getCineTarifa(Object idCine) {
		db.Sentencia( String.format("call sp_getCineTarifas(%s)", idCine));
		return db.getRegistros();
	}

	public String[][] getCinePelicula(Object idCine) {
		db.Sentencia( String.format("call sp_getCinePeliculas(%s)", idCine));
		return db.getRegistros();
	}


}
