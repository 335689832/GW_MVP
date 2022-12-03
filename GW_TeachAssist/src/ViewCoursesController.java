import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class ViewCoursesController extends openWindow{

    @FXML
    private TextArea taCrsVW;

    @FXML
    private TextField tfCrsView;

    @FXML
    void btnCrsVWClick(ActionEvent event) {
        //Fill text area with course names and index number if text field is empty
        //If text field is not empty, fill text area with info of the course of specified index
    }

}
