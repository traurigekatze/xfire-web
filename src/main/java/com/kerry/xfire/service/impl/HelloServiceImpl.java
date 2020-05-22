package com.kerry.xfire.service.impl;

import com.alibaba.fastjson.JSON;
import com.kerry.xfire.common.CitizenInfo;
import com.kerry.xfire.common.UserInfo;
import com.kerry.xfire.domain.User;
import com.kerry.xfire.service.HelloService;

import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @author kerryhe
 * @date 2020/5/18
 */
public class HelloServiceImpl implements HelloService {

    private UserInfo userInfo = new UserInfo();

    private CitizenInfo citizenInfo = new CitizenInfo();

    private static Map<String, Integer> map = new HashMap<>();

    static {
        map.put("start", 500);
        map.put("end", 900);
    }

    @Override
    public String getInfo(String abbr) {
        User info = userInfo.getInfo(abbr);
        Long sleep = RandomUtils.nextLong(800, 950);
        try {
			TimeUnit.MILLISECONDS.sleep(sleep);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        System.out.println(String.format("getInfo random sleep time:%s", sleep));
        return info == null ? "" : JSON.toJSONString(info);
    }

    @Override
    public String getAll() {
        List<User> all = userInfo.getAll();
        return all == null ? "" : JSON.toJSONString(all);
    }

    @Override
    public Integer add(String abbr, String name, Integer age, String sex) {
        if (StringUtils.isBlank(abbr) || StringUtils.isBlank(name) || StringUtils.isBlank(sex) || age == null) {
            System.out.println("参数错误，请更改重试...");
            return 0;
        }
        User user = new User(abbr, name, age, sex);
        return userInfo.add(user);
    }

    @Override
    public String nciicCheck(String inLicense, String inConditions) {
        Integer start = map.get("start");
        Integer end = map.get("end");
        Long sleep = RandomUtils.nextLong(start, end);
        try {
            TimeUnit.MILLISECONDS.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(String.format("nciic check random sleep time:%s", sleep));
        return citizenInfo.getInfo();
    }

    @Override
    public String nciicCompare(String inLicense, String inConditions) {
        Integer start = map.get("start");
        Integer end = map.get("end");
        Long sleep = RandomUtils.nextLong(start, end);
        try {
            TimeUnit.MILLISECONDS.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(String.format("nciic compare random sleep time:%s", sleep));
        return citizenInfo.getCompare();
    }

    @Override
    public void reload(Integer start, Integer end) {
        System.out.println(String.format("start:%s,end:%s", start, end));
        if (start != null && end != null && start < end) {
            map.put("start", start);
            map.put("end", end);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(String.format("test random %s:%s", i, RandomUtils.nextLong(map.get("start"), map.get("end"))));
        }
    }

}
