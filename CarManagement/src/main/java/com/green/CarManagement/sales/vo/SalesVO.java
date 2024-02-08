package com.green.CarManagement.sales.vo;

import com.green.CarManagement.car.vo.CarVO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SalesVO {
    private int salesNum;
    private String salesName;
    private String salesTel;
    private String salesColor;
    private String salesDate;
    private int carNum;

    private CarVO carVO;
}
