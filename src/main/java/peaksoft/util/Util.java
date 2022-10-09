package peaksoft.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    private static final String url = "jdbc:postgresql://localhost:5432/postgres";
    private static final String name = "postgres";
    private static final String password = "716202";

    public static Connection connection(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url,name,password);
        }catch (SQLException e){
            throw new ExceptionInInitializerError();
        }
        return connection;
    }
}
