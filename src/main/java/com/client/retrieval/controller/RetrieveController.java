package com.client.retrieval.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.client.retrieval.service.EmployeeService;
import com.client.retrieval.vo.EmployeeVO;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RestController
@RequestMapping("/ret")
public class RetrieveController {

    @Autowired
    public EmployeeService employeeService;

    @GetMapping("/rest/{id}")
    public ResponseEntity<EmployeeVO> getEmployeeByIdUsingRest(@PathVariable Long id) {
        System.out.println("Controller");
        EmployeeVO employeeVO = employeeService.getEmployeeByIdUsingRest(id);
        return ResponseEntity.ok(employeeVO);
    }

    @GetMapping("/feign/{id}")
    public ResponseEntity<EmployeeVO> getEmployeeByIdUsingFeign(@PathVariable Long id) {
        System.out.println("Feign Controller");
        EmployeeVO employeeVO = employeeService.getEmployeeByIdUsingFeign(id);
        return ResponseEntity.ok(employeeVO);
    }
}













