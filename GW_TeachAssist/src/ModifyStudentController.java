import javafx.event.ActionEvent;
import javafx.fxml.FXML;


public class ModifyStudentController extends openWindow{
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

    }

}