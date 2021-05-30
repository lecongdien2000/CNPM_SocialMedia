package mapper;


import Model.User;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet resultSet) {
        User userModel = new User();
        try {
            userModel.setId(resultSet.getInt("id"));
            userModel.setFullName(resultSet.getString("full_name"));
            userModel.setUsername(resultSet.getString("username"));
            userModel.setPassword(resultSet.getString("password"));
            return  userModel;

        } catch (SQLException e) {
            return null;
        }

    }
}
