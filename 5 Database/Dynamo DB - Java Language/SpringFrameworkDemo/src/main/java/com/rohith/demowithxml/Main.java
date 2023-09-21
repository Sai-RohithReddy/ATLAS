package com.rohith.demowithxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Staff doctor = context.getBean(Doctor.class);
        doctor.assist();


        Staff nurse = (Nurse) context.getBean("nurse");
        nurse.assist();

        Doctor doctor1 = context.getBean(Doctor.class);
        System.out.println(doctor1.getQualification());

        Nurse nurse1 = context.getBean(Nurse.class);
        System.out.println(nurse1.getQualification());
    }
}
