package gestionemerende;

public class ElementoOrdine {
	private int quantità;
	private Articolo articolo;
	private Ordine ordine;
	
	public ElementoOrdine(Articolo articolo, int quantità, Ordine ordine) {
		if(articolo == null){
			throw new IllegalArgumentException("L'articolo non può essere null");
		}
		this.articolo=articolo;
		
		if(quantità<0){
			throw new IllegalArgumentException("La quantità non può essere negativa");
		}
		this.quantità=quantità;

		if(ordine == null){
			throw new IllegalArgumentException("L'ordine non può essere null");
		}
		this.ordine=ordine;
	}

	public int getQuantità() {
		return quantità;
	}

	public Articolo getArticolo() {
		return articolo;
	}

	public void setQuantità(int quantità) {
		this.quantità = quantità;
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
