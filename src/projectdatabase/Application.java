package projectdatabase;

import br.com.project.JDBC.ConnectionFactory;
import br.com.project.view.FrmProviders;
import javax.swing.JOptionPane;

public class Application {

    public static void main(String[] args) {
        try{
     new ConnectionFactory().getConnection();
        JOptionPane.showMessageDialog(null, "Successfully connected!");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Not connected!");
        }
    }
    
}
