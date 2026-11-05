/**
 * Exercise 5
 */

public class Rectangle {

  private double width;
  private double height;

  /**
   * Createes a rectangle with specified width and height.
   * @param width
   * @param height
   */
  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }
  /**
   * Gives the area of the rectangle.
   * @return a double
   */
  public double area() {
    return width * height;
  }

  /**
   * scales the rectangle.
   *
   * @param factor
   */
  public void scale(double factor) {
    width *= factor;
    height *= factor;
  }

  /**
   * tells you if is larger than another rectangle.
   *
   * @param other rectangle
   * @return a boolean
   */
  public boolean isLargerThan(Rectangle other) {
    return area() > other.area();
  }
}
