package peaksoft;

import peaksoft.dao.UserDaoJdbcImpl;
import peaksoft.model.User;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        // реализуйте алгоритм здесь
        UserDaoJdbcImpl userDaoJdbc = new UserDaoJdbcImpl();
//        userDaoJdbc.createUsersTable();

//        userDaoJdbc.saveUser("Zarip","Kursanov", (byte) 21);
//        userDaoJdbc.saveUser("Timur","Kadyrbekov", (byte) 21);
//        userDaoJdbc.saveUser("Zukh","Kamchybekov", (byte) 21);

//        userDaoJdbc.cleanUsersTable();


//
//        for (User user : userDaoJdbc.getAllUsers()){
//            System.out.printf("%s, %s, %s\n", user.getName(), user.getLastName(), user.getAge());
//        }
//
//        userDaoJdbc.dropUsersTable();
    }
}
