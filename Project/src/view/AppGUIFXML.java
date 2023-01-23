package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * A user interface that allows for displaying and modifying information about members/games/events/reservations/borrowings.
 * @author Mihai Mihaila && Cristian Josan
 * @version 1.0
 */
public class AppGUIFXML extends Application
{
  /**
   * @param window the primary stage for this application, onto which
   * the application scene can be set.
   * Applications may create other stages, if needed, but they will not be
   * primary stages.
   * @throws IOException
   */
  public void start(Stage window) throws IOException
  {
    window.setTitle("VIA Board Games");
    FXMLLoader loader = new FXMLLoader();
    loader.setLocation(getClass().getResource("AppGUI.fxml"));
    Scene scene = new Scene(loader.load());
    window.setScene(scene);
    window.setResizable(false);
    window.show();
  }
}
