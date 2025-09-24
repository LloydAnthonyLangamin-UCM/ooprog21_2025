public class DebugPen {
    private String color;
    private String point;

    public DebugPen() {
        color = "black";
        point = "fine";
    }

    public DebugPen(String color, String point) {
        // Before: color = color;
        // After: this.color = color;
        this.color = color;  // Fixed to assign parameter to instance variable

        // Before: point = point;
        // After: this.point = point;
        this.point = point;  // Fixed to assign parameter to instance variable
    }

    public String getColor() {
        return color;
    }

    public String getPoint() {
        return point;
    }
}