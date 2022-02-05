package com.dianzi.cloudcommon.xss;


import com.dianzi.cloudcommon.utils.RRException;
import org.apache.commons.lang.StringUtils;

public class SQLFilter {

    /**
     * SQL注⼊过滤
     * @param str 待验证的字符串
     */
    public static String sqlInject(String str){
        if(StringUtils.isBlank(str)){
            return null;
        }
        //去掉'|"|;|\字符
        str = StringUtils.replace(str, "'", "");
        str = StringUtils.replace(str, "\"", "");
        str = StringUtils.replace(str, ";", "");
        str = StringUtils.replace(str, "\\", "");
        //转换成⼩写
        str = str.toLowerCase();
        //⾮法字符
        String[] keywords = {"master", "truncate", "insert", "select", "delete",
                "update", "declare", "alter", "drop"};
        //判断是否包含⾮法字符
        for(String keyword : keywords){
            if(str.indexOf(keyword) != -1){
                throw new RRException("包含⾮法字符");
            }
        }
        return str;
    }
}
