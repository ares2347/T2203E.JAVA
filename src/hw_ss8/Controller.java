package hw_ss8;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.util.Comparator;

public class Controller {
    public TextField txtName;
    public TextField txtEmail;
    public TextField txtMark;
    public Text error;
    public ListView<Student> lv;

    public MenuItem sortNameBtn;
    public MenuItem sortMarkBtn;
    private boolean nameSortDsc=false;
    private boolean markSortDsc=false;
    private ObservableList<Student> studentsList = FXCollections.observableArrayList();

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

    public void sortByMark(){
         studentsList.sort(new Comparator<Student>() {
             @Override
             public int compare(Student o1, Student o2) {
                 return markSortDsc? o2.getMark()-o1.getMark():o1.getMark()-o2.getMark() ;
             }
         });
        sortMarkBtn.setText(markSortDsc? "By mark (Asc)":"By mark (Desc)");
         markSortDsc=!markSortDsc;
         printResult();
    }
    public void sortByName(){
            studentsList.sort(new Comparator<Student>() {
                @Override
                public int compare(Student o1, Student o2) {
                    return nameSortDsc? o2.getName().compareTo(o1.getName()) : o1.getName().compareTo(o2.getName()) ;
                }
            });
            sortNameBtn.setText(nameSortDsc? "By name (Asc)":"By name (Desc)");
            nameSortDsc=!nameSortDsc;
        printResult();
    }

}
