package org.example.homework_nr_3;

public class Circle {

    double radius;

    Circle(double radius){
        this.radius = radius;
    }

    void calculateArea(){
        double areaOfCircle = Math.PI*(radius*radius);
        System.out.println("Площадь круга : " + areaOfCircle);
    }


    public static void main(String[] args) {

        Circle circle = new Circle(5);
        circle.calculateArea();
    }
}
