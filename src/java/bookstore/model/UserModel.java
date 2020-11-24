
package bookstore.model;


public class UserModel {
    private int id;
    private String userName;
    private String useEmail;
    private String userPassword;
    private String userPicture;

    public UserModel(){}
    
    public UserModel(int id, String userName, String useEmail, String userPassword, String userPicture) {
        this.id = id;
        this.userName = userName;
        this.useEmail = useEmail;
        this.userPassword = userPassword;
        this.userPicture = userPicture;
    }

    public UserModel(String userName, String useEmail, String userPassword) {
        this.userName = userName;
        this.useEmail = useEmail;
        this.userPassword = userPassword;
    }

    public UserModel(String useEmail, String userPassword) {
        this.useEmail = useEmail;
        this.userPassword = userPassword;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUseEmail() {
        return useEmail;
    }

    public void setUseEmail(String useEmail) {
        this.useEmail = useEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserPicture() {
        return userPicture;
    }

    public void setUserPicture(String userPicture) {
        this.userPicture = userPicture;
    }

    @Override
    public String toString() {
        return "UserModel{" + "id=" + id + ", userName=" + userName + ", useEmail=" + useEmail + ", userPassword=" + userPassword + ", userPicture=" + userPicture + '}';
    }
    
}
