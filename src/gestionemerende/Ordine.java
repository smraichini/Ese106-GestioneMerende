package gestionemerende;

import java.time.LocalDate;
import java.util.Vector;

public class Ordine {
	
	private String codice;
	private Classe classe;
	private Vector<Articolo> articoli;
	
	public Ordine(Classe classe, LocalDate g) {
		if(classe != null){
				this.classe=classe;
			}
		    else{
		    	throw new IllegalArgumentException("La classe deve essere presente");
		   	}
		
		if(g == null){
			
			throw new IllegalArgumentException("La data deve essere presente");
		}
		
		this.codice=classe.getNome()+ g;
				
		articoli = new Vector<Articolo>();
	}
	
	public void addArticolo(Articolo articolo){
		
		if(articolo != null){
			this.articoli.addElement(articolo);
		}
		else{
			throw new IllegalArgumentException("L'articolo da aggiungere non deve essere null");
		}
	}

	public double getCostoTot(){
		double costo=0;
		for( double i : this.articoli.getCostoUnitario()){
			costo = costo+i;  //DA RIVEDERE DOPO
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
	
	public Vector<Articolo> getArticoli(){
		return this.articoli;
	}

}
