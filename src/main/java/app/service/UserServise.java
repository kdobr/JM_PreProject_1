package app.service;

import app.enties.User;

import java.sql.SQLException;
import java.util.List;

public interface UserServise {



    public boolean addUser(User user) throws SQLException;

    public boolean updateUser(User user, String password) throws SQLException;

    public void deleteUser(String login) throws SQLException;

    public List<User> getUsersList() throws SQLException;

}
