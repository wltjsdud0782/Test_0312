package com.green.CarManagement.car.controller;

import com.green.CarManagement.car.service.CarServiceImpl;
import com.green.CarManagement.car.vo.CarVO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
    public String list(Model model){ // 차량관리 (조회)
        model.addAttribute("carList", carService.selectCar());
        return "content/car/car_list";
    }

    @PostMapping("/insertCar")
    public String insertCar(CarVO carVO){
        carService.insertCar(carVO);
        return "redirect:/car/list";
    }
}
