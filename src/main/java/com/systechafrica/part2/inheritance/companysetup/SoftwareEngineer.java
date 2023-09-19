package com.systechafrica.part2.inheritance.companysetup;

import com.systechafrica.part2.inheritance.companysetup.Employee;

public class SoftwareEngineer extends Employee {
    public SoftwareEngineer(String employeeNo, String employeeName, String employeeAddress) {
        super(employeeNo, employeeName, employeeAddress);
        //TODO Auto-generated constructor stub
    }

    
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    
}
