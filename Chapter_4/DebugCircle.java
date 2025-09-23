public class DebugCircle {
    private int radius;
    private int diameter;
    private final double PI = 3.14159;
    private double area;

    public DebugCircle(int r) {
        radius = r;
        diameter = 2 * r;
        area = PI * r * r;
    }

    // Removed the semicolon after method header
    // Fixed typo 'radiuss' → 'radius'
    public int getRadius() {
        return radius; 
    }

    // Changed return type from void → int
    // Now properly returns the diameter
    public int getDiameter() {
        return diameter; 
    }

    // This one was already correct
    public double getArea() {
        return area; 
    }
}