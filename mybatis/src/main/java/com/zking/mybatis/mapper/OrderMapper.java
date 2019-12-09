package com.zking.mybatis.mapper;

import com.zking.mybatis.model.Order;

import java.util.List;

/**
 * @author dong
 * @create 2019-11-1921:04
 */
public interface OrderMapper {
    List<Order> list(Order order);
}
