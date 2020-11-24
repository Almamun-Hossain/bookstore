
package bookstore.model;


public class BookModel {
    private int id;
    private String bookName;
    private String bookAuthor;
    private String bookPrice;
    private String bookDescription;
    private String bookPicture;

    public BookModel(){}
    
    public BookModel(int id, String bookName, String bookAuthor, String bookPrice, String bookDescription, String bookPicture) {
        this.id = id;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookPrice = bookPrice;
        this.bookDescription = bookDescription;
        this.bookPicture = bookPicture;
    }

    public BookModel(String bookName, String bookAuthor, String bookPrice, String bookDescription, String bookPicture) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookPrice = bookPrice;
        this.bookDescription = bookDescription;
        this.bookPicture = bookPicture;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(String bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getBookDescription() {
        return bookDescription;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }

    public String getBookPicture() {
        return bookPicture;
    }

    public void setBookPicture(String bookPicture) {
        this.bookPicture = bookPicture;
    }

    @Override
    public String toString() {
        return "BookModel{" + "id=" + id + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor + ", bookPrice=" + bookPrice + ", bookDescription=" + bookDescription + ", bookPicture=" + bookPicture + '}';
    }
}
