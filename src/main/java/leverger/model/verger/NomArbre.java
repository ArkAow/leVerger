package leverger.model.verger;

public enum NomArbre {
	
	POMMIER("pommier"),
	POIRIER("poirier"),
	PRUNIER("prunier"),
	CERISIER("cerisier");
	
	private String nom;
	
	NomArbre(String nom) {
		this.nom = nom;
	}
	
	public final String nom() {
		return nom;
	}
}

