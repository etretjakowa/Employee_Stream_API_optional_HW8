package ru.sky.Employee.Stream.API.optional.HW8;

public class EmployeeDepartmentNotFoundException extends RuntimeException{
    public EmployeeDepartmentNotFoundException(String message) {
        super(message);
    }
}