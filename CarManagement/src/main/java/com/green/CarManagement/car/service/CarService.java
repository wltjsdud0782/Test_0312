package com.green.CarManagement.car.service;

import com.green.CarManagement.car.vo.CarVO;

import java.util.List;

public interface CarService {

    List<CarVO> selectCar();

    void insertCar(CarVO carVO);
}
