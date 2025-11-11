package com.example.demo.Model;

import java.util.Objects;

public class Faculty {
    private String name;
    private String role;
    private int salary;

    public Faculty() {
    }

    public Faculty(String name, String role, int salary) {
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Faculty faculty = (Faculty) o;
        return salary == faculty.salary && Objects.equals(name, faculty.name) && Objects.equals(role, faculty.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, role, salary);
    }
}
