package lk.ijse.gdse.api;

import lk.ijse.gdse.dto.EmployeeDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {
    @PostMapping
    void saveEmployee(@RequestBody EmployeeDTO employeeDTO){
        System.out.println(employeeDTO);
    }
    @DeleteMapping
    void deleteEmployee(@PathVariable String id){
        System.out.println("id : "+id);
    }
    @PutMapping
    void updateEmployee(@PathVariable String id , @RequestBody EmployeeDTO employeeDTO){
        System.out.println(id);
        System.out.println(employeeDTO);
    }
    @GetMapping
    List<EmployeeDTO> getAllEmployee(){
        return null;
    }
}
