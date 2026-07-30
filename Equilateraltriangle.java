// ==========================================
// EQUILATERAL TRIANGLE
// ==========================================
static void equilateralTriangle(double a) {

    double area      = (Math.sqrt(3) / 4) * a * a;
    double perimeter = 3 * a;
    double height    = (Math.sqrt(3) / 2) * a;

    System.out.println("Side      : " + a);
    System.out.println("Area      : " + area);
    System.out.println("Perimeter : " + perimeter);
    System.out.println("Height    : " + height);
}
