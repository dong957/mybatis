package com.zking.mybatis.service;

import com.zking.mybatis.model.Order;

import org.junit.Test;


import javax.annotation.Resource;

import java.util.List;



/**
 * @author dong
 * @create 2019-11-1922:06
 */

public class OrderServiceImplTest extends  BaseTest{

    @Resource
    private  OrderService orderService;
    @Test
    public void list() {
        Order order=new Order();
        List<Order> lst=orderService.list(order);
        for(Order o:lst){
            System.out.println(o);
        }

    }
}
