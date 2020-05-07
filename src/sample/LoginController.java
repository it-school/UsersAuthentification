package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController
{
	@FXML
	TextField login;
	@FXML
	PasswordField password;

	public void loginClick(ActionEvent actionEvent)
	{
		String login = this.login.getText();
		String password = this.password.getText();

		if (Main.users.isRegistered(login, password)) { System.out.println("Registered"); }
		else {System.out.println("Not registered"); }
	}

	public void registerClick(ActionEvent actionEvent) throws IOException
	{
		Parent root = FXMLLoader.load(getClass().getResource("registerForm.fxml"));
		Stage stage = new Stage();
		stage.setTitle("User registration form");
		stage.setScene(new Scene(root, 300, 275));
		stage.show();
	}
}
