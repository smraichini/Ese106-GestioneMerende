package gestionemerende;

public abstract class Articolo {
	private String codice;
	private String descrizione;
	private double costoUnitario;
	private double apportoCalorico;

	public Articolo(String codice, String descrizione, double costoUnitario, double apportoCalorico) {
		
		if(codice != null){
			if(codice.length()>=0){
				this.codice=codice;
			}
		    else{
		    	throw new IllegalArgumentException("Il codice deve essere presente");
		   	}
		}
		else{
			throw new IllegalArgumentException("Il codice deve essere presente");
		}
		
		
		
		if(descrizione != null){
			if(descrizione.length()>=0){
				this.descrizione=descrizione;
			}
		    else{
		    	throw new IllegalArgumentException("La descrizione deve essere presente");
		   	}
		}
		else{
			throw new IllegalArgumentException("La descrizione deve essere presente");
		}
		
		
		if(costoUnitario<=0){
			throw new IllegalArgumentException("Il costo di un articolo non può essere nullo o negativo");
		}
		this.costoUnitario=costoUnitario;
		
		if(apportoCalorico<=0){
			throw new IllegalArgumentException("L'apporto calorico non può essere nullo o negativo");
		}
		
		this.apportoCalorico = apportoCalorico;
	}

	public double getCostoUnitario() {
		return costoUnitario;
	}

	public void setCostoUnitario(double costoUnitario) {
		if(costoUnitario<=0){
			throw new IllegalArgumentException("Il costo di un articolo non può essere nullo o negativo");
		}
		this.costoUnitario=costoUnitario;
	}

	public String getCodice() {
		return codice;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public double getApportoCalorico() {
		return apportoCalorico;
	}

}
