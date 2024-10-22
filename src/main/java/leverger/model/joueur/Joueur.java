package leverger.model.joueur;

public class Joueur {

	public String pseudonyme;

	public int Cueillir (int nombreFruit) {
		return nombreFruit-1;
	}
	
	public int deposerDansLePanier (int numeroPanier,int nombreFruitDansLePanier,int nombre) {
		return nombreFruitDansLePanier+nombre;
	}
}
