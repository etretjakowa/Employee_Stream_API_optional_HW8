package ru.sky.Employee.Stream.API.optional.HW8;

public class EmployeeNotFoundException extends RuntimeException{
    public EmployeeNotFoundException(String message) {
        super(message);
    }
}