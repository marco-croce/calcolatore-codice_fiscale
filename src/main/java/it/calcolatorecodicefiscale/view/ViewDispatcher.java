package it.calcolatorecodicefiscale.view;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ViewDispatcher {

	private static final String FXML_SUFFIX = ".fxml";
	private static final String RESOURCE_BASE = "/viste/";
	private static ViewDispatcher instance = new ViewDispatcher();

	private Stage stage;

	private ViewDispatcher() {
	}

	public static ViewDispatcher getInstance() {
		return instance;
	}

	public void formView(Stage stage) throws ViewException {
		this.stage = stage;
		Parent loginView = loadView("form").getView();
		Scene scene = new Scene(loginView);
		stage.setScene(scene);
		stage.show();
	}

	private View loadView(String viewName) throws ViewException {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource(RESOURCE_BASE + viewName + FXML_SUFFIX));
			Parent parent = (Parent) loader.load();
			return new View(parent);
		} catch (IOException e) {
			throw new ViewException(e);
		}
	}

}
