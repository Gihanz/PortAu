
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import net.proteanit.sql.DbUtils;
import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.*;
import java.awt.print.*;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {

            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginJframe().setVisible(true);
            }
        });


        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginJframe.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(LoginJframe.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(LoginJframe.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(LoginJframe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
