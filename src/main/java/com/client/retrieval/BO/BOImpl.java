package com.client.retrieval.BO;

import com.client.retrieval.EO.EmployeeEO;
import com.client.retrieval.EmployeeDTO.EmployeeDTO;
import com.client.retrieval.feign.EmployeeFeignClient;
import com.client.retrieval.mapper.EntityMapper;
import com.client.retrieval.vo.EmployeeVO;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import com.client.retrieval.resthelper.EmployeeRestHelper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class BOImpl implements BO{

    @Autowired
    public EntityMapper entityMapper;
    @Autowired
    public EmployeeRestHelper employeeRestHelper;
    @Autowired
    public EmployeeFeignClient employeeFeignClient;

    @Override
    public EmployeeDTO getEmployeeById(Long id) {
        EmployeeEO employeeEO = employeeRestHelper.getEmployeeById(id);
        EmployeeDTO employeeDTO = entityMapper.toEmployeeDTO(employeeEO);
        return employeeDTO;
    }

    @Override
    public EmployeeDTO getEmployeeByIdFeign(Long id) {
        EmployeeVO employeeVO = employeeFeignClient.getEmployeeById(id);
        EmployeeDTO employeeDTO = entityMapper.toEmployeeDTO(employeeVO);
        return employeeDTO;
    }
}
