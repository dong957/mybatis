package com.zking.mybatis.util;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author dong
 * @create 2019-11-2718:14
 */
public class ResourceBundleDemo {
    public static void main(String[] args) {
        String path="i18n";
        //如果只带path参数，则系统根据默认的区域设置来获取资源
        ResourceBundle r=ResourceBundle.getBundle(path);
        String name=r.getString("name");
        System.out.println(name);

        //如果指定local对象，则通过指定的local对象来获取资源
        ResourceBundle r2=ResourceBundle.getBundle(path, Locale.US);
        String name2=r2.getString("name");
        System.out.println(name2);




        String msg=r.getString("message");
        msg= MessageFormat.format(msg,"露丝","杰克");
        System.out.println(msg);



        String msg2=r2.getString("message");
        msg2= MessageFormat.format(msg2,"rose","jeck");
        System.out.println(msg2);



    }
}
