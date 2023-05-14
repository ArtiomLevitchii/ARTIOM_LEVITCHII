package org.example.homework_nr_12;

public class Employee implements Comparable<Employee> {
    private String name;
    private String surname;
    private Integer age;
    private Boolean isPayedByHour;
    private Boolean canConductInterview;

    public Employee(String name, String surname, Integer age, Boolean isPayedByHour, Boolean canConductInterview) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.isPayedByHour = isPayedByHour;
        this.canConductInterview = canConductInterview;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getPayedByHour() {
        return isPayedByHour;
    }

    public void setPayedByHour(Boolean payedByHour) {
        isPayedByHour = payedByHour;
    }

    public Boolean getCanConductInterview() {
        return canConductInterview;
    }

    public void setCanConductInterview(Boolean canConductInterview) {
        this.canConductInterview = canConductInterview;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", isPayedByHour=" + isPayedByHour +
                ", canConductInterview=" + canConductInterview +
                '}';
    }


    @Override
    public int compareTo(Employee employee) {
        return this.getName().compareTo(employee.getName());
    }
}
