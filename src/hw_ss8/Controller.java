package hw_ss8;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.util.Comparator;

public class Controller {
    public TextField txtName;
    public TextField txtEmail;
    public TextField txtMark;
    public Text error;
    public ListView<Student> lv;

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
        if(!markSortDsc){
         studentsList.sort(new Comparator<Student>() {
             @Override
             public int compare(Student o1, Student o2) {
                 return o1.getMark()-o2.getMark();
             }
         });
         markSortDsc=true;
        }else{
            studentsList.sort(new Comparator<Student>() {
                @Override
                public int compare(Student o1, Student o2) {
                    return o2.getMark()-o1.getMark();
                }
            });
            markSortDsc=false;
        }
        printResult();
    }
    public void sortByName(){
        if(!nameSortDsc){
            studentsList.sort(new Comparator<Student>() {
                @Override
                public int compare(Student o1, Student o2) {
                    return o1.getName().compareTo(o2.getName());
                }
            });
            nameSortDsc=true;
        }else{
            studentsList.sort(new Comparator<Student>() {
                @Override
                public int compare(Student o1, Student o2) {
                    return o2.getName().compareTo(o1.getName());
                }
            });
            nameSortDsc=false;
        }
        printResult();
    }

}
