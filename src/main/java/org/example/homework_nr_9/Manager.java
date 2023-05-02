package org.example.homework_nr_9;

public class Manager extends Employee implements CanDoInterview,CanDoTraining{

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Manager(String name, String surname, int age,String type) {
        super(name, surname, age);
        this.type=type;
    }

    @Override
    public boolean canDoInterview() {
        return true;
    }

    @Override
    public boolean canDoTraining() {
        return true;
    }
}
