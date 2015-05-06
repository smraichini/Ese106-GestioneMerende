package gestionemerende;


import java.util.Vector;

public class Ordine {
	
	private String codice;
	private Classe classe;
	private Vector<ElementoOrdine> articoli;
	
	public Ordine(String codice) {
		if(codice != null){
			if(codice.length()>0){
				this.codice=codice;
			}
		    else{
		    	throw new IllegalArgumentException("Il codice deve essere presente");
		   	}
			
		}
		else{
	    	throw new IllegalArgumentException("Il codice deve essere presente");
	   	}
		articoli = new Vector<ElementoOrdine>();
	}
	
	public void addArticolo(Articolo articolo, int quantità){
		
		if(articolo != null){
			if(quantità >= 0){
				this.articoli.addElement(new ElementoOrdine(articolo, quantità,this));
			}
			else{
				throw new IllegalArgumentException("quantità cannot be less than 0");
			}
		}
		else{
			throw new IllegalArgumentException("a cannot be null");
		}
	}

	public double getCostoTotale(){
		double costo=0;
		for( ElementoOrdine a : this.articoli){
			costo=a.getArticolo().getCostoUnitario()*a.getQuantità();
		}
		
		return costo;
	}
	
	public int getNumeroArticoli(){
		return this.articoli.size();
	}
	
	public String getCodice(){
		return this.codice;
	}
	
	public Classe getClasse(){
		return this.classe;
	}
	
	public void setClasse(Classe classe){
		if(classe == null){
			throw new IllegalArgumentException("nope");
		}
		this.classe=classe;
	}
	
	public Vector<ElementoOrdine> getArticoli(){
		return this.articoli;
	}

}
