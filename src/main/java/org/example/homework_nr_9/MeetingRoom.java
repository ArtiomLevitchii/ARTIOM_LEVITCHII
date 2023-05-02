package org.example.homework_nr_9;

public class MeetingRoom {

    public CanDoTraining[] array;

    public MeetingRoom(CanDoTraining[] array) {
        this.array = array;
    }
    public void checkForAttendTraining(CanDoTraining[] array){
        for (CanDoTraining element :
                array) {
            System.out.println(element.canDoTraining());
        }
    }

}
