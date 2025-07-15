import java.awt.Color;

/**
 * Represents a circle with radius, color and area.
 * This is part of ProblemSolve19-ITSC1213
 *
 * @author Harrison 
 * @version 1.1
 */

public class Circle {  
    /**The Radius of the circle*/
    private double radius;
    /**The color of the circle */
    private Color color;
    /**The computed area of the circle */
    private double area;

    /**
    *  The default constructor with no argument.
    *  It sets the radius and color to their default value.
    */
    public Circle() {
        radius = 1.0;
        this.color = new Color(255,119,65);
    }
    
    /**2nd constructor with given radius and color
    * @param r    The radius of the circle
    * @param clr   The color of the circle
    */
    public Circle(double r, Color clr) {
        radius = r;
        color = clr;
    }
    
    /**A public method for retrieving the radius
    * 
    * @return radius of the circle
    */

    public double getRadius() {
        return radius;
    }

    /**  A public method for retrieving the color of circle
    * 
    * @return the color of the circle
    */
    public Color getColor() {
        return color;
    }

    /**A public method for retrieving the area of circle
    * 
    * @return the area of the circle
    */
    public double getArea() {
        calculateArea();
        return area;
    }
    
    /**  
    * Computes the area of the circle using formula Pi*R**2
    * The method has no return signature 
    */
    private void calculateArea() {
        area = radius * radius * Math.PI;
    }
}
