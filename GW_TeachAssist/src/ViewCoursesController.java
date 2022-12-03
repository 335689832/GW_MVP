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
        
        open("courseView.fxml","Course");
    }

}
