package ru.storeone.utils;


import ru.storeone.bean.UserAccount;
import ru.storeone.config.SecurityConfig;

import java.util.HashMap;
import java.util.Map;

public class DataDAO {

    private static final Map<String, UserAccount> mapUsers = new HashMap<String, UserAccount>();

    static {
        initUsers();
    }

    private static void initUsers() {

        // This user has a role as EMPLOYEE.
        UserAccount emp = new UserAccount("buyer", "123", UserAccount.GENDER_MALE, //
                SecurityConfig.ROLE_BUYER);

        // This user has 2 roles EMPLOYEE and MANAGER.
        UserAccount mng = new UserAccount("manager", "124", UserAccount.GENDER_MALE, //
                SecurityConfig.ROLE_BUYER, SecurityConfig.ROLE_MANAGER);

        mapUsers.put(emp.getUserName(), emp);
        mapUsers.put(mng.getUserName(), mng);
    }

    // Find a User by userName and password.
    public static UserAccount findUser(String userName, String password) {
        UserAccount u = mapUsers.get(userName);
        if (u != null && u.getPassword().equals(password)) {
            return u;
        }
        return null;
    }

}