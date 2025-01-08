package com.example.project;

public class Triangle {
  private Point[] vertices;
  
  // Constructor
  public Triangle(Point p1, Point p2, Point p3) {
      vertices = new Point[]{p1, p2, p3};
  }

  // Perimeter
  public double perimeter() {
      return vertices[0].distanceTo(vertices[1]) +
             vertices[1].distanceTo(vertices[2]) +
             vertices[2].distanceTo(vertices[0]);
  }

  // Returns String with three vertices that make up the Triangle
  public String triangleInfo() {
      return "[" + vertices[0].pointInfo() + ", " +
                  vertices[1].pointInfo() + ", " +
                  vertices[2].pointInfo() + "]";
  }

  public Point[] getVertices() {
      return vertices;
  }
}
  