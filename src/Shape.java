//Interface example

public abstract class Shape {
    protected String color;
    protected double height;  // To hold height.
    protected double width;  //To hold width
    protected double base;  //To  hold base

    public void setColor(String color) {
        this.color = color;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setBase(double base) {
        this.base = base;
    }
    public abstract double getArea();
    public String toString() {
        return "Shape[color=" + color + "]";
    }
    public void displayshapName()
    {
        System.out.println("I am a Shape.");
    }
}



