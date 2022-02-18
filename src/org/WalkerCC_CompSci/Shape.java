package org.WalkerCC_CompSci;

public abstract class Shape {

    protected Point[] listOfPoints;

    public double GetSideLength(int sideLengthNumber){
        if(sideLengthNumber >= listOfPoints.length - 1){
            return CalculateSideLength(listOfPoints[listOfPoints.length - 1], listOfPoints[0]);
        }
        else if(sideLengthNumber < 0){
            return CalculateSideLength(listOfPoints[0], listOfPoints[1]);
        }
        else{
            return CalculateSideLength(listOfPoints[sideLengthNumber], listOfPoints[sideLengthNumber + 1]);
        }
    }

    private double CalculateSideLength(Point point0, Point point1){
       return Math.round(Math.sqrt(Math.pow((point1.getX() - point0.getX()), 2) + Math.pow((point1.getY() - point0.getY()), 2)));
    }

    public double GetPerimeter() {

        double sum = 0;

        for (int i = 0; i < listOfPoints.length; i++) {

            sum = sum + GetSideLength(i);

        }

        return sum;

    }

}
