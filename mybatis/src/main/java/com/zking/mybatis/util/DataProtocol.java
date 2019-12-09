package com.zking.mybatis.util;

import java.util.HashMap;
import java.util.Map;

/**
 * @author dong
 * @create 2019-11-3010:49
 */
public class DataProtocol extends HashMap<String ,Object> {
    public  static int success=1;
    public  static int fail=-1;
    private long ts=System.currentTimeMillis();

    public DataProtocol(){
        super();
        this.put("code",success);
        this.put("ts",ts);

    }

    public void setCode(int code){
        this.put("code",code);

    }
    public void setData(Object data){
        this.put("data",data);

    }

    public void setErrors(Map<String,String> errors){
        this.put("errors",errors);

    }

    public void setMessage(String message){
        this.put("message",message);

    }

}
