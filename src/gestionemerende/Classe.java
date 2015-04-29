package gestionemerende;

import java.util.Vector;

public class Classe {

	private String nome;
	private Vector<Ordine> ordini;
	
	public Classe(String nome) {
		if(nome != null){
			if(nome.length()>=0){
				this.nome=nome;
			}
		    else{
		    	throw new IllegalArgumentException("Il nome dell'Istituto deve essere presente");
		   	}
		}
		else{
			throw new IllegalArgumentException("Il nome dell'Istituto deve essere presente");
		}
		this.ordini = new Vector<Ordine>();
	}
	
	public void setNome(String nome){
		if(nome != null){
			if(nome.length()>=0){
				this.nome=nome;
			}
		    else{
		    	throw new IllegalArgumentException("Il nome dell'Istituto deve essere presente");
		   	}
		}
		else{
			throw new IllegalArgumentException("Il nome dell'Istituto deve essere presente");
		}
	}
	
	
	
	public String getNome(){
		return this.nome;
	}
	
	
	
	public Vector<Ordine> getOrdini(){
		return this.ordini;
	}
	
	
	
	public void addOrdine(Ordine ordine){
		for(Ordine o : this.ordini){
			if(ordine.getCodice() == o.getCodice())
			{
				throw new IllegalArgumentException("L'ordine giornaliero è già stato effettuato");
			}
		}
		this.ordini.addElement(ordine);
	}

}
