package org.example.homework_nr_9;

public class Main {
    public static void main(String[] args) {
        Programmer employee0 = new Programmer("Artem", "Levitchii", 31, "Java");
        Manager employee1 = new Manager("John", "Brzenk", 50, "Project manager");
        Programmer employee2 = new Programmer("Alex", "Ciobanu", 24, "PHP");

        System.out.println(employee0.canDoTraining());
        System.out.println(employee1.canDoTraining());
        System.out.println(employee2.canDoTraining());

        System.out.println(employee1.canDoInterview());

        CanDoTraining[] array = new CanDoTraining[]{
                employee0,
                employee1,
                employee2
        };
        System.out.println("-----------------------------------");
        MeetingRoom meetingRoom = new MeetingRoom(array);
        meetingRoom.checkForAttendTraining(array);

        Employee[] arrayOfEmployee = new Employee[]{
                employee0,
                employee1,
                employee2
        };

        for (int i = 0; i < arrayOfEmployee.length; i++) {
            if(arrayOfEmployee[i] instanceof Programmer){
                ((Programmer) arrayOfEmployee[i]).canDoTraining();
                System.out.println(arrayOfEmployee[i].getName()+" - is doing training");
            }else if(arrayOfEmployee[i] instanceof Manager){
                ((Manager) arrayOfEmployee[i]).canDoInterview();
                System.out.println(arrayOfEmployee[i].getName()+" - is doing interview");
            }
        }
    }
}
