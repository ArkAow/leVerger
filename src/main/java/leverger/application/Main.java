package leverger.application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import leverger.view.AffichageArbres;
import leverger.view.AffichageBouton;
import leverger.view.AffichageDe;
import leverger.view.AffichageJoueur;
import leverger.view.AffichageTitre;
import leverger.view.ConstantesDAffichage;

public class Main extends javafx.application.Application{
	
	private int nombreTour = 1;
    private AffichageJoueur tableauJoueur;
    private AffichageArbres tableauArbre;
    private AffichageDe tableauDe;
    private AffichageBouton tableauBouton;
    
    @Override
    public void start (Stage primaryStage) {
        
        BorderPane root = new BorderPane();

        Scene scene = new Scene(root, ConstantesDAffichage.APP_LARGEUR, ConstantesDAffichage.APP_HAUTEUR);
        
        initLayout(root);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    private void initLayout(BorderPane root) {
    	initTitrePane(root);
    	initJoueurPane(root);
    	initVergerPane(root);
    	initDePane(root);
    	initBoutonPane(root);
    }
    private void initTitrePane(BorderPane root) {
   
    	root.getChildren().add(new AffichageTitre());
    }
    private void initJoueurPane(BorderPane root) {
    	
    	tableauJoueur = new AffichageJoueur();
    	tableauJoueur.CestAuTourDeJoueur1();
    	tableauJoueur.mettreAJourLeNumeroDuTour(nombreTour);
    	root.getChildren().add(tableauJoueur);
    }
    private void initVergerPane(BorderPane root) {
    	
    	tableauArbre = new AffichageArbres();
    	root.getChildren().addAll(tableauArbre);
    }
    private void initDePane(BorderPane root) {
    	
    	tableauDe = new AffichageDe();
    	root.getChildren().addAll(tableauDe);
    }
    private void initBoutonPane(BorderPane root) {
    	
    	tableauBouton = new AffichageBouton();
    	root.getChildren().addAll(tableauBouton);
    }
    
    public static void main(String[] args) {
    	
        Application.launch(args);
    }
}
