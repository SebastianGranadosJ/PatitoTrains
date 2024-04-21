package upb.ticketmanagement;

import java.io.IOException;

import javafx.application.Application;
import javafx.stage.Stage;
import upb.ticketmanagement.view.loginView.LoginView;

public class Main extends Application{
    LoginView app = new LoginView();
    public static void main(String[] args) throws IOException {
        
        Application.launch(args);

    }

    @Override
    public void start(@SuppressWarnings("exports") Stage arg0) throws Exception {
       app.start(arg0);
    }
    
}
