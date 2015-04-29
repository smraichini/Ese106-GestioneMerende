package gestionemerende;


import java.util.Vector;

public class Ordine {
	
	private String codice;
	private Classe classe;
	private Vector<Articolo> articoli;
	
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
		articoli = new Vector<Articolo>();
	}
	
	public void addArticolo(Articolo articolo){
		
		if(articolo != null){
			this.articoli.addElement(articolo);
		}
		else{
			throw new IllegalArgumentException("a cannot be null");
		}
	}

	public double getCostoTotale(){
		double costo=0;
		for( Articolo a : this.articoli){
			costo=a.getCostoUnitario()+costo;
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
	
	public Vector<Articolo> getArticoli(){
		return this.articoli;
	}

}
