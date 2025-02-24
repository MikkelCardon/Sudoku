package gui.components;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class PrimaryWindow extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("TITEL");
        GridPane pane = new GridPane();
        initContent(pane);
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

//    private ObservableList<Hold> holdObservableList;
//    private ListView<Hold> holdListView;

    /* ------ */

    private void initContent(GridPane pane) {
        pane.setHgap(10);
        pane.setVgap(10);

//        holdObservableList = Storage.getHoldAsObservableList();
//        holdListView = new ListView<>(holdObservableList);

//        ChangeListener<Hold> listenerHold = (ov, oldHold, newHold) -> this.selectedHold(newHold);
//        holdListView.getSelectionModel().selectedItemProperty().addListener(listenerHold);


//    private void selectedHold(Hold newHold) {
//        selectedHold = newHold;
//        setDeltagere();
//    }

//    private void setDeltagere(){
//        deltagerListView.getItems().setAll(selectedHold.getDeltagere());
//    }

//    private void selectedDeltager(Deltager newDeltager) {
//        selectedDeltager = newDeltager;
//        turListView.getItems().setAll(selectedDeltager.getTure());
//
//        deltagerLbl.setText("Valgte deltager" + selectedDeltager.getNavn());
//        kmIAlt.setText("Km i alt: " + selectedDeltager.kmIAlt());
//        minIAlt.setText("Min i alt: " + selectedDeltager.minIAlt());
//    }

    }
}

