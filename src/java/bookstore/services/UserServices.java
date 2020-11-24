
package bookstore.services;

import bookstore.model.UserModel;

public interface UserServices {
    public boolean registerUser(UserModel userModel);
    public boolean logUser(UserModel userModel);
}
