import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ViewStudentController extends openWindow{

    @FXML
    private TextArea taStdVW;

    @FXML
    private TextField tfStdVW;

    @FXML
    void btnStdVWClick(ActionEvent event) {
        String temp = "";
        try{
            //fill text area with all student names, data, and associated indexes if text field is not empty
            for(int i = 0; i < App.allStudent.size(); i++){
                temp += i + " " + App.allStudent.get(i).getFirstName() + " " + App.allStudent.get(i).getLastName() + " " + App.allStudent.get(i).getStudentNumber() + "\n";
            }
            
            if(tfStdVW.getText().equals("")){
                taStdVW.setText(temp);
            }
            //if text field contains a valid index, fill text area with that indexes information
            else{
                String firstName = App.allStudent.get(Integer.parseInt(tfStdVW.getText())).getFirstName();
                String lastName = App.allStudent.get(Integer.parseInt(tfStdVW.getText())).getLastName();
                String course1 = "Course 1: " + Integer.toString(App.allStudent.get(Integer.parseInt(tfStdVW.getText())).getMark1());
                String course2 = "Course 2: " +Integer.toString(App.allStudent.get(Integer.parseInt(tfStdVW.getText())).getMark2());
                String course3 = "Course 3: " +Integer.toString(App.allStudent.get(Integer.parseInt(tfStdVW.getText())).getMark3());
                String course4 = "Course 4: " +Integer.toString(App.allStudent.get(Integer.parseInt(tfStdVW.getText())).getMark4());
                taStdVW.setText(firstName + " " + lastName + "\n" + course1 + "\n" + course2 + "\n" + course3 + "\n" + course4);
            }
        }
        catch(IndexOutOfBoundsException e){
            open("failureWindow.fxml", "Failure");
        }
    }

}
