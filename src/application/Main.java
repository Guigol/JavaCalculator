package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	public static void main(String[] args) {
		System.out.println("Je suis dans le main ");
		System.out.println(" ** Lancement de l'application **");
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println("Je suis dans le start ");
		System.out.println(" ** L'application est lancée **");
			Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
			primaryStage.setTitle("Calc");
			
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("main.css").toExternalForm());
			primaryStage.setResizable(false);
			primaryStage.setScene(scene);
			primaryStage.show();
				}
		
	}
	
	


