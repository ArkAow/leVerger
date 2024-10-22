package leverger.view;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Font;

public class AffichageJoueur extends StackPane{

	private Polygon triangle;
	private Label tour;
	
	public AffichageJoueur() {
		
    	setMinWidth(ConstantesDAffichage.APP_LARGEUR);
    	setMinHeight(ConstantesDAffichage.AFFICHAGE_JOUEUR_HAUTEUR);
    	setTranslateX(ConstantesDAffichage.APP_LARGEUR / 2);
    	setTranslateY(ConstantesDAffichage.AFFICHAGE_TITRE_HAUTEUR + (ConstantesDAffichage.AFFICHAGE_JOUEUR_HAUTEUR / 2));
    	
    	tour = new Label("Tour numéro 1");
    	tour.setMinWidth(240);
    	tour.setMinHeight(30);
    	tour.setAlignment(Pos.CENTER);
    	tour.setFont(Font.font(24));
    	tour.setTranslateY(-30);
    	
    	Label joueur1 = new Label("Joueur 1");
    	joueur1.setMinWidth(120);
    	joueur1.setMinHeight(30);
    	joueur1.setAlignment(Pos.CENTER);
    	joueur1.setFont(Font.font(18));
    	joueur1.setTranslateX(-150);
    	joueur1.setTranslateY(+10);
    	
    	Label joueur2 = new Label("Joueur 1");
    	joueur2.setMinWidth(120);
    	joueur2.setMinHeight(30);
    	joueur2.setAlignment(Pos.CENTER);
    	joueur2.setFont(Font.font(18));
    	joueur2.setTranslateX(+150);
    	joueur2.setTranslateY(+10);
    	
    	triangle = new Polygon();
    	triangle.setFill(Color.RED);
    	triangle.getPoints().addAll(new Double[] {
    		5.0, 0.0,
    		-4.0, -4.0,
    		-4.0,4.0
    	});
    	triangle.setTranslateX(-195);
    	triangle.setTranslateY(+10);
    	
    	getChildren().addAll(tour, joueur1, joueur2, triangle);
	}
	
	public void CestAuTourDeJoueur1() {
		triangle.setTranslateX(-195);
	}
	
	public void CestAuTourDeJoueur2() {
		triangle.setTranslateX(+105);
	}
	
	public void mettreAJourLeNumeroDuTour(int numeroTour) {
		tour.setText("Tour Numéro " + Integer.toString(numeroTour));
	}
}
