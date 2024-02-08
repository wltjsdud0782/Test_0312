package com.green.CarManagement.car.service;

import com.green.CarManagement.car.vo.CarVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("carService")
public class CarServiceImpl implements CarService{
    @Autowired
    SqlSessionTemplate sqlSession;

    @Override
    public List<CarVO> selectCar() {
        return sqlSession.selectList("carMapper.selectCar");
    }

    @Override
    public void insertCar(CarVO carVO) {
        sqlSession.insert("carMapper.insertCar", carVO);
    }
}
