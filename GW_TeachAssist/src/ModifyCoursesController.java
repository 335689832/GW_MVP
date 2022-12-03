import javafx.event.ActionEvent;
import javafx.fxml.FXML;


public class ModifyCoursesController extends openWindow{

    @FXML
    void btnCrsAddClick(ActionEvent event) {
        open("addCourse.fxml","Add Course");
    }

    @FXML
    void btnCrsDelClick(ActionEvent event) {
        open("deleteCourse.fxml", "Delete Course");
    }

}