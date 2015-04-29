package gestionemerende;

public class Bibita extends Articolo {
	private double quantità;
	
	public Bibita(String codice, String descrizione, double costoUnitario, double apportoCalorico, double quantità) {
		super(codice, descrizione,costoUnitario, apportoCalorico);
		if(quantità<=0){
			throw new IllegalArgumentException("La quantità di una bibita non può essere nullo o negativo");
		}
		this.quantità=quantità;
	}

	public double getQuantità(){
		return this.quantità;
	}
}
