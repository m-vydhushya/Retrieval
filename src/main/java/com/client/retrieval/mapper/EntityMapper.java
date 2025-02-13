package com.client.retrieval.mapper;

import com.client.retrieval.EO.EmployeeEO;
import com.client.retrieval.EmployeeDTO.EmployeeDTO;
import com.client.retrieval.vo.EmployeeVO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EntityMapper {
    EmployeeVO toEmployeeVO(EmployeeDTO employeeDTO);

    EmployeeDTO toEmployeeDTO(EmployeeEO employeeEO);

    EmployeeEO toEmployeeEO(EmployeeVO employeeVO);

    EmployeeDTO toEmployeeDTO(EmployeeVO employeeVO);
}
