package com.zking.mybatis.service;

import com.zking.mybatis.model.Customer;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author dong
 * @create 2019-11-1921:39
 */
public interface CustomerService {
    List<Customer> list(@Param("paramMap") Map<String,Object> paramMap);

}
