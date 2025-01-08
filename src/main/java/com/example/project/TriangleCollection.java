package com.example.project;

public class TriangleCollection {
  private Triangle[] collection;
  private Point[] vertices;
  // Constructor
  public TriangleCollection(int numTriangles, int startX, int startY) {
      collection = new Triangle[numTriangles];
      Point p1 = new Point(-startX, 0);
      Point p2 = new Point(0, startY);

      for (int i = 0; i < numTriangles; i++) {
          Point p3 = new Point(startX - i, 0);
          collection[i] = new Triangle(p1, p2, p3);
      }
  }

  // Calculate total perimeters in triangle collection
  public double totalPerimeter() {
      double total = 0;
      for (Triangle triangle : collection) {
          total += triangle.perimeter();
      }
      return total;
  }

  // Shifts all vertices of all Triangles in the collection by the given increment
  public void shiftTriangles(int increment) {
    for (Triangle triangle : collection) {
        vertices = triangle.getVertices();
        Point p3 = vertices[2];
        p3.setX(p3.getX() + increment);
        p3.setY(p3.getY() + increment);
    }
    Point p1 = vertices[0];
    Point p2 = vertices[1];
    p1.setX(p1.getX() + increment);
    p1.setY(p1.getY() + increment);
    p2.setX(p2.getX() + increment);
    p2.setY(p2.getY() + increment);

}



  // Returns String with each Triangle in collection on new line
  public String triangleCollectionInfo() {
    String output = "";
      for (Triangle triangle : collection) {
          output += triangle.triangleInfo()+ "\n";
      }
      return output;
  }
}