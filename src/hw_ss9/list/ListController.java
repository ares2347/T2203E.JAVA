package hw_ss9.list;

import hw_ss9.Subject;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;

import java.net.URL;
import java.util.ResourceBundle;

import static hw_ss9.Main.rootStage;
import static javafx.scene.control.TableColumn.*;

public class ListController implements Initializable {
    public TableView<Subject> table;
    public TableColumn<Subject, String> code;
    public TableColumn<Subject, String> subject;
    public static ObservableList<Subject> subjectObservableList = FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        code.setCellValueFactory(new PropertyValueFactory<Subject,String>("code"));
        subject.setCellValueFactory(new PropertyValueFactory<Subject,String>("subject"));
        table.setEditable(true);
        code.setCellFactory(TextFieldTableCell.<Subject>forTableColumn());
        code.setOnEditCommit(
                (CellEditEvent<Subject, String> s) -> {
                    s.getTableView().getItems().get(
                            s.getTablePosition().getRow()
                    ).setCode(s.getNewValue());
                }
        );
        subject.setCellFactory(TextFieldTableCell.<Subject>forTableColumn());
        subject.setOnEditCommit(
                (CellEditEvent<Subject, String> s) -> {
                    s.getTableView().getItems().get(
                            s.getTablePosition().getRow()
                    ).setSubject(s.getNewValue());
                }
        );
        table.setItems(subjectObservableList);
    }

    public void navigateToForm(ActionEvent actionEvent) throws Exception{
        Parent p = FXMLLoader.load(getClass().getResource("../form/form.fxml"));
        rootStage.setScene(new Scene(p, 600, 400));
    }

}
