package br.com.bieniek.sbootdynamodb.controller;

import br.com.bieniek.sbootdynamodb.entity.Employee;
import br.com.bieniek.sbootdynamodb.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeRepository employeeRepository;

    @PostMapping
    public Employee save(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable("id") String employeeId) {
        return employeeRepository.getEmployeeById(employeeId);
    }

    @DeleteMapping("/{id}")
    public String deleteEmployeeById(@PathVariable("id") String employeeId) {
        return employeeRepository.deleteEmployeeById(employeeId);
    }

    @PutMapping("/{id}")
    public String updateEmployeeById(@PathVariable("id") String employeeId, @RequestBody Employee employee) {
        return employeeRepository.updateEmployeeById(employeeId, employee);
    }
}
