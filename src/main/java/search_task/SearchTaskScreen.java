package search_task;

import java.net.URL;

import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class SearchTaskScreen {
	
		public static void showSearchTaskScreen()throws Exception
		{
			Parent actorGroup = FXMLLoader.load(new URL("file:///C|/Users//NIKITA HAJARE//nikita-eclipse-workspace//ToDoManagementJavaFxDB//src//search_task//search_task.fxml"));
			StageFactory.stage.setTitle("Search Product Details");
			StageFactory.stage.setFullScreen(true);
			
			Scene s = new Scene(actorGroup);
			StageFactory.stage.setScene(s);
			StageFactory.stage.show();
			
			
		}

	}


