package utility;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
public class ConnectionManager {
public static void main(String args[]) throws ClassNotFoundException, SQLException{
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con=null;
    con=DriverManager.getConnection("jdbc:mysql://localhost/dbname","root","examly");
    if(con!=null)
    {
        System.out.println("Connection Established");
    }
    else
    {
        System.out.println("Connection not established");
    }
}
}
