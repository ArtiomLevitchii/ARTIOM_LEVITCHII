package org.example.homework_nr_7;

public class Cube extends ThreeDimensionalShape{
    @Override
    Double areaOfFigure(Double side) {
        return side*side;
    }

    @Override
    Double volumeOfFigure(Double side) {
        return side*side*side;
    }
}
