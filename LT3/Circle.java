/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lt2;

/**
 *
 * @author Administrator
 */
public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double Area(){
        return radius * radius * Math.PI;
    }
    
    public double Perimeter(){
        return 2 * radius * Math.PI;
    }


    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + '}';
    }
        
}
