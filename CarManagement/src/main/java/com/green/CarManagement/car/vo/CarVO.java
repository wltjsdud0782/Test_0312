package com.green.CarManagement.car.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CarVO {
    private int carNum;
    private String carName;
    private int carPrice;
    private String carCompany;
}
