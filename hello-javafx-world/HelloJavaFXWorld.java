import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;

public class HelloJavaFXWorld extends Application {

    @Override
    public void start(Stage stage) {
        Label label = new Label("Hello JavaFX World");
        Scene scene = new Scene(new StackPane(label), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}