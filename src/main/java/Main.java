import gui.MainScreen;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static final int WIDTH = 450;
    public static final int HEIGHT = 400;

    @Override
    public void start(Stage primaryStage) {

        var scene = new Scene(new Group(), WIDTH, HEIGHT);
        primaryStage.setScene(scene);

        var mainScreen = new MainScreen();
        mainScreen.create();
        ((Group) scene.getRoot()).getChildren().add(mainScreen.getGrid());

        primaryStage.show();
    }
}
