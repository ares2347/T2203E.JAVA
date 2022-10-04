package hw_ss8;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {
    public TextField txtName;
    public TextField txtEmail;
    public TextField txtMark;
    public Text error;
    public ListView<Student> lv;
    ObservableList<Student> studentsList = FXCollections.observableArrayList();

    public void handleSubmit(){
        try{
            error.setVisible(false);
            if (txtName.getText().isEmpty() || txtEmail.getText().isEmpty() || txtMark.getText().isEmpty()){
                throw new Exception("Please fill all the fields before submit!");
            }
            studentsList.add(new Student(txtName.getText(), txtEmail.getText(), txtMark.getText()));
            printResult();
        }catch(Exception e){
            //validation form error
            error.setText(e.getMessage());
            error.setVisible(true);
        }
    }
    public void printResult(){
        lv.setItems(studentsList); //auto call toString method;
        lv.refresh();
    }

}
