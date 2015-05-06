package gestionemerende;

public class ElementoOrdine {
	private int quantit�;
	private Articolo articolo;
	private Ordine ordine;
	
	public ElementoOrdine(Articolo articolo, int quantit�, Ordine ordine) {
		if(articolo == null){
			throw new IllegalArgumentException("L'articolo non pu� essere null");
		}
		this.articolo=articolo;
		
		if(quantit�<0){
			throw new IllegalArgumentException("La quantit� non pu� essere negativa");
		}
		this.quantit�=quantit�;

		if(ordine == null){
			throw new IllegalArgumentException("L'ordine non pu� essere null");
		}
		this.ordine=ordine;
	}

	public int getQuantit�() {
		return quantit�;
	}

	public Articolo getArticolo() {
		return articolo;
	}

	public void setQuantit�(int quantit�) {
		this.quantit� = quantit�;
	}

	public void setArticolo(Articolo articolo) {
		this.articolo = articolo;
	}

	public void setOrdine(Ordine ordine) {
		this.ordine = ordine;
	}

	public Ordine getOrdine() {
		return ordine;
	}

}
