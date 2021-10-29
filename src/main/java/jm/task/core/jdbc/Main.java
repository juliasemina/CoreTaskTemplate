package jm.task.core.jdbc;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Иван", "Петров", (byte) 30);
        userService.saveUser("Валя", "Сидорова", (byte) 40);
        userService.saveUser("Галя", "Иванова", (byte) 20);
        userService.saveUser("Рома", "Романов", (byte) 35);
        //userService.removeUserById(3);

        List<User> users = userService.getAllUsers();
        System.out.println(users);
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
