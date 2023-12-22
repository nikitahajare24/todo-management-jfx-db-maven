package edit_task;

import db_operations.DBUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import todo_management.ToDoManagementScreen;

public class EditTaskScreenController {
	
		@FXML
		private TextField taskNameToEdit;
		
		@FXML
		private TextField taskID;
		
		@FXML
		private TextField taskName;
		
		@FXML
		private TextField taskMark;
		
		@FXML
		private Label userMessage;
		
		
		public void done(ActionEvent event) throws Exception
		{
				String updateQuery = "update Task set "+ " taskID='"+taskID.getText()+"', taskName='"+taskName.getText()+"', taskMark='"+taskMark.getText()+"'";
				DBUtils.executeQuery(updateQuery);
				userMessage.setText("Edit product successfully!!");			
				
		}
		
		public void back(ActionEvent event) 
		{
			try {
				ToDoManagementScreen.showToDoManagementScreen();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

