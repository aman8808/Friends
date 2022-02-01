import models.Auto;
import models.Friend;
import services.UserService;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        UserService userService = new UserService();
        Friend friend = new Friend("Alex",33);
        userService.saveFriend(friend);
        Auto kia = new Auto("Kia", "white");
        kia.setFriend(friend);
        friend.addAuto(kia);
        Auto lada = new Auto("Lada", "black");
        lada.setFriend(friend);
        friend.addAuto(lada);
        userService.updateUser(friend);
    }
}
