import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class JavaFXApp extends Application
{
	@Override
	public void start(Stage primaryStage)
	{
		FlowPane root = new FlowPane();
		Scene scene = new Scene(root, 300, 250);
		
		GuiHandler handler = new GuiHandler(root);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Eerste Applicatie");
		primaryStage.setFullScreen(true);
		primaryStage.show();
	}

	public static void main(String[] args)
	{
		launch(args);
	}
}