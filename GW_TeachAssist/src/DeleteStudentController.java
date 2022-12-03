import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class DeleteStudentController extends openWindow{

    @FXML
    private TextArea taStdDel;

    @FXML
    private TextField tfStdDel;

    @FXML
    void btnStdDelClick(ActionEvent event) {
        String temp = "";
        for(int i = 0; i < App.allStudent.size(); i++){
            temp += i + " " + App.allStudent.get(i).getFirstName() + " " + App.allStudent.get(i).getLastName() + " " + App.allStudent.get(i).getStudentNumber() + "\n";
        }
        
        if(tfStdDel.getText().equals("")){
            taStdDel.setText(temp);
        }
        else{
            try{
                App.allStudent.remove(Integer.parseInt(tfStdDel.getText()));
                open("SuccessWindow.fxml", "Success");
            }
            catch(IndexOutOfBoundsException e){
                open("failureWindow.fxml", "Failure");
            }
        }
    }

}
