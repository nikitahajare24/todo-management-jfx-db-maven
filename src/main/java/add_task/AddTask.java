package add_task;

import java.net.URL;

import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class AddTask {
	
		public static void showAddTaskScreen() throws Exception
		{
			Parent actorGroup = FXMLLoader.load(new URL("file:///C|/Users//NIKITA HAJARE//nikita-eclipse-workspace//ToDoManagementJavaFxDB//src//add_task//add_task.fxml"));
			StageFactory.stage.setTitle("Add Task Details");
			StageFactory.stage.setFullScreen(true);
			
			Scene s = new Scene(actorGroup);
			StageFactory.stage.setScene(s);
			StageFactory.stage.show();
		}

	}

