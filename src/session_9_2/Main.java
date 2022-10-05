package session_9_2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static Stage rootStage;
    @Override
    //stage: the whole window panel and frame(including the _,x bar)
    //scene: application content, defined in fxml
    public void start(Stage primaryStage) throws Exception{
        rootStage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("form/form.fxml"));
        primaryStage.setTitle("Session 9.2");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}