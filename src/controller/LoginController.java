package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {
  @FXML
  private TextField user;
  @FXML
  private PasswordField password;

  public void auth(ActionEvent e) {
    System.out.println(user.getText());
  }
}
