import javafx.event.ActionEvent;
import javafx.fxml.FXML;


public class ViewController extends openWindow{

    @FXML
    void btnCrsVwClick(ActionEvent event) {
        open("viewCoursesSelect.fxml","Select Courses");
    }

    @FXML
    void btnStdVwClick(ActionEvent event) {
        open("viewStudentSelect.fxml","Select Student");
    }

}
