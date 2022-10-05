package session_9_2.form;

import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import session_9_2.Main;

import java.util.ArrayList;

public class FormController {
    public void changeScene (javafx.event.ActionEvent actionEvent ) throws Exception {
        Parent p = FXMLLoader.load(getClass().getResource("../list/list.fxml"));
        Main.rootStage.setScene(new Scene(p, 600, 400));
        Stage stage = new Stage();
        stage.show();
        stage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent event) {
                event.consume();
                stage.show();
            }
        });
    }
}
