package com.client.retrieval.feign;

import com.client.retrieval.EO.EmployeeEO;
import com.client.retrieval.vo.EmployeeVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "employeeClient", url = "http://localhost:8082")
public interface EmployeeFeignClient {
    @GetMapping("/employee/view/{id}")
    EmployeeVO getEmployeeById(@PathVariable Long id);

}
