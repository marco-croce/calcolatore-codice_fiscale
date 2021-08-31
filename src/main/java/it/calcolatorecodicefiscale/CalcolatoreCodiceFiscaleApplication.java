package it.calcolatorecodicefiscale;

import it.calcolatorecodicefiscale.view.ViewDispatcher;
import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class CalcolatoreCodiceFiscaleApplication extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		stage.getIcons().add(new Image(getClass().getResourceAsStream("/immagini/logo.png")));
		ViewDispatcher dispatcher = ViewDispatcher.getInstance();
		dispatcher.formView(stage);
	}

}
