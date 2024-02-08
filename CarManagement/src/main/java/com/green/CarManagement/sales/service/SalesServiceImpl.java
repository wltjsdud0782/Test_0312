package com.green.CarManagement.sales.service;

import com.green.CarManagement.car.vo.CarVO;
import com.green.CarManagement.sales.vo.SalesVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("salesService")
public class SalesServiceImpl implements  SalesService{
    @Autowired
    SqlSessionTemplate sqlSession;

    @Override
    public List<CarVO> selectCarName() {
        return sqlSession.selectList("salesMapper.selectCarName");
    }

    @Override
    public void insertSales(SalesVO salesVO) {
        sqlSession.insert("salesMapper.insertSales", salesVO);
    }

    @Override
    public List<SalesVO> selectSalesCar() {
        return sqlSession.selectList("salesMapper.selectSalesCar");
    }
}
