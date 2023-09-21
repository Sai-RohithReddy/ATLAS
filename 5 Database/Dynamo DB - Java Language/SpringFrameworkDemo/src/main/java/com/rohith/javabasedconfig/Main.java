package com.rohith.javabasedconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        Staff staff = context.getBean(Doctor.class);
        staff.assist();
        staff = context.getBean(Nurse.class);
        staff.assist();

        // By default Spring follows singleton design pattern
        Doctor doctor = context.getBean(Doctor.class);
        doctor.setQualification("MBBS");
        System.out.println(doctor);
        Doctor doctor1 = context.getBean(Doctor.class);
        System.out.println(doctor1);

        // In Nurse class we have changed the scape to prototype
        Nurse nurse = context.getBean(Nurse.class);
        nurse.setQualification("Nursing");
        System.out.println(nurse);
        Nurse nurse1 = context.getBean(Nurse.class);
        System.out.println(nurse1);
    }
}
