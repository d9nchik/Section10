package exercise15;

import exercise13.MyRectangle2D;
import exercise4.MyPoint;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] dots = new double[5][2];
        System.out.print("Enter five points: ");
        for (int i = 0; i < dots.length; i++) {
            dots[i][0] = input.nextDouble();
            dots[i][1] = input.nextDouble();
        }
        MyRectangle2D my = getRectangle(dots);

        System.out.println("The bounding rectangle's center (" + my.getX() + ", " + my.getY() +
                "), width " + my.getWidth() + ", height " + my.getHeight());
    }

    public static MyRectangle2D getRectangle(double[][] points) {
        double maximumX = points[0][0];
        double minimumX = points[0][0];
        double maximumY = points[0][1];
        double minimumY = points[0][1];
        for (int i = 1; i < points.length; i++) {
            if (maximumX < points[i][0])
                maximumX = points[i][0];
            else if (minimumX > points[i][0])
                minimumX = points[i][0];
            if (maximumY < points[i][1])
                maximumY = points[i][1];
            else if (minimumY > points[i][1])
                maximumY = points[i][1];
        }
        return new MyRectangle2D((maximumX + minimumX) / 2, (maximumY + minimumY) / 2, Math.abs(maximumX - minimumX), Math.abs(maximumY - minimumY));
    }
}
