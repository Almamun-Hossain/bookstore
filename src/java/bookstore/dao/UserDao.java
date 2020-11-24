
package bookstore.dao;

import bookstore.model.UserModel;
import bookstore.services.UserServices;
import java.sql.*;

public class UserDao implements UserServices{
    Connection con;

    public UserDao(Connection con) {
        this.con = con;
    }

    @Override
    public boolean registerUser(UserModel userModel) {
        boolean test = false;
        
        return test;
    }

    @Override
    public boolean logUser(UserModel userModel) {
        boolean test = false;
        
        return test;
    }
    
    
}
