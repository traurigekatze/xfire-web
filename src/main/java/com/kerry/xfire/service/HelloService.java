package com.kerry.xfire.service;

/**
 * @author kerryhe
 * @date 2020/5/18
 */
public interface HelloService {

    /**
     * get info by name
     * @param abbr
     * @return
     */
    String getInfo(String abbr);

    /**
     * get all
     * @return
     */
    String getAll();

    /**
     * add info
     * @param abbr
     * @param name
     * @param age
     * @param sex
     * @return
     */
    Integer add(String abbr, String name, Integer age, String sex);

}
