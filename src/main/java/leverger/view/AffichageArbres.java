package leverger.view;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class AffichageArbres extends StackPane{
	
	ImageArbre arbre1 = new ImageArbre();
	ImageArbre arbre2 = new ImageArbre();
	ImageArbre arbre3 = new ImageArbre();
	ImageArbre arbre4 = new ImageArbre();
	
	public static final int DISTANCE_IMAGE_ARBRE = -25 ;
	
	public AffichageArbres () {
		
		setMinWidth(ConstantesDAffichage.APP_LARGEUR);
    	setMinHeight(ConstantesDAffichage.AFFICHAGE_VERGER_HAUTEUR);
    	setTranslateX(ConstantesDAffichage.APP_LARGEUR / 2);
    	setTranslateY(ConstantesDAffichage.AFFICHAGE_TITRE_HAUTEUR + ConstantesDAffichage.AFFICHAGE_JOUEUR_HAUTEUR + (ConstantesDAffichage.AFFICHAGE_VERGER_HAUTEUR / 2));
    	
    	Rectangle border = new Rectangle(ConstantesDAffichage.APP_LARGEUR, ConstantesDAffichage.AFFICHAGE_VERGER_HAUTEUR);
    	border.setFill(Color.BLACK);
    	
    	Rectangle box = new Rectangle(ConstantesDAffichage.APP_LARGEUR, ConstantesDAffichage.AFFICHAGE_VERGER_HAUTEUR-2);
    	box.setFill(Color.WHITE);
    	
    	getChildren().addAll(border, box);
    	
    	arbre1.getPommier().setTranslateX(-200);
    	arbre1.getPommier().setTranslateY(DISTANCE_IMAGE_ARBRE);
    	
    	arbre2.getPoirier().setTranslateX(-70);
    	arbre2.getPoirier().setTranslateY(DISTANCE_IMAGE_ARBRE);
    	
    	arbre3.getPrunier().setTranslateX(70);
    	arbre3.getPrunier().setTranslateY(DISTANCE_IMAGE_ARBRE);
    	
    	arbre4.getCerisier().setTranslateX(200);
    	arbre4.getCerisier().setTranslateY(DISTANCE_IMAGE_ARBRE);
    	
    	getChildren().addAll(arbre1, arbre2, arbre3, arbre4);
	}

}
