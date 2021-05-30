package Database.impl;



import Database.IUserDAO;
import Model.User;
import mapper.UserMapper;

import java.util.List;

public class UserDAO extends AbstractDAO<User> implements IUserDAO {
    @Override
    public User findOneByUserNameAndPassword(String username, String password) {
        String sql = "SELECT * FROM user WHERE username=? AND `password`=?";
        return query(sql, new UserMapper(), username, password).isEmpty() ? null : query(sql, new UserMapper(), username, password).get(0);
    }

    @Override
    public User findByUserName(String username) {
        String sql="Select * from user where username=?";
        return query(sql, new UserMapper(), username).isEmpty() ? null : query(sql, new UserMapper(), username).get(0);
    }

    @Override
    public User findByEmail(String email) {
        String sql="Select * from user where email=?";
        return query(sql, new UserMapper(), email).isEmpty() ? null : query(sql, new UserMapper(), email).get(0);
    }

    public List<User> findAll() {
        String sql = "Select * from user";
        return query(sql, new UserMapper());
    }

    @Override
    public User findById(int id) {
        String sql = "Select * from user where user_id=?";
        if (!query(sql, new UserMapper(), id).isEmpty()) {
            return query(sql, new UserMapper(), id).get(0);
        }
        return null;
    }
    @Override
    public void add(User userModel) {
        String sql = "INSERT INTO `user`(`full_name`,`username`, `date_create`, `role`) VALUES (?,?,?,?)";
        update(sql, userModel.getFullName(),  userModel.getUsername(), userModel.getPassword(),userModel.getDateCreated());
    }

    @Override
    public void edit(User userModel) {
        String sql = "UPDATE user SET full_name=? WHERE id=?";
        update(sql, new UserMapper(), userModel.getFullName(), userModel.getId());
    }

    @Override
    public void delete(User userModel) {
    String sql="";
    }

}
