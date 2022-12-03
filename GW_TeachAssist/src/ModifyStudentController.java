import javafx.event.ActionEvent;
import javafx.fxml.FXML;


public class ModifyStudentController extends openWindow{

    //open associated windows when clicked
    @FXML
    void btnAddStdClick(ActionEvent event) {
        open("addStudent.fxml","Add Student");
    }

    @FXML
    void btnAddStdListClick(ActionEvent event) {
        open("addStudentList.fxml","Add Student List");
    }

    @FXML
    void btnDelStdClick(ActionEvent event) {
        open("deleteStudent.fxml","Delete Student");
    }

    @FXML
    void btnDelStdListClick(ActionEvent event) {
        //fully clear the student list
        for(int i = 0; i < App.allStudent.size(); i++){
            App.allStudent.remove(i);
        }
        open("SuccessWindow.fxml", "Success");
    }

}