package com.client.retrieval.service;

import com.client.retrieval.vo.EmployeeVO;

public interface EmployeeService {
    EmployeeVO getEmployeeByIdUsingRest(Long id);
    EmployeeVO getEmployeeByIdUsingFeign(Long id);


}
