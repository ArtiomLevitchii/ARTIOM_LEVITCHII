package org.example.homework_nr_9;

public class Programmer extends Employee implements CanDoTraining{
    private String programmingLanguage;

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public Programmer(String name, String surname, int age,String programmingLanguage) {
        super(name, surname, age);
        this.programmingLanguage=programmingLanguage;
    }

    @Override
    public boolean canDoTraining() {
        return true;
    }
}
