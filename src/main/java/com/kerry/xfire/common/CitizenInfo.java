package com.kerry.xfire.common;

import org.apache.commons.lang3.RandomUtils;

import java.util.*;

/**
 * @author kerryhe
 * @date 2020/5/19
 */
public class CitizenInfo {

    private static List<String> all_citizen = new LinkedList<>();

    private static List<String> all_compare = new LinkedList<>();

    static {
        all_citizen.add("<?xml version=\"1.0\" encoding=\"UTF-8\"?><ROWS><ROW no=\"1\"><INPUT><gmsfhm>452123199001153225</gmsfhm><xm>龙耀菁</xm></INPUT><OUTPUT><ITEM><gmsfhm></gmsfhm><result_gmsfhm>一致</result_gmsfhm></ITEM><ITEM><xm></xm><result_xm>一致</result_xm></ITEM></OUTPUT></ROW></ROWS>");
        all_citizen.add("<?xml version=\"1.0\" encoding=\"UTF-8\"?><ROWS><ROW no=\"1\"><INPUT><gmsfhm>530113199602083141</gmsfhm><xm>张橙</xm></INPUT><OUTPUT><ITEM><gmsfhm></gmsfhm><result_gmsfhm>一致</result_gmsfhm></ITEM><ITEM><xm></xm><result_xm>不一致</result_xm></ITEM></OUTPUT></ROW></ROWS>");
        all_citizen.add("<?xml version=\"1.0\" encoding=\"UTF-8\"?><ROWS><ROW no=\"1\"><INPUT><gmsfhm>50023619931029307X</gmsfhm><xm>匡华</xm></INPUT><OUTPUT><ITEM><gmsfhm></gmsfhm><result_gmsfhm>一致</result_gmsfhm></ITEM><ITEM><xm></xm><result_xm>一致</result_xm></ITEM></OUTPUT></ROW></ROWS>");
        all_citizen.add("<?xml version=\"1.0\" encoding=\"utf-8\"?><ROWS><ROW no=\"1\"><INPUT><gmsfhm>441502196302146778</gmsfhm><xm>镁迸谱</xm></INPUT><OUTPUT><ITEM><errormesage>服务结果:库中无此号，请到户籍所在地进行核实</errormesage></ITEM><ITEM><errormesagecol/></ITEM></OUTPUT></ROW></ROWS>");
        all_citizen.add("<?xml version=\"1.0\" encoding=\"UTF-8\"?><ROWS><ROW no=\"1\"><INPUT><gmsfhm>450204201411022222</gmsfhm><xm>覃兰岚</xm></INPUT><OUTPUT><ITEM><gmsfhm></gmsfhm><result_gmsfhm>一致</result_gmsfhm></ITEM><ITEM><xm></xm><result_xm>一致</result_xm></ITEM></OUTPUT></ROW></ROWS>");

        all_compare.add("<?xml version=\"1.0\" encoding=\"UTF-8\"?><ROWS><ROW no=\"1\"><INPUT><gmsfhm>460027199906238215</gmsfhm><xm>梁安鹏</xm></INPUT><OUTPUT><ITEM><gmsfhm></gmsfhm><result_gmsfhm>一致</result_gmsfhm><result_fx></result_fx><result_fs></result_fs></ITEM><ITEM><xm></xm><result_xm>一致</result_xm><result_fx></result_fx><result_fs></result_fs></ITEM><ITEM><xp></xp><result_xp></result_xp><result_fx>系统判断为同一人</result_fx><result_fs>91</result_fs></ITEM></OUTPUT></ROW></ROWS>");
        all_compare.add("<?xml version=\"1.0\" encoding=\"UTF-8\"?><ROWS><ROW no=\"1\"><INPUT><gmsfhm>420621198612178686</gmsfhm><xm>张傲佳</xm></INPUT><OUTPUT><ITEM><gmsfhm></gmsfhm><result_gmsfhm>一致</result_gmsfhm><result_fx></result_fx><result_fs></result_fs></ITEM><ITEM><xm></xm><result_xm>一致</result_xm><result_fx></result_fx><result_fs></result_fs></ITEM><ITEM><xp></xp><result_xp></result_xp><result_fx>不能确定是否为同一人</result_fx><result_fs>40</result_fs></ITEM></OUTPUT></ROW></ROWS>");
        all_compare.add("<?xml version=\"1.0\" encoding=\"UTF-8\"?><ROWS><ROW no=\"1\"><INPUT><gmsfhm>332524193510155169</gmsfhm><xm>吴子翔</xm></INPUT><OUTPUT><ITEM><errormesage>服务结果:上传相片质量校验不合格，请重新拍摄上传</errormesage></ITEM><ITEM><errormesagecol></errormesagecol></ITEM></OUTPUT></ROW></ROWS>");
        all_compare.add("<?xml version=\"1.0\" encoding=\"UTF-8\"?><ROWS><ROW no=\"1\"><INPUT><gmsfhm>511381200003063317</gmsfhm><xm>王松</xm></INPUT><OUTPUT><ITEM><gmsfhm></gmsfhm><result_gmsfhm>一致</result_gmsfhm><result_fx></result_fx><result_fs></result_fs></ITEM><ITEM><xm></xm><result_xm>一致</result_xm><result_fx></result_fx><result_fs></result_fs></ITEM><ITEM><xp></xp><result_xp></result_xp><result_fx>系统判断为同一人</result_fx><result_fs>87</result_fs></ITEM></OUTPUT></ROW></ROWS>");
        all_compare.add("<?xml version=\"1.0\" encoding=\"UTF-8\"?><ROWS><ROW no=\"1\"><INPUT><gmsfhm>43090219851107502X</gmsfhm><xm>臧丽</xm></INPUT><OUTPUT><ITEM><gmsfhm></gmsfhm><result_gmsfhm>一致</result_gmsfhm><result_fx></result_fx><result_fs></result_fs></ITEM><ITEM><xm></xm><result_xm>一致</result_xm><result_fx></result_fx><result_fs></result_fs></ITEM><ITEM><xp></xp><result_xp></result_xp><result_fx>系统判断为不同人</result_fx><result_fs>13</result_fs></ITEM></OUTPUT></ROW></ROWS>");

        all_compare.add("<?xml version=\"1.0\" encoding=\"UTF-8\"?><ROWS><ROW no=\"1\"><INPUT><gmsfhm>431******7225</gmsfhm><xm>余飞艳</xm></INPUT><OUTPUT><ITEM><gmsfhm></gmsfhm><result_gmsfhm>一致</result_gmsfhm><result_fx></result_fx><result_fs></result_fs></ITEM><ITEM><xm></xm><result_xm>一致</result_xm><result_fx></result_fx><result_fs></result_fs></ITEM><ITEM><xp></xp><result_xp></result_xp><result_fx>照片base64编码异常</result_fx><result_fs></result_fs></ITEM></OUTPUT></ROW></ROWS>");
        all_compare.add("<?xml version=\"1.0\" encoding=\"UTF-8\"?><ROWS><ROW no=\"1\"><INPUT><gmsfhm>620******3317</gmsfhm><xm>朱恩德</xm></INPUT><OUTPUT><ITEM><gmsfhm></gmsfhm><result_gmsfhm>一致</result_gmsfhm><result_fx></result_fx><result_fs></result_fs></ITEM><ITEM><xm></xm><result_xm>一致</result_xm><result_fx></result_fx><result_fs></result_fs></ITEM><ITEM><xp></xp><result_xp></result_xp><result_fx>特征提取失败;</result_fx><result_fs></result_fs></ITEM></OUTPUT></ROW></ROWS>");
    }

    /**
     * get citizen check info
     * @return
     */
    public String getInfo() {
        int i = RandomUtils.nextInt(1, 100);
        int index = i % all_citizen.size();
        return all_citizen.get(index);
    }

    /**
     * get compare info
     * @return
     */
    public String getCompare() {
        int i = RandomUtils.nextInt(1, 100);
        int index = i % all_compare.size();
        return all_compare.get(index);
    }

}
