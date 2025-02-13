package com.client.retrieval.BO;

import com.client.retrieval.EmployeeDTO.EmployeeDTO;

public interface BO {
    EmployeeDTO getEmployeeById(Long id);

    EmployeeDTO getEmployeeByIdFeign(Long id);
}
