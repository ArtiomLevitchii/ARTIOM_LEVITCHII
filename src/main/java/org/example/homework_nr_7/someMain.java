package org.example.homework_nr_7;

public class someMain {
    public static void main(String[] args) {
        Person person = new Person("Artiom","cuza-voda");
        System.out.println(person);
        Staff staff = new Staff("Oleg","cuza-voda","72",14000);
        System.out.println(staff);
        Student student = new Student("Egor","pushkin","IT",1990,12345);
        System.out.println(student);

        //-----------------------------------------------------------------------------------

        Circle newCircle = new Circle();
        Square newSquare = new Square();
        Cube newCube = new Cube();
        Sphere newSphere = new Sphere();
        System.out.println("Circle area = "+newCircle.areaOfFigure(3.0));
        System.out.println("Square area = "+newSquare.areaOfFigure(3.0));
        System.out.println("Cube area = "+newCube.areaOfFigure(3.0));
        System.out.println("Cube volume = "+newCube.volumeOfFigure(3.0));
        System.out.println("Sphere area = "+newSphere.areaOfFigure(3.0));
        System.out.println("Sphere volume = "+newSphere.volumeOfFigure(3.0));
    }
}
