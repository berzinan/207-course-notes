/**
 * A rectangle.
 */
public class Rectangle {
  private double width;
  private double height;

  /**
   * Constructor.
   *
   * @param w width of the rectangle
   * @param h length of the rectangle
   */
  public Rectangle(double w, double h) {
    this.width = w;
    this.height = h;
  }

  /**
   * Calculates the area of the rectangle.
   *
   * @return area of this rectangle
   */
  public double area() {
    return width * height;
  }

  /**
   * scales the rectangle.
   *
   * @param factor scale factor to be stretched by.
   */
  public void scale(double factor) {
    width = width * factor;
    height = height * factor;
  }

  /**
   * Returns whether this rectangle has a larger area than other.
   *
   * @param other rectangle being compared to.
   * @return this.area() > other.area()
   */
  public boolean isLargerThan(Rectangle other) {
    if (area() > other.area()) {
      return true;
    } else {
      return false;
    }
  }
}
