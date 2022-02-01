package services;

import dao.UserDao;
import models.Auto;
import models.Friend;

import java.util.List;

public class UserService {

    private UserDao usersDao = new UserDao();

    public UserService() {
    }

    public Friend findUser(int id) {
        return usersDao.findById(id);
    }

    public void saveFriend(Friend friend) {
        usersDao.save(friend);
    }

    public void deleteUser(Friend friend) {
        usersDao.delete(friend);
    }

    public void updateUser (Friend friend) {
        usersDao.update(friend);
    }

    public List<Friend> findAllFriends() {
        return usersDao.findAll();
    }

    public Auto findAutoById(int id) {
        return usersDao.findAutoById(id);
    }


}