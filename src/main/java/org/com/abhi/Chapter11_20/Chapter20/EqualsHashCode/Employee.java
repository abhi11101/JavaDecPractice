package org.com.abhi.Chapter11_20.Chapter20.EqualsHashCode;

import java.util.Objects;

public class Employee {

    private int employeeId;
    private String name;

    public Employee(int employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    @Override
    public int hashCode() {
        // Assume a simple hash code based only on the employeeId
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return employeeId == employee.employeeId;
    }
}
