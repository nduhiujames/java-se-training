package com.systechafrica.part2.inheritance.companysetup;

public class Employee {
    private String employeeNo;
    private String employeeName;
    private String employeeAddress;

    public Employee(String employeeNo, String employeeName, String employeeAddress) {
        this.employeeNo = employeeNo;
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
    }

    public String getEmployeeNo() {
        return employeeNo;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public String toString() {
        return "Name: " + getEmployeeName() + "No " + getEmployeeNo() + "Address " + getEmployeeAddress();
    }

}
