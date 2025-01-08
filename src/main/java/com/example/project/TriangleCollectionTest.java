package com.example.project;

public class TriangleCollectionTest {
    public static void main(String[] args) {
        
        // Create a TriangleCollection with 3 triangles
        TriangleCollection collection1 = new TriangleCollection(6,4,7);
        System.out.println(collection1.triangleCollectionInfo());
        collection1.shiftTriangles(5);
        System.out.println(collection1.triangleCollectionInfo());
    }
}
