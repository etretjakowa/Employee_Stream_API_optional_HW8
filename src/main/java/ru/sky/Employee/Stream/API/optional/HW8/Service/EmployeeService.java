package ru.sky.Employee.Stream.API.optional.HW8.Service;

import ru.sky.Employee.Stream.API.optional.HW8.Employee;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface EmployeeService {
    Employee getEmployeeWithMinSalaryOfDepartment(int department);

    Employee getEmployeeWithMaxSalaryOfDepartment(int department);

    Collection<Employee> findAll();

    Map<Integer, List<Employee>> getAllEmployees();

    Collection<Employee> getDepartmentEmployees(int department);

    Map<Integer, List<Employee>> getDepartmentEmployeesMap();
}