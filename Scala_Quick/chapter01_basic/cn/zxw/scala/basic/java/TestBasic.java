package cn.zxw.scala.basic.java;

import java.util.Map;

/**
 * Created by zhangxw on 2017/7/24.
 */
public class TestBasic {
    public static void main(String[] args){
        BasicTest.echo();
        Map<String,String> map = BasicTest.getMap();
        for(String key:map.keySet()){
            System.out.println(key+"="+map.get(key));
        }

    }
}
