import java.io.IOException;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
 
public class App extends Application{
    //list of students
    public static ArrayList<Student> allStudent= new ArrayList<Student>();


    @Override
    public void start(Stage primaryStage) {  
        //Create first window
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("mainWindow.fxml"));

            Scene scene = new Scene(root);
            primaryStage.setTitle("Teach Assist");
            primaryStage.setScene(scene);
            primaryStage.show();
        } 
        catch (IOException e) {}
    }
 
    public static void main(String[] args) {
        launch(args);
    }
}