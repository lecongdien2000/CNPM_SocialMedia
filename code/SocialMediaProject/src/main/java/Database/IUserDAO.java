package Database;


import Model.User;

public interface IUserDAO extends DAO<User> {
    User findOneByUserNameAndPassword(String username, String password);

    User findByUserName(String username);

    User findByEmail(String email);

    User findById(int id);
}
