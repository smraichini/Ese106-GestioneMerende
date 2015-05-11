package gestionemerende;

import java.util.Vector;

public abstract class Articolo {
	private String codice;
	private String descrizione;
	private double costoUnitario;
	private double apportoCalorico;
	private Vector<ElementoOrdine> elementiOrdine;
	
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
	
	public void addElementoOrdine(ElementoOrdine elementoOrdine){
		elementiOrdine.addElement(elementoOrdine);
		
	}
	
	public int getOrdinitotali(){
		int nv = 0;
		for(ElementoOrdine elemento : elementiOrdine) {
			nv += elemento.getQuantità();
		}
		return nv;
	}

}
