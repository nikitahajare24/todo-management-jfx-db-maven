package todo_management;

import add_task.AddTask;
import edit_task.EditTaskScreen;
import home_screen.HomeScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import search_task.SearchTaskScreen;

public class ToDoManagementScreenController {
	
		@FXML
		private Button addTask;
		
		@FXML
		private Button searchTask;
		
		@FXML
		private Button editTask;
		
		@FXML
		private Button deleteTask;
		
		@FXML
		private Button quit;
		
		public void addTaskDetails(ActionEvent event) throws Exception
		{
			AddTask.showAddTaskScreen();
		}
		
		public void searchTaskDetails(ActionEvent event) throws Exception
		{
			SearchTaskScreen.showSearchTaskScreen();
			
		}
		public void editTaskDetails(ActionEvent event) throws Exception
		{
			EditTaskScreen.showEditTaskScreen();
			
		}
		public void quit(ActionEvent event) throws Exception
		{
			HomeScreen.showHomeScreen();
		}
		
		

	}

