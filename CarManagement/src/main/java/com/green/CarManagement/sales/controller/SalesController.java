package com.green.CarManagement.sales.controller;

import com.green.CarManagement.sales.service.SalesServiceImpl;
import com.green.CarManagement.sales.vo.SalesVO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sales")
public class SalesController {
    @Resource(name = "salesService")
    private SalesServiceImpl salesService;

    @GetMapping("/salesForm")
    public String salesForm(Model model){ // 판매 정보 화면
        model.addAttribute("salesCarList", salesService.selectCarName());

        return "content/sales/sales_form";
    }

    @PostMapping("/insertSales")
    public String insertSales(SalesVO salesVO){ // 판매 정보 등록
        salesService.insertSales(salesVO);
        return "redirect:/sales/list";
    }

    @GetMapping("list")
    public String list(Model model){ //판매 목록
        model.addAttribute("salesCarList", salesService.selectSalesCar());

        return "content/sales/sales_list";
    }
}
