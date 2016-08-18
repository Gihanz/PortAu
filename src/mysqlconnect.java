
import java.sql.*;
import javax.swing.*;

public class mysqlconnect {

    Connection conn=null;
    public static Connection ConnecrDb(){

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/pinnawela","root","zS3bjsyFr6tYAM2Q");

            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }

    }
    
}
