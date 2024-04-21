package upb.administrator;

import java.io.IOException;

import javafx.application.Application;
import javafx.stage.Stage;
import upb.administrator.view.boardingPanelView.BoardingPanelView;
import upb.administrator.view.loginView.LoginView;


public class Main extends Application{
    BoardingPanelView boradingApp = new BoardingPanelView();
    LoginView loginApp = new LoginView();
    public static void main(String[] args) throws IOException {
        
        Application.launch(args);

    }

    @Override
    public void start(@SuppressWarnings("exports") Stage arg0) throws Exception {
        Stage stage = new Stage();
        boradingApp.start(stage);
        loginApp.start(arg0);
       
    }
    
}
