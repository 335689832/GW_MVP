import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class AddCourseController {

    @FXML
    private TextField tfCrsAdd;

    @FXML
    private TextField tfCrsCount;

    @FXML
    void btnCrsAddClick(ActionEvent event) {
        String name = tfCrsAdd.getText();
        try{
            int count = Integer.parseInt(tfCrsAdd.getText());
        }
        catch(NumberFormatException n){

        }
    }

}

