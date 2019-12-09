package com.zking.mybatis.service;

import com.zking.mybatis.mapper.CustomerMapper;
import com.zking.mybatis.model.Customer;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author dong
 * @create 2019-11-1921:39
 */
@Service
public class CustomerServiceImpl implements CustomerService {


    @Resource
    private CustomerMapper customerMapper;

    @Override
    public List<Customer> list(Map<String, Object> paramMap) {
        return customerMapper.list(paramMap);
    }
}
