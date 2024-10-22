package leverger.model.verger;

import leverger.view.ImageArbre;

public class Arbre {

	public NomArbre nomArbre;
	public int nombreFruit = 10;
	public Fruit typeFruit;
	public ImageArbre image;
	
	public Arbre( NomArbre nomArbre,  Fruit typeFruit) {
		this.nomArbre = nomArbre;
		this.typeFruit = typeFruit;
	}
}
