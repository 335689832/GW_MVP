import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class AddStudentController extends openWindow{

    int counter = 0;

    @FXML
    private TextField tfFName;

    @FXML
    private TextField tfLName;

    @FXML
    private TextField tfStdCrs1;

    @FXML
    private TextField tfStdCrs2;

    @FXML
    private TextField tfStdCrs3;

    @FXML
    private TextField tfStdCrs4;

    @FXML
    private TextField tfStdNum;

    @FXML
    void btnAddStdClick(ActionEvent event) {

        try{
            int mark1 = Integer.parseInt(tfStdCrs1.getText());
            int mark2 = Integer.parseInt(tfStdCrs2.getText());
            int mark3 = Integer.parseInt(tfStdCrs3.getText());
            int mark4 = Integer.parseInt(tfStdCrs4.getText());

            App.allStudent.add(new Student());
            App.allStudent.get(counter).setFirstName(tfFName.getText());
            App.allStudent.get(counter).setLastName(tfLName.getText());
            App.allStudent.get(counter).setStudentNumber(tfStdNum.getText());
            App.allStudent.get(counter).setMark1(mark1);
            App.allStudent.get(counter).setMark2(mark2);
            App.allStudent.get(counter).setMark3(mark3);
            App.allStudent.get(counter).setMark4(mark4);

            App.allStudent.get(counter).setAverage(((mark1+mark2+mark3+mark4)/4));
            open("SuccessWindow.fxml", "Success");
            counter++;
        }
        catch(NumberFormatException n){
            n.printStackTrace();
            open("failureWindow.fxml", "Failure");
        }    
    }

}