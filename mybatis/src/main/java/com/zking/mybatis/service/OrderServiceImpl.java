package com.zking.mybatis.service;

import com.zking.mybatis.mapper.OrderMapper;
import com.zking.mybatis.model.Order;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author dong
 * @create 2019-11-1921:39
 */
@Service
public class OrderServiceImpl implements OrderService{
    @Resource
    private OrderMapper orderMapper;

    @Override
    public List<Order> list(Order order) {
        return orderMapper.list(order);
    }
}
