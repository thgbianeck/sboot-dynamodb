package br.com.bieniek.sbootdynamodb.repository;

import br.com.bieniek.sbootdynamodb.entity.Employee;

public interface EmployeeRepository {

    Employee save(Employee employee);
    Employee getEmployeeById(String employeeId);
    String deleteEmployeeById(String employeeId);
    String updateEmployeeById(String employeeId, Employee employee);
}
