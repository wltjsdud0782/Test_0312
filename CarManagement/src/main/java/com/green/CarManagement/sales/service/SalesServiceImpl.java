package com.green.CarManagement.sales.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("salesService")
public class SalesServiceImpl implements  SalesService{
    @Autowired
    SqlSessionTemplate sqlSession;
}
