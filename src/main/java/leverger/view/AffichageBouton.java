package leverger.view;

import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class AffichageBouton extends StackPane {

	private Button boutonLancer;
	private Button boutonQuitter;
	
	public AffichageBouton() {
	
		setMinWidth(ConstantesDAffichage.APP_LARGEUR);
    	setMinHeight(ConstantesDAffichage.AFFICHAGE_VERGER_HAUTEUR);
    	setTranslateX(ConstantesDAffichage.APP_LARGEUR / 2);
    	setTranslateY(ConstantesDAffichage.AFFICHAGE_TITRE_HAUTEUR +
    			ConstantesDAffichage.AFFICHAGE_JOUEUR_HAUTEUR +
    			ConstantesDAffichage.AFFICHAGE_VERGER_HAUTEUR +
    			ConstantesDAffichage.AFFICHAGE_DE_HAUTEUR +
    			(ConstantesDAffichage.BOUTON_PANE_HAUTEUR / 2));
    	
    	Rectangle box = new Rectangle(ConstantesDAffichage.APP_LARGEUR, ConstantesDAffichage.BOUTON_PANE_HAUTEUR);
    	box.setFill(Color.GRAY);
    	
    	final int LARGEUR_BOUTON = 120;
    	final int HAUTEUR_BOUTON = 60;
    	
    	boutonLancer = new Button("Lancer le dé");
    	boutonLancer.setMinSize(LARGEUR_BOUTON, HAUTEUR_BOUTON);
    	
    	boutonQuitter = new Button("Quitter");
    	boutonQuitter.setMinSize(LARGEUR_BOUTON, HAUTEUR_BOUTON);
    	boutonQuitter.setTranslateX(-200);
    	
    	getChildren().addAll(box, boutonLancer, boutonQuitter);
	}
}
