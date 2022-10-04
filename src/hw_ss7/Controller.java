package hw_ss7;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import java.util.ArrayList;

public class Controller {
    public TextField txtName;
    public TextField txtPhone;
    public Text error;
    public Text result;
    public ListView<Contact> lv;


    ObservableList<Contact> contactList = FXCollections.observableArrayList();
//    JVFx version ArrayList
    public void handleSubmit(){
        try{
            error.setVisible(false);
            if (txtName.getText().isEmpty() || txtPhone.getText().isEmpty()){
                throw new Exception("Please fill all the fields before submit!");
            }
            updateContact();
            printResult();
        }catch(Exception e){
            //validation form error
            error.setText(e.getMessage());
            error.setVisible(true);
        }
    }

    public void printResult(){
       lv.setItems(contactList); //auto call toString method;
        lv.refresh();
    }

    public void updateContact (){
        for (Contact c: contactList) {
            if(c.getName().equals(txtName.getText())){
                if(!c.getPhone().equals(txtPhone.getText())){
                    c.setPhone(txtPhone.getText());
                    return;
                }
                return;
            }
        }
        contactList.add(new Contact(txtName.getText(), txtPhone.getText()));
    }
}
