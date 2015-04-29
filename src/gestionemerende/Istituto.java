package gestionemerende;

import java.util.Vector;

public class Istituto {
	
	private String nome;
	private Vector<Classe> classi;
	
	public Istituto(String nome) {
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
		this.classi = new Vector<Classe>();
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
	
	public void addClasse(Classe nuovaClasse){
		if(nuovaClasse == null){
			throw new IllegalArgumentException("La nuova classe non può essere null");
		}
		this.classi.addElement(nuovaClasse);
	}
}
