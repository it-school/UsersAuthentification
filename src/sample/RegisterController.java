package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.stage.Stage;
import sample.Classes.User;

public class RegisterController {
    @FXML
    TextField login;
    @FXML
    PasswordField password;

    @FXML
    Button loginBtn;

    @FXML
    Button cancelBtn;

    public void cancelClick(ActionEvent actionEvent) {
        ((Stage) cancelBtn.getScene().getWindow()).close();
    }

    public void registerClick(ActionEvent actionEvent) {
        String login = this.login.getText();
        String password = this.password.getText();

        Main.users.add(new User(login, password));

        loginBtn.setTooltip(new Tooltip("Tooltip for Register button"));

        Tooltip tt = new Tooltip("Tooltip for Cancel registration button");
        tt.setStyle("-fx-font: normal bold 10 Langdon; -fx-base: #AE3522; -fx-text-fill: orange;");
        cancelBtn.setTooltip(tt);
    }
}