package com.green.CarManagement.car.controller;

import com.green.CarManagement.car.service.CarServiceImpl;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/car")
public class CarController {
    @Resource(name = "carService")
    private CarServiceImpl carService;

    @GetMapping("/main")
    public String main (){
        return "/content/car/car_main";
    }

    @GetMapping("/list")
    public String list(){ // 차량관리


        return "content/car/car_list";
    }
}
