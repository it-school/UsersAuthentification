package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import sample.Classes.User;
import sample.Classes.Users;

public class Main extends Application {
    public static Users users;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("loginForm.fxml"));
        primaryStage.setTitle("Try to login");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.getIcons().add(new Image("https://cdn.iconscout.com/icon/premium/png-256-thumb/login-3544041-2966577.png"));
        primaryStage.show();

        User user = new User("user", "password123");
        user.getPasswords().add("passw2");
        user.getPasswords().add("passw3");

        users = new Users();
        users.add(user);
        users.add(new User("user1", ""));
        System.out.println(users);
    }
}