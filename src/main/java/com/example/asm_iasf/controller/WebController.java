package com.example.asm_iasf.controller;

import com.example.asm_iasf.entity.Employee;
import com.example.asm_iasf.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.Map;

@Controller
public class WebController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping({"/", "/index"})
    private String getAllEmployee(Model model) {
        model.addAttribute("employees", employeeService.findAllEprisees());
        return "index";
    }


    @GetMapping("/create")
    public String create(){
        return "create";
    }

    @PostMapping("/create")
    public String create(@RequestParam Map<String, String> params){
        Employee employee = new Employee(
                params.get("name"),
                Integer.parseInt(params.get("wage"))
        );
        employeeService.createEaffee(employee);
        return "redirect:/index";
    }

}
