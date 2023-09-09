package lk.ijse.gdse.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmployeeDTO {
    private String EmpId;
    private String EmpName;
    private String EmpEmail;
    private String EmpDep;
    private String EmpProfile;

    public EmployeeDTO(String empId, String empName, String empEmail, String empDep, String empProfile) {
        EmpId = empId;
        EmpName = empName;
        EmpEmail = empEmail;
        EmpDep = empDep;
        EmpProfile = empProfile;
    }
}
