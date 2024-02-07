package com.green.CarManagement.sales.controller;

import com.green.CarManagement.sales.service.SalesServiceImpl;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sales")
public class SalesController {
    @Resource(name = "salesService")
    private SalesServiceImpl salesService;

    @GetMapping("salesForm")
    public String salesForm(){ // 판매 정보 등록


        return "content/sales/sales_form";
    }

    @GetMapping("list")
    public String list(){ //판매 목록


        return "content/sales/sales_list";
    }
}
