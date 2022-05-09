package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

  @Test
  public void testDistanse1() {
    Point p = new Point(2,0);
    Point p2 = new Point(2, 4);
    Assert.assertEquals(p.distance(p2), 4.0);
  }


  @Test
  public void testDistanse2() {
    Point p = new Point(-3.7,1);
    Point p2 = new Point(5.6, 10);
    Assert.assertEquals(p.distance(p2), 12.941792766073794);
  }
}
