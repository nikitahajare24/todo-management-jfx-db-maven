package edit_task;

import java.net.URL;

import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class EditTaskScreen {
	
		public static void showEditTaskScreen() throws Exception
		{
			Parent actorGroup = FXMLLoader.load(new URL("file:///C|/Users//NIKITA HAJARE//nikita-eclipse-workspace//ToDoManagementJavaFxDB//src//edit_task//edit_task.fxml"));
			StageFactory.stage.setTitle("Edit Task");
			
			StageFactory.stage.setFullScreen(true);
			Scene s = new Scene(actorGroup);
			StageFactory.stage.setScene(s);
			StageFactory.stage.show();
			
		}

	}

