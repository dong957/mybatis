package com.zking.mybatis.mapper;

import com.zking.mybatis.model.Customer;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author dong
 * @create 2019-11-1921:05
 */
public interface CustomerMapper {

List<Customer> list(@Param("paramMap") Map<String,Object> paramMap);


}
