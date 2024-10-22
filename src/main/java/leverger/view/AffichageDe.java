package leverger.view;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import leverger.model.de.*;

public class AffichageDe extends StackPane{
	
	De de = new De();
	
	public AffichageDe () {
		
		setMinWidth(ConstantesDAffichage.APP_LARGEUR);
    	setMinHeight(ConstantesDAffichage.AFFICHAGE_DE_HAUTEUR);
    	setTranslateX(ConstantesDAffichage.APP_LARGEUR / 2);
    	setTranslateY(ConstantesDAffichage.AFFICHAGE_TITRE_HAUTEUR +
    			ConstantesDAffichage.AFFICHAGE_JOUEUR_HAUTEUR +
    			ConstantesDAffichage.AFFICHAGE_VERGER_HAUTEUR +
    			(ConstantesDAffichage.AFFICHAGE_DE_HAUTEUR / 2));
    	
    	
    	Rectangle box = new Rectangle(ConstantesDAffichage.APP_LARGEUR, ConstantesDAffichage.AFFICHAGE_DE_HAUTEUR);
    	box.setFill(Color.LIGHTGRAY);
		
		de.setTranslateX(0);
    	de.setTranslateY(0);
    	
    	getChildren().addAll(box, de);
	}

}
