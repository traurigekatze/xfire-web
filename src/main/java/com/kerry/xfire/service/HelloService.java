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

    /**
     * nciic check
      * @param inLicense
     * @param inConditions
     * @return
     */
    String nciicCheck(String inLicense, String inConditions);

    /**
     * nciic compare
     * @param inLicense
     * @param inConditions
     * @return
     */
    String nciicCompare(String inLicense, String inConditions);

    /**
     * reload
     * @param start
     * @param end
     */
    void reload(Integer start, Integer end);

    /**
     * reloadC
     * @param start
     * @param end
     */
    void reloadC(Integer start, Integer end);

}
