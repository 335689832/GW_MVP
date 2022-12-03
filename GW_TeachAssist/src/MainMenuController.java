import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MainMenuController extends openWindow{

    @FXML
    void btnModClick(ActionEvent event) {
        open("modifyWindow.fxml","Modify");
    }

    @FXML
    void btnViewClick(ActionEvent event) {
        open("viewWindow.fxml","View");
    }

}

