package iut.gon.tp3;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;

public class GrilleController {

    @FXML
    private GridPane grille;
    
    private Label[][] labelTab = new Label[3][3];
    private GrilleModel grilleModel = new GrilleModel();
    
    
    public GrilleController(GrilleModel grilleModel) {
    	this.grilleModel = grilleModel;
    }
    
    public void initialize() {
    	grille.setStyle("-fx-background-color: seashell");
    	for(int lig = 0; lig < 3; lig++) {
    		for(int col = 0; col < 3; col++) {
    			Label label = new Label();
    			grilleModel.setCase(lig, col, String.format("L%dC%d", lig, col));
    			label.setText(grilleModel.getCase(lig, col));
    			label.setMaxSize(1000, 1000);
    			label.setAlignment(Pos.CENTER);
    			label.setFont(Font.font(20));
    			int lig2 = lig;
    			int col2 = col;
    			label.addEventHandler(MouseEvent.MOUSE_CLICKED, event->{
    				grilleModel.setCase(lig2, col2, "Bonjour");
    				label.setText(grilleModel.getCase(lig2, col2));
    			});
    			grille.add(label, lig, col);
    			labelTab[lig][col] = label;
    		}
    	}
    	
    	System.out.println("fdg");
    }
}
