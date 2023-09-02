package lk.ijse.gdse.service.utill;

import lk.ijse.gdse.dto.EmployeeDTO;
import lk.ijse.gdse.service.EmpService;
import org.springframework.stereotype.Service;

@Service
public class EmpServiceIMPL implements EmpService {
    @Override
    public EmployeeDTO saveEmployee(EmployeeDTO employeeDTO) {
        return null;
    }

    @Override
    public void deleteEmployee(String empId) {

    }

    @Override
    public void updateEmployee(String id , EmployeeDTO employeeDTO) {

    }

    @Override
    public EmployeeDTO getEmpById(String empId) {
        return null;
    }
}
