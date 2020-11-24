
package bookstore.dao;

import bookstore.model.BookModel;
import bookstore.services.BookServices;
import java.sql.*;

public class BookDao implements BookServices{
    
    Connection con;

    public BookDao(Connection con) {
        this.con = con;
}

    @Override
    public boolean addBook(BookModel bookModel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
