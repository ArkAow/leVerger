package leverger.view;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;

public class AffichageTitre extends StackPane {

	public AffichageTitre() {
	
    	setMinWidth(ConstantesDAffichage.APP_LARGEUR);
    	setMinHeight(ConstantesDAffichage.AFFICHAGE_TITRE_HAUTEUR);
    	setTranslateX(ConstantesDAffichage.APP_LARGEUR / 2);
    	setTranslateY(ConstantesDAffichage.AFFICHAGE_TITRE_HAUTEUR / 2);
    	
    	Rectangle box = new Rectangle(ConstantesDAffichage.APP_LARGEUR, ConstantesDAffichage.AFFICHAGE_TITRE_HAUTEUR);
    	box.setFill(Color.LIGHTGRAY);
    	
    	Label titre = new Label("Le Verger");
    	titre.setMinWidth(ConstantesDAffichage.APP_LARGEUR);
    	titre.setMinHeight(ConstantesDAffichage.AFFICHAGE_TITRE_HAUTEUR);
    	titre.setAlignment(Pos.CENTER);
    	titre.setFont(Font.font(30));
    	
    	getChildren().addAll(box, titre);
	}
}
