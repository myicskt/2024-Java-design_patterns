package org.composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {


    private  String name;
    private String deptDesignation;
    private double salary;
    private List<Employee> subrdinates;

    public Employee( String n, String dep, double sal) {

        this.name =n;
        this.deptDesignation=dep;
        this.salary=sal;
        subrdinates=new ArrayList<>();
    }

    public void add(Employee e){
        subrdinates.add(e);
    }

    public boolean remove(Employee e){
        boolean emp =subrdinates.remove(e);

        return emp;
    }

    public List<Employee> getReporte(){
        return subrdinates;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", deptDesignation='" + deptDesignation + '\'' +
                ", salary=" + salary +
                ", subrdinates=" + subrdinates +
                '}';
    }
}
