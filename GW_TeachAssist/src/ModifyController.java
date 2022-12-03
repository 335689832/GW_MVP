import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class ModifyController extends openWindow{

    @FXML
    void btnModCrsClick(ActionEvent event) {
        open("modCourses.fxml","Modify Courses");
    }

    @FXML
    void btnModStdClick(ActionEvent event) {
        open("modStudentWindow.fxml", "Modify Students");
    }

}
