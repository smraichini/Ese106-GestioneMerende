package gestionemerende;

public class Bibita extends Articolo {
	private double quantit�;
	
	public Bibita(String codice, String descrizione, double costoUnitario, double apportoCalorico, double quantit�) {
		super(codice, descrizione,costoUnitario, apportoCalorico);
		if(quantit�<=0){
			throw new IllegalArgumentException("La quantit� di una bibita non pu� essere nullo o negativo");
		}
		this.quantit�=quantit�;
	}

	public double getQuantit�(){
		return this.quantit�;
	}
}
