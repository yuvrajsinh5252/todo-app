package Javafx.Controller;

import java.net.URL;
import java.util.ResourceBundle;
import Javafx.DButils;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class LoginController implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView Close;

    @FXML
    private Button LoginButton;

    @FXML
    private PasswordField LoginPassword;

    @FXML
    private TextField LoginUsername;

    @FXML
    private Button SignUpBtn;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        LoginButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                DButils.LoginUser(event, LoginUsername.getText(), LoginPassword.getText());
            }
        });

        SignUpBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                DButils.changeScene(event, "View/SignUp.fxml", "Sign Up", null);
            }
        });

        Close.setOnMouseClicked(event -> {
            System.exit(0);
        });
    }
}
