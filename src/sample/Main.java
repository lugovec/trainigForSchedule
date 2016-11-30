package sample;

import com.sun.javafx.collections.ObservableSetWrapper;
import javafx.application.Application;
import javafx.collections.ObservableSet;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.HashSet;
import java.util.Set;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("sample.fxml"));
        Parent fxmlMain = fxmlLoader.load();
        Controller controller = fxmlLoader.getController();
        controller.setMainStage(primaryStage);

        primaryStage.setScene(new Scene(fxmlMain, 700, 475));
        primaryStage.show();






    }


    public static void main(String[] args) {
        launch(args);
    }
}
