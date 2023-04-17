package org.example.homework_nr_7;

public class Circle extends TwoDimensionalShape{

    @Override
    Double areaOfFigure(Double radius) {
        return Math.PI*(radius*radius);
    }
}
