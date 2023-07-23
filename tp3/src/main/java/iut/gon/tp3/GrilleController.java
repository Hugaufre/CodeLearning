package iut.gon.tp3;

import javafx.fxml.FXML;
import javafx.scene.layout.GridPane;

public class GrilleController {

	@FXML GridPane grille;
	
	public void initialize() {
		
		grille.setStyle("-fx-background-color: seashell");
	}
}
