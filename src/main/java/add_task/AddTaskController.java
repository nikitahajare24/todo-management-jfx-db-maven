package add_task;

import db_operations.DBUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import todo_management.ToDoManagementScreen;

public class AddTaskController {
	
		@FXML
		private TextField taskID;
		
		@FXML
		private TextField taskName;
		
		@FXML
		private TextField taskMark;
		
		@FXML
		private Label userMessage;
		
		
		public void save(ActionEvent event)
		{
			userMessage.setText("Task added successfully!!");
			String query = "INSERT INTO Task(taskID, taskName, taskMark) VALUES  ('"+taskID.getText()+"', '"+taskName.getText()+"', '"+taskMark.getText()+"') " ;
			DBUtils.executeQuery(query); 
			
		}
		public void back(ActionEvent event) throws Exception
		{
			ToDoManagementScreen.showToDoManagementScreen();
		}
		

	}


