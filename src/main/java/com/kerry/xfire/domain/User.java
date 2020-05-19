package com.kerry.xfire.domain;

/**
 * @author kerryhe
 * @date 2020/5/18
 */
public class User {

    private String abbr;

    private String name;

    private Integer age;

    private String sex;

    public User(String abbr, String name, Integer age, String sex) {
        this.abbr = abbr;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getAbbr() {
        return abbr;
    }

    public void setAbbr(String abbr) {
        this.abbr = abbr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
