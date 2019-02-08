package org.team2053;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("mecanumjavafx.fxml"));
		
		primaryStage.setTitle("Mecanum Path Planner");
		Scene scene = new Scene(root, 1280, 720);
		//cscene.getStylesheets().add("/resources/org/team2053/mecanumstylesheet.css");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public void runMe(String[] args) {
		launch(args);
	}
}
