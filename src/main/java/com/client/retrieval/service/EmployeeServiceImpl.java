package com.client.retrieval.service;

import com.client.retrieval.BO.BOImpl;
import com.client.retrieval.EmployeeDTO.EmployeeDTO;
import lombok.extern.slf4j.Slf4j;
import com.client.retrieval.mapper.EntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.client.retrieval.vo.EmployeeVO;

@Slf4j
@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    public BOImpl bo;
    @Autowired
    public EntityMapper entityMapper;

    @Override
    public EmployeeVO getEmployeeByIdUsingRest(Long id) {
        log.info("Calling EmployeeRestHelper for ID: {}", id);
        EmployeeDTO employeeDTO = bo.getEmployeeById(id);
        EmployeeVO employeeVO = entityMapper.toEmployeeVO(employeeDTO);
        return employeeVO;
    }

    @Override
    public EmployeeVO getEmployeeByIdUsingFeign(Long id) {
        log.info("Calling EmployeeFeignClient for ID: {}", id);
        EmployeeDTO employeeDTO = bo.getEmployeeById(id);
        EmployeeVO employeeVO = entityMapper.toEmployeeVO(employeeDTO);
        return employeeVO;
    }
}
