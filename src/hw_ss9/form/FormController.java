package hw_ss9.form;

import hw_ss9.Subject;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import session_9_2.Main;

import static hw_ss9.Main.rootStage;
import static hw_ss9.list.ListController.subjectObservableList;

public class FormController {
    public TextField txtCode;
    public TextField txtSubject;
    public Text error;

    public void addSubject(Subject s){
        if(subjectObservableList.stream().filter(z ->
                z.getCode().equals(s.getCode())
        ).findAny().isPresent()){
            error.setVisible(true);
        }else{
            subjectObservableList.add(s);
        }
    }
    public void handleSubmit(ActionEvent actionEvent) throws Exception {
        addSubject(new Subject(txtSubject.getText(), txtCode.getText()));
        Parent p = FXMLLoader.load(getClass().getResource("../list/list.fxml"));
        rootStage.setScene(new Scene(p, 600, 400));
    }

    public void navigateToList(ActionEvent actionEvent) throws Exception{
        Parent p = FXMLLoader.load(getClass().getResource("../list/list.fxml"));
        rootStage.setScene(new Scene(p, 600, 400));
    }
}
