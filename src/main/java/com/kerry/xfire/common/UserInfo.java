package com.kerry.xfire.common;

import com.kerry.xfire.domain.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author kerryhe
 * @date 2020/5/18
 */
public class UserInfo {

    private static Map<String, User> all_user = new HashMap<>();

    static {
        User ada = new User("ada", "艾达", 18, "女");
        User haley = new User("haley", "海莉", 19, "女");
        User c = new User("mack", "麦克", 18, "男");
        User hank = new User("hank", "汉克", 20, "男");
        all_user.put(ada.getAbbr(), ada);
        all_user.put(haley.getAbbr(), haley);
        all_user.put(haley.getAbbr(), haley);
        all_user.put(hank.getAbbr(), hank);
    }

    /**
     * get info by name
     * @param abbr
     * @return
     */
    public User getInfo(String abbr) {
        return all_user.get(abbr);
    }

    /**
     * get all
     * @return
     */
    public List<User> getAll() {
        return (List<User>) all_user.values();
    }

    /**
     * add
     * @param user
     * @return
     */
    public Integer add(User user) {
        all_user.put(user.getAbbr(), user);
        return 1;
    }

}
