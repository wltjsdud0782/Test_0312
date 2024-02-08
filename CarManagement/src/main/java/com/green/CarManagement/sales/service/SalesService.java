package com.green.CarManagement.sales.service;

import com.green.CarManagement.car.vo.CarVO;
import com.green.CarManagement.sales.vo.SalesVO;

import java.util.List;

public interface SalesService {

    List<CarVO> selectCarName();

    void insertSales(SalesVO salesVO);

    List<SalesVO> selectSalesCar();
}
