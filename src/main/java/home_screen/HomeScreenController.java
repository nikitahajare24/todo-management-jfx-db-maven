
package home_screen;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import todo_management.ToDoManagementScreen;
import user_management.UserManagementScreen;

public class HomeScreenController
{
	@FXML
	private Button userManagement;
	
	@FXML
	private Button todoManagement;
	
	@FXML
	private Button back_Home;
	
	
	public void showUserManagementScreen(ActionEvent event) throws Exception
	{
		UserManagementScreen.showUserManagementScreen();	
	}
	
	public void showToDoManagementScreen(ActionEvent event) throws Exception
	{
		ToDoManagementScreen.showToDoManagementScreen();
	}
	
	public void backToHomeScreen(ActionEvent event) throws Exception
	{
		HomeScreen.showHomeScreen();
	}

}