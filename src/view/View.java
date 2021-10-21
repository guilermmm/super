package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class View extends Application {

  private static Stage primaryStage;
  private static Stage secondaryStage;

  @Override
  public void start(Stage st) throws Exception {
    primaryStage = st;
    home();
    primaryStage.show();
  }

  public static void login() throws Exception {
    Parent root = FXMLLoader.load(View.class.getResource("viewVE/LoginScreen.fxml"));
    Scene scene = new Scene(root);

    primaryStage.setTitle("super");
    primaryStage.setScene(scene);
  }

  public static void home() throws Exception {
    Parent root = FXMLLoader.load(View.class.getResource("viewVE/HomeScreen.fxml"));
    Scene scene = new Scene(root);

    primaryStage.setTitle("super");
    primaryStage.setScene(scene);
  }

  private static void createPopUp(Scene scene, String title) throws Exception {
    closePopUp();
    secondaryStage = new Stage();
    secondaryStage.setScene(scene);
    secondaryStage.setTitle(title);
    secondaryStage.centerOnScreen();
    secondaryStage.show();
  }

  public static void closePopUp() throws Exception {
    if (secondaryStage != null) {
      secondaryStage.close();
      secondaryStage = null;
    }
  }

  public static void deleteItem() throws Exception {
    Parent root = FXMLLoader.load(View.class.getResource("viewVE/DeletePopUpScreen.fxml"));
    Scene scene = new Scene(root);

    createPopUp(scene, "Deletar Item");
  }

}
