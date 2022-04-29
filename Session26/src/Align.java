import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Align extends Application {

    //Main
    private Scene scene;
    private HBox mainPane;

    //Grids
    private VBox firstPane;
    private GridPane secondGrid;
    private VBox thirdPane;

    //First Grid
    private CheckBox checkBox1;
    private CheckBox checkBox2;
    private Label label1;
    private Label label2;

    //Second Grid
    private Label label3;
    private Label label4;
    private TextField textField1;
    private TextField textField2;

    //Third Grid
    private Button button1;
    private Button button2;
    private Button button3;

    public void start(Stage window)
    {
        window.setTitle("Align");

        //First Pane
        checkBox1 = new CheckBox("Exit on OK");
        checkBox2 = new CheckBox("Exit on Cancel");

        firstPane = new VBox(5);
        firstPane.setAlignment(Pos.CENTER_LEFT);
        firstPane.getChildren().addAll(checkBox1, checkBox2);

        //Second Pane
        label3 = new Label("X:");
        label4 = new Label("Y:");
        textField1 = new TextField();
        textField2 = new TextField();

        secondGrid = new GridPane();
        secondGrid.setAlignment(Pos.CENTER_LEFT);

        secondGrid.setHgap(5);
        secondGrid.setVgap(5);
        secondGrid.addRow(0, label3, textField1);
        secondGrid.addRow(1, label4, textField2);

        //Third Pane
        button1 = new Button("OK");
        button2 = new Button("Cancel");
        button3 = new Button("Clear");

        button1.setPrefSize(100, 25);
        button2.setPrefSize(100, 25);
        button3.setPrefSize(100, 25);


        thirdPane = new VBox(5);
        thirdPane.setAlignment(Pos.CENTER_LEFT);
        thirdPane.getChildren().addAll(button1, button2, button3);

        mainPane = new HBox(5);
        mainPane.setAlignment(Pos.CENTER);
        mainPane.setPadding(new Insets(5));
        mainPane.getChildren().addAll(firstPane, secondGrid, thirdPane);

        scene = new Scene(mainPane, 410, 104);

        window.setScene(scene);
        window.show();
    }

}
