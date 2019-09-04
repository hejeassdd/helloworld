package com.company;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
    public static void main(String[] args) throws Exception {
//        FileOutputStream fileInputStream = new FileOutputStream("D:\\outProp.properties");
        FileWriter fileInputStream = new FileWriter("D:\\outProp2.properties");
        Properties pro = new Properties();
//        pro.put("1","杰西卡·阿尔巴");
//        pro.put("2","刘亦菲");
//        pro.put("3","唐嫣");
        pro.setProperty("1","黄晓明");
        pro.setProperty("2","刘亦菲");
        pro.setProperty("3","唐嫣");
//        Set<Object> objects = pro.keySet();
//        for (Object obj:objects) {
//            String key = (String) obj;
//            Object value = pro.get(key);
//
//            System.out.println(key+":"+value.toString());
//
//        }
        pro.store(fileInputStream,"输出文件prop测试");

        fileInputStream.close();
    }

}
