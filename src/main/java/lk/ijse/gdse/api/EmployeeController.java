package lk.ijse.gdse.api;

import lk.ijse.gdse.dto.EmployeeDTO;
import lk.ijse.gdse.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.Base64;
import java.util.List;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {
    @Autowired
    EmpService empService;
    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    EmployeeDTO saveEmployee(
            @RequestPart String empName,
            @RequestPart String empEmail,
            @RequestPart String empDep,
            @RequestPart byte[] empProfile ){

//======================Convert byte() as String / Base64========================
            String empProfileStr = Base64.getEncoder().encodeToString(empProfile);
            EmployeeDTO tmpEmp = new EmployeeDTO();
            tmpEmp.setEmpName(empName);
            tmpEmp.setEmpEmail(empEmail);
            tmpEmp.setEmpDep(empDep);
            tmpEmp.setEmpProfile(empProfileStr);
            return empService.saveEmployee(tmpEmp);
    }

//        System.out.println(employeeDTO);

    @DeleteMapping
    void deleteEmployee(@PathVariable String id){

        System.out.println("id : "+id);
    }
    @PutMapping
    void updateEmployee(
            @PathVariable String id,
            @RequestBody EmployeeDTO employeeDTO){
        empService.updateEmployee(id,employeeDTO);
    }
    @GetMapping
    List<EmployeeDTO> getSelectedEmp(String empId){
        return null;
    }
}
