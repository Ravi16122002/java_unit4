import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

public class Main extends Application 
{ 
  Stage window;
  Scene scene1, scene2, scene3, scene4, scene5;
  @Override
  public void start(Stage primaryStage) throws Exception {
    window = primaryStage;

    Label label1 = new Label("Welcome, this is the first webpage");
    Button button1 = new Button("Go to scene 2");
    button1.setOnAction(e -> window.setScene(scene2));

    VBox layout1 = new VBox(20);
    layout1.getChildren().addAll(label1, button1);
    scene1 = new Scene(layout1, 200, 200);

    //button2
    Label label2 = new Label("now you are in the second webpage, keep going byee....");
    Button button2 = new Button("Go to scene 3");
      button2.setOnAction(e -> window.setScene(scene3));
    VBox layout2 = new VBox(20);
    layout2.getChildren().addAll(label2, button2);
    scene2 = new Scene(layout2, 200, 200);

    Label label3 = new Label("hey, wow! you are in the third webpage");
    Button button3 = new Button("Go to scene 4");
     button3.setOnAction(e -> window.setScene(scene4));
    VBox layout3 = new VBox(20);
    layout3.getChildren().addAll(label3, button3);
    scene3 = new Scene(layout3, 200, 200);

    Label label4 = new Label("okkkk.. you have come allover to the fourth webpage");
    Button button4 = new Button("Go to scene 5");
    button4.setOnAction(e -> window.setScene(scene5));
    VBox layout4 = new VBox(20);
    layout4.getChildren().addAll(label4, button4);
    scene4 = new Scene(layout4, 200, 200);

    Label label5 = new Label("fine go back to the first webpage");
    Button button5 = new Button("Go to back scene 1");
    button5.setOnAction(e -> window.setScene(scene1));
    VBox layout5 = new VBox(20);
    layout5.getChildren().addAll(label5, button5);
    scene5 = new Scene(layout5, 200, 200);

    

    window.setScene(scene1);
    window.setTitle("sample pages");
    window.show();
  } 
    
  public static void main(String[] args) {
    launch(args);
  }
} 
