package search_task;

import java.sql.ResultSet;
import java.sql.SQLException;

import db_operations.DBUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import todo_management.ToDoManagementScreen;

public class SearchTaskScreenController {
	
		@FXML
		private TextField taskNameToSearch;
		
		@FXML
		private TextField taskID;
		
		@FXML
		private TextField taskName;
		
		@FXML
		private TextField taskMark;
		
		@FXML
		private Label userMessage;
		
		
		public void search(ActionEvent event)
		{
			boolean status = searchTask(taskNameToSearch.getText());
			if(status)
			{
				searchTask(null);
				userMessage.setText("Task searched Successfully!!");	
			}
			else {
				userMessage.setText("Task not found!!");	
			}
		}
		
		public boolean searchTask(String taskNameToSearch)
		{
			String query = "select * from Task where taskName='"+taskNameToSearch+"' ";
			ResultSet rs = DBUtils.executeQueryGetResult(query);
			
			try {
				if(rs.next())
				{
					taskID.setText(rs.getString("taskID"));
					taskName.setText(rs.getString("taskName"));
					taskMark.setText(rs.getString("taskMark"));
					
					return true;			
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return false;
		}
		
		public void delete(ActionEvent event)
		{
			String query = "delete FROM Task WHERE taskName='"+taskNameToSearch.getText()+"' ";
			System.out.println(query);
			DBUtils.executeQuery(query);
			
		}
		
		public void back(ActionEvent event) throws Exception
		{
			ToDoManagementScreen.showToDoManagementScreen();
		}

	}

