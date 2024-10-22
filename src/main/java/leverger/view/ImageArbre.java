package leverger.view;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.geometry.Pos;
import javafx.scene.shape.Rectangle;
import leverger.model.verger.Arbre;
import leverger.model.verger.CouleurFruit;
import leverger.model.verger.Fruit;
import leverger.model.verger.NomArbre;
import leverger.model.verger.NomFruit;

public class ImageArbre extends StackPane{

	private ImageView arbrePommier = new ImageView();
	private ImageView arbrePoirier = new ImageView();
	private ImageView arbrePrunier = new ImageView();
	private ImageView arbreCerisier = new ImageView();
	
	public ImageArbre() {
		
		Rectangle border = new Rectangle(120, 120);
		setAlignment(Pos.CENTER);
		border.setFill(Color.RED);
		
		Fruit pomme = new Fruit(NomFruit.POMME,CouleurFruit.VERT);
    	Fruit poire = new Fruit(NomFruit.POIRE,CouleurFruit.JAUNE);
    	Fruit prune = new Fruit(NomFruit.PRUNE,CouleurFruit.BLEU);
    	Fruit cerise = new Fruit(NomFruit.CERISE,CouleurFruit.ROUGE);
    	
    	Arbre pommier = new Arbre(NomArbre.POMMIER,pomme);
    	Arbre poirier = new Arbre(NomArbre.POIRIER,poire);
    	Arbre prunier = new Arbre(NomArbre.PRUNIER,prune);
    	Arbre cerisier = new Arbre(NomArbre.CERISIER,cerise);
		
		ChangerNombreFuitDansUnArbre(arbrePommier,pommier,10);
		ChangerNombreFuitDansUnArbre(arbrePoirier,poirier,10);
		ChangerNombreFuitDansUnArbre(arbrePrunier,prunier,10);
		ChangerNombreFuitDansUnArbre(arbreCerisier,cerisier,10);
		
		arbrePommier.setFitWidth(ConstantesDAffichage.LARGEUR_IMAGE_ARBRE);
		arbrePommier.setFitHeight(ConstantesDAffichage.HAUTEUR_IMAGE_ARBRE);
		
		arbrePoirier.setFitWidth(ConstantesDAffichage.LARGEUR_IMAGE_ARBRE);
		arbrePoirier.setFitHeight(ConstantesDAffichage.HAUTEUR_IMAGE_ARBRE);
		
		arbrePrunier.setFitWidth(ConstantesDAffichage.LARGEUR_IMAGE_ARBRE);
		arbrePrunier.setFitHeight(ConstantesDAffichage.HAUTEUR_IMAGE_ARBRE);
		
		arbreCerisier.setFitWidth(ConstantesDAffichage.LARGEUR_IMAGE_ARBRE);
		arbreCerisier.setFitHeight(ConstantesDAffichage.HAUTEUR_IMAGE_ARBRE);
		
		getChildren().addAll(border, arbrePommier,arbrePoirier,arbrePrunier,arbreCerisier);
	}
	
	public void ChangerNombreFuitDansUnArbre(ImageView arbre, Arbre typeArbre,int nombreFuit) {
		String cheminImage = "/images/"+typeArbre.nomArbre.nom()+"/dessin "+typeArbre.nomArbre.nom()+" "+ nombreFuit + " fruits.png";
		arbre.setImage(new Image(getClass().getResourceAsStream(cheminImage)));
	}
	
	public ImageView getPommier() {
		return this.arbrePommier;
	}
	
	public ImageView getPoirier() {
		return this.arbrePoirier;
	}
	
	public ImageView getPrunier() {
		return this.arbrePrunier;
	}
	
	public ImageView getCerisier() {
		return this.arbreCerisier;
	}
}
