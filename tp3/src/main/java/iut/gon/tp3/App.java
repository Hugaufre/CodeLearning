package iut.gon.tp3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
    	GrilleModel grilleModel = new GrilleModel();
    	GrilleController grilleControl = new GrilleController(grilleModel);
    	FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("primary.fxml"));
    	fxmlLoader.setController(grilleControl);
        scene = new Scene(fxmlLoader.load(), 640, 480);
        stage.addEventHandler(KeyEvent.KEY_PRESSED, event->{
        	switch (event.getText()) {
        	case "1" : grilleModel.setCase(2, 0, "Fuck You!");
        	}
        });
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}