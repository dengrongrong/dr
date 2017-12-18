package com.dr.m.entity;

import org.apache.ibatis.type.Alias;

@Alias("emp")
public class Employee {
    private int id;
    private String name;
    private String address;
    private String dept;

    public Employee() {
    }

    public Employee(int id, String name, String address, String dept) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.dept = dept;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }
}
