package org.example.homework_nr_7;

public class Sphere extends ThreeDimensionalShape{
    @Override
    Double areaOfFigure(Double radius) {
        return (Math.pow(radius,2)*4*Math.PI);
    }

    @Override
    Double volumeOfFigure(Double radius) {
        return ((4*Math.pow(radius,3)*Math.PI)/3);
    }
}
