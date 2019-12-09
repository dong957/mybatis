package com.zking.mybatis.service;

import com.zking.mybatis.model.Customer;

import com.zking.mybatis.model.Order;
import org.junit.Test;


import javax.annotation.Resource;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author dong
 * @create 2019-11-1921:46
 */

public class CustomerServiceImplTest extends  BaseTest {

    @Resource
    private  CustomerService customerService;

    @Test
    public  void list() {
        Map<String,Object> ParaMap=new HashMap<>();
        ParaMap.put("customerName","zs");
       List<Customer> ls=customerService.list(ParaMap);
       for(Customer c:ls){
           System.out.println("_________________________________________");
           System.out.println(c);
           for (Order o:c.getOrders()){
               System.out.println(o);
           }
       }

    }
}
