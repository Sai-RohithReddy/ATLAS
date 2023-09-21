package com.rohith.javabasedconfig;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
public class Nurse implements Staff, BeanNameAware {

    @Override
    public String toString() {
        return "Nurse{" +
                "qualification='" + qualification + '\'' +
                '}';
    }

    private String qualification;

    public void assist() {
        System.out.println("Nurse is assisting");
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Set Bean Name method is called");
    }

}
