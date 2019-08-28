package com.momenton.test.web;

import com.momenton.test.dto.EmployeeDto;
import com.momenton.test.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@AllArgsConstructor
public class EmployeeRestControl {
    private EmployeeService employeeService;

    @GetMapping("/employee/all")
    @ResponseBody
    public EmployeeDto getEmployees(Model model) {
        return employeeService.populateMembersOfCeo();
    }
}
