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
    private byte[] EmpProfile;
}
