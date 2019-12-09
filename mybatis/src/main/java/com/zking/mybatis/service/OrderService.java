package com.zking.mybatis.service;

import com.zking.mybatis.model.Order;

import java.util.List;

/**
 * @author dong
 * @create 2019-11-1921:38
 */
public interface OrderService {
    List<Order> list(Order order);
}
