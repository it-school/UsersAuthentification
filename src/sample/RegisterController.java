package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import sample.Classes.User;

public class RegisterController {
    @FXML
    TextField login;
    @FXML
    PasswordField password;

    @FXML
    Button loginBtn;

    public void cancelClick(ActionEvent actionEvent) {
    }

    public void registerClick(ActionEvent actionEvent) {
        String login = this.login.getText();
        String password = this.password.getText();

        Main.users.add(new User(login, password));

        loginBtn.setTooltip(new Tooltip("Tooltip for Button"));
    }
}