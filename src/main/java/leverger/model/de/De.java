package leverger.model.de;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.geometry.Pos;
import javafx.scene.shape.Rectangle;
import leverger.view.ConstantesDAffichage;

public class De extends StackPane{

	private ImageView imageView = new ImageView();
	
	public De() {
		
		Rectangle border = new Rectangle(100, 100);
		setAlignment(Pos.CENTER);
		border.setFill(Color.RED);
		
		lancerLeDe(4);
		imageView.setFitWidth(ConstantesDAffichage.LARGEUR_DE);
		imageView.setFitHeight(ConstantesDAffichage.HAUTEUR_DE);
		
		getChildren().addAll(border, imageView);
	}
	
	public void lancerLeDe(int nombreFace) {
		final int MIN = 1;
		final int MAX = 4;
		int nombreAleatoire = (int) (Math.random() * MAX + MIN );
		String cheminImage = "/images/de/"+nombreAleatoire+".png";
		imageView.setImage(new Image(getClass().getResourceAsStream(cheminImage)));
	}
}