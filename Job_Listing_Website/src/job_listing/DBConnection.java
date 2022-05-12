package job_listing;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public  Connection dbConnection(){
        Connection connection = null;
        //loading the sql driver
        try {
            Class.forName("com.mysql.jdbc.Driver");
        }catch (ClassNotFoundException cnfe){
            System.out.println(cnfe.getMessage());
        }

        //establish a connection
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/job_listing", "root", "");
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }

        //test connection
        if (connection != null){
            System.out.println("Connection successful");
        }else{
            System.out.println("Could not connect to the database");
        }

        return connection;
    }
}
