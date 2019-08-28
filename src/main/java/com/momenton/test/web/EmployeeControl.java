package com.momenton.test.web;

import com.momenton.test.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class EmployeeControl {
    private EmployeeService employeeService;

    @GetMapping("/")
    public String main(Model model) {
        return "main";
    }

}
