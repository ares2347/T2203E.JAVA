package hw_ss7;


import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import java.util.ArrayList;

public class Controller {
    public TextField txtName;
    public TextField txtPhone;
    public Text error;
    public Text result;

    private ArrayList<Contact> contactList = new ArrayList<>();

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
        String txt = "";
        for (Contact c:contactList) {
            txt += c.toString();
        }
        result.setText(txt);
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
