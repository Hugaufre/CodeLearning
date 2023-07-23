package iut.gon.tp3;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;

public class GrilleController {

	@FXML GridPane grille;
	
	public void initialize() {
		
		grille.setStyle("-fx-background-color: seashell");
		
		Label[][] label = new Label[3][3];
		
		for(int l = 0; l < 3;l++) {
			for(int c = 0; c < 3;c++) {
				 label[l][c] = new Label();
				label[l][c].setText(String.format("L%dC%d",l,c));
				label[l][c].setMaxSize(1000, 1000);
				label[l][c].setAlignment(Pos.CENTER);
				label[l][c].setFont(Font.font(20));
			
				int c2 = c;
				int l2 = l;
				label[l][c].addEventHandler(MouseEvent.MOUSE_CLICKED, event->{
					label[l2][c2].setText("Bonjour");
				});
				
				grille.add(label[l][c], l, c);
				
			}
		}
	}
}
