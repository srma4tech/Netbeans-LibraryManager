import java.sql.*;
import javax.swing.*;
public class javaConnect {
    Connection conn;
    
    public static Connection ConnectDb() {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\user\\Documents\\NetBeansProjects\\LibraryManager\\Library.sqlite");
            return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
}
