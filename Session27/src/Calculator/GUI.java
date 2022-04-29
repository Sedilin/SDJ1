package Calculator;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GUI extends Application {
    private Calculator calculator;
    private Scene scene;
    private BorderPane mainPane;

    private MyListener listener;
    //
    private GridPane numberGrid;
    private TextField textField;
    //TOP
    private Button button7;
    private Button button8;
    private Button button9;
    private Button buttonDivision;
    //MIDDLE
    private Button button6;
    private Button button5;
    private Button button4;
    private Button buttonMultiply;
    //BOTTOM
    private Button button3;
    private Button button2;
    private Button button1;
    private Button buttonMinus;
    //THE LOWEST
    private Button button0;
    private Button buttonComma;
    private Button buttonEquals;
    private Button buttonPlus;

    public void start(Stage window)
    {
        calculator = new Calculator();
        window.setTitle("Calculator");

        listener = new MyListener();

        textField = new TextField();

        numberGrid = new GridPane();
        numberGrid.setAlignment(Pos.CENTER);

        button0 = new Button("0");
        button1 = new Button("1");
        button2 = new Button("2");
        button3 = new Button("3");
        button4 = new Button("4");
        button5 = new Button("5");
        button6 = new Button("6");
        button7 = new Button("7");
        button8 = new Button("8");
        button9 = new Button("9");
        buttonPlus = new Button("+");
        buttonMinus = new Button("-");
        buttonMultiply = new Button("*");
        buttonDivision = new Button("/");
        buttonEquals = new Button("=");
        buttonComma = new Button(",");

        numberGrid.addRow(0, button7, button8, button9, buttonDivision);
        numberGrid.addRow(1, button4, button5, button6, buttonMultiply);
        numberGrid.addRow(2, button1, button2, button3, buttonMinus);
        numberGrid.addRow(3, button0, buttonComma, buttonEquals, buttonPlus);

        for (int i = 0; i < numberGrid.getChildren().size(); i++) {
            ((Button)numberGrid.getChildren().get(i)).setPrefSize(60, 50);
            ((Button)numberGrid.getChildren().get(i)).setOnAction(listener);

        }

        mainPane = new BorderPane();
        mainPane.setTop(textField);
        mainPane.setCenter(numberGrid);

        scene = new Scene(mainPane);

        window.setScene(scene);
        window.setResizable(false);
        window.show();
    }
    private class MyListener implements EventHandler<ActionEvent>
    {
        public void handle(ActionEvent e)
        {

            if (e.getSource() == button0)
            {
                if (calculator.getAction())
                {
                    textField.clear();
                    calculator.setActionFalse();
                    textField.appendText("0");
                }
                else
                {
                    textField.appendText("0");
                }
            }
            else if (e.getSource() == button1)
            {
                if (calculator.getAction())
                {
                    textField.clear();
                    calculator.setActionFalse();
                    textField.appendText("1");
                }
                else
                {
                    textField.appendText("1");
                }
            }
            else if (e.getSource() == button2)
            {
                if (calculator.getAction())
                {
                    textField.clear();
                    calculator.setActionFalse();
                    textField.appendText("2");
                }
                else
                {
                    textField.appendText("2");
                }
            }
            else if (e.getSource() == button3)
            {
                if (calculator.getAction())
                {
                    textField.clear();
                    calculator.setActionFalse();
                    textField.appendText("3");
                }
                else
                {
                    textField.appendText("3");
                }
            }
            else if (e.getSource() == button4)
            {
                if (calculator.getAction())
                {
                    textField.clear();
                    calculator.setActionFalse();
                    textField.appendText("4");
                }
                else
                {
                    textField.appendText("4");
                }
            }
            else if (e.getSource() == button5)
            {
                if (calculator.getAction())
                {
                    textField.clear();
                    calculator.setActionFalse();
                    textField.appendText("5");
                }
                else
                {
                    textField.appendText("5");
                }
            }
            else if (e.getSource() == button6)
            {
                if (calculator.getAction())
                {
                    textField.clear();
                    calculator.setActionFalse();
                    textField.appendText("6");
                }
                else
                {
                    textField.appendText("6");
                }
            }
            else if (e.getSource() == button7)
            {
                if (calculator.getAction())
                {
                    textField.clear();
                    calculator.setActionFalse();
                    textField.appendText("7");
                }
                else
                {
                    textField.appendText("7");
                }
            }
            else if (e.getSource() == button8)
            {
                if (calculator.getAction())
                {
                    textField.clear();
                    calculator.setActionFalse();
                    textField.appendText("8");
                }
                else
                {
                    textField.appendText("8");
                }
            }
            else if (e.getSource() == button9)
            {
                if (calculator.getAction())
                {
                    textField.clear();
                    calculator.setActionFalse();
                    textField.appendText("9");
                }
                else
                {
                    textField.appendText("9");
                }
            }
            else if (e.getSource() == buttonComma)
            {
                textField.appendText(".");
            }

            else if(e.getSource() == buttonPlus)
            {
                calculator.setActionTrue();

                if (calculator.getPrevNumber() == 0)
                {
                    double prevNr = Double.parseDouble(textField.getText());
                    calculator.setPrevNumber(prevNr);
                    textField.clear();
                }
                else {
                    double currentNr = Double.parseDouble(textField.getText());
                    calculator.setCurrentNumber(currentNr);
                    textField.clear();
                    calculator.getResult();
                    calculator.setPrevNumber(calculator.getResult());
                    textField.clear();
                    textField.appendText(String.valueOf(calculator.getPrevNumber()));
                }
                calculator.setOperator('+');
            }
            else if(e.getSource() == buttonMinus)
            {
                calculator.setActionTrue();

                if (calculator.getPrevNumber() == 0)
                {
                    double prevNr = Double.parseDouble(textField.getText());
                    calculator.setPrevNumber(prevNr);
                    textField.clear();
                }
                else {
                    double currentNr = Double.parseDouble(textField.getText());
                    calculator.setCurrentNumber(currentNr);
                    textField.clear();
                    calculator.getResult();
                    calculator.setPrevNumber(calculator.getResult());
                    textField.clear();
                    textField.appendText(String.valueOf(calculator.getPrevNumber()));
                }
                calculator.setOperator('-');
            }
            else if(e.getSource() == buttonDivision)
            {
                calculator.setActionTrue();

                if (calculator.getPrevNumber() == 0)
                {
                    double prevNr = Double.parseDouble(textField.getText());
                    calculator.setPrevNumber(prevNr);
                    textField.clear();
                }
                else {
                    double currentNr = Double.parseDouble(textField.getText());
                    calculator.setCurrentNumber(currentNr);
                    textField.clear();
                    calculator.getResult();
                    calculator.setPrevNumber(calculator.getResult());
                    textField.clear();
                    textField.appendText(String.valueOf(calculator.getPrevNumber()));
                }
                calculator.setOperator('/');
            }
            else if(e.getSource() == buttonMultiply)
            {
                calculator.setActionTrue();

                if (calculator.getPrevNumber() == 0)
                {
                    double prevNr = Double.parseDouble(textField.getText());
                    calculator.setPrevNumber(prevNr);
                    textField.clear();
                }
                else {
                    double currentNr = Double.parseDouble(textField.getText());
                    calculator.setCurrentNumber(currentNr);
                    textField.clear();
                    calculator.getResult();
                    calculator.setPrevNumber(calculator.getResult());
                    textField.clear();
                    textField.appendText(String.valueOf(calculator.getPrevNumber()));
                }
                calculator.setOperator('*');
            }
            else if(e.getSource() == buttonEquals)
            {
                calculator.setActionTrue();
                if (calculator.getPrevNumber() != 0)
                {

                        double currentNr = Double.parseDouble(textField.getText());
                        calculator.setCurrentNumber(currentNr);
                        calculator.getResult();
                        textField.clear();
                        textField.appendText(String.valueOf(calculator.getResult()));
                }
            }
        }

    }
}
