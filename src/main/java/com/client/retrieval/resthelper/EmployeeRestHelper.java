package com.client.retrieval.resthelper;

import com.client.retrieval.EO.EmployeeEO;
import com.client.retrieval.mapper.EntityMapper;
import com.client.retrieval.vo.EmployeeVO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Service
@Component
public class EmployeeRestHelper {
    @Autowired
    public EntityMapper entityMapper;
    @Autowired
    private RestTemplate restTemplate;
    public String OneURL = "http://localhost:8082";

    public EmployeeEO getEmployeeById(Long id){
        EmployeeVO employeeVO = restTemplate.getForObject(OneURL+"/employee/view/"+id, EmployeeVO.class);
        EmployeeEO employeeEO = entityMapper.toEmployeeEO(employeeVO);
        return employeeEO;
    }

}
