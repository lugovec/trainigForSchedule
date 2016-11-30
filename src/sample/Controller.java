package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class Controller {

    private Stage mainStage;

    @FXML
    private TableView tbl;

    @FXML
    private TableColumn<Class, String> clmn;


    public void setMainStage(Stage mainStage){
        this.mainStage = mainStage;
    }



    @FXML
    private void initialize() {

        Class aclass = new Class();
        aclass.print();
    }


}
