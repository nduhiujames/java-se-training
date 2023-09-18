package com.systechafrica.part2.inheritance;

import java.util.logging.Logger;

import com.systechafrica.part2.inheritance.companysetup.QualityAssurance;
import com.systechafrica.part2.inheritance.companysetup.SoftwareEngineer;

public class InheritanceDemo {

    private static final Logger LOGGER = Logger.getLogger(InheritanceDemo.class.getName());

    public static void main(String[] args) {
        InheritanceDemo app = new InheritanceDemo();
        app.companySetup();
    }

    public void companySetup() {
        SoftwareEngineer e1 = new SoftwareEngineer();
        e1.setEmployeeName("Emily");
        e1.setEmployeeNo("001");
        e1.setEmployeeAddress("Nairobi ");
        e1.setTitle("SoftwareEngineer");
        LOGGER.info("SoftwareEngineer" + e1.toString());

        QualityAssurance qa = new QualityAssurance();
        qa.setEmployeeName("Halkano");
        qa.setEmployeeNo("002");
        qa.setEmployeeAddress("Marsabit ");
        qa.setTitle("SoftwareEngineer in Test");
        LOGGER.info("QualityAssurance" + qa.toString());

    }
}
