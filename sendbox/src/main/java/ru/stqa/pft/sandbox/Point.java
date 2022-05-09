package ru.stqa.pft.sandbox;

import java.text.DecimalFormat;

public class Point {

  public static void main(String[] args) {
    Point p1 = new Point(-3.7, 1);
    Point p2 = new Point(5.6, 10);
    System.out.println("Расстояние между двумя точками: " + p1.x + ";" + p1.y + " и " + p2.x + ";" + p2.y + " равно " + p1.distance(p2));
  }

  public double x;
  public double y;

  public Point(double x1, double y1) {
    this.x = x1;
    this.y = y1;
  }

  public double distance(Point p2){
    return Math.sqrt((p2.x - this.x)*(p2.x - this.x) + (p2.y - this.y)*(p2.y - this.y));
  }
}
