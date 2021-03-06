package Capitulo25.Cap25_6;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("AppLoanStudent.fxml"));

        primaryStage.setTitle("App Loan Student");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
