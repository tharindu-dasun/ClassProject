package lk.ijse.gdse.service;

import lk.ijse.gdse.dto.EmployeeDTO;

public interface EmpService {
    EmployeeDTO saveEmployee (EmployeeDTO employeeDTO);
    void deleteEmployee (String empId);
    void updateEmployee ( String id ,EmployeeDTO employeeDTO);
    EmployeeDTO getEmpById(String empId);
}
