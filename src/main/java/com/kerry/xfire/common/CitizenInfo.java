package com.kerry.xfire.common;

import org.apache.commons.lang3.RandomUtils;

import java.util.*;

/**
 * @author kerryhe
 * @date 2020/5/19
 */
public class CitizenInfo {

    private static List<String> all_citizen = new LinkedList<>();

    static {
        all_citizen.add("<?xml version=\"1.0\" encoding=\"UTF-8\"?><ROWS><ROW no=\"1\"><INPUT><gmsfhm>452123199001153225</gmsfhm><xm>龙耀菁</xm></INPUT><OUTPUT><ITEM><gmsfhm></gmsfhm><result_gmsfhm>一致</result_gmsfhm></ITEM><ITEM><xm></xm><result_xm>一致</result_xm></ITEM></OUTPUT></ROW></ROWS>");
        all_citizen.add("<?xml version=\"1.0\" encoding=\"UTF-8\"?><ROWS><ROW no=\"1\"><INPUT><gmsfhm>530113199602083141</gmsfhm><xm>张橙</xm></INPUT><OUTPUT><ITEM><gmsfhm></gmsfhm><result_gmsfhm>一致</result_gmsfhm></ITEM><ITEM><xm></xm><result_xm>不一致</result_xm></ITEM></OUTPUT></ROW></ROWS>");
        all_citizen.add("<?xml version=\"1.0\" encoding=\"UTF-8\"?><ROWS><ROW no=\"1\"><INPUT><gmsfhm>50023619931029307X</gmsfhm><xm>匡华</xm></INPUT><OUTPUT><ITEM><gmsfhm></gmsfhm><result_gmsfhm>一致</result_gmsfhm></ITEM><ITEM><xm></xm><result_xm>一致</result_xm></ITEM></OUTPUT></ROW></ROWS>");
        all_citizen.add("<?xml version=\"1.0\" encoding=\"utf-8\"?><ROWS><ROW no=\"1\"><INPUT><gmsfhm>441502196302146778</gmsfhm><xm>镁迸谱</xm></INPUT><OUTPUT><ITEM><errormesage>服务结果:库中无此号，请到户籍所在地进行核实</errormesage></ITEM><ITEM><errormesagecol/></ITEM></OUTPUT></ROW></ROWS>");
        all_citizen.add("<?xml version=\"1.0\" encoding=\"UTF-8\"?><ROWS><ROW no=\"1\"><INPUT><gmsfhm>450204201411022222</gmsfhm><xm>覃兰岚</xm></INPUT><OUTPUT><ITEM><gmsfhm></gmsfhm><result_gmsfhm>一致</result_gmsfhm></ITEM><ITEM><xm></xm><result_xm>一致</result_xm></ITEM></OUTPUT></ROW></ROWS>");
    }

    /**
     * get citizen check info
     * @return
     */
    public String getInfo() {
        int i = RandomUtils.nextInt(1, 100);
        int index = i % all_citizen.size();
        System.out.println(index);
        return all_citizen.get(index);
    }

}
