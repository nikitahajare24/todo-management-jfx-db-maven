package todo_management;

import java.net.URL;

import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class ToDoManagementScreen {
	
		public static void showToDoManagementScreen() throws Exception
		{
			Parent actorgroup = FXMLLoader.load(new URL("file:///C|/Users//NIKITA HAJARE//nikita-eclipse-workspace//ToDoManagementJavaFxDB//src//todo_management//todo_management.fxml"));
			StageFactory.stage.setTitle("ToDo Management");
			StageFactory.stage.setFullScreen(true);
			
			Scene s = new Scene(actorgroup);
			StageFactory.stage.setScene(s);
			StageFactory.stage.show();
			
					
		}

	}



