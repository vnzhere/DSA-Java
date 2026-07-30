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
equilateralTriangle(6);
// Area      = 15.588
// Perimeter = 18.0
// Height    = 5.196

equilateralTriangle(1);
// Area      = 0.433
// Perimeter = 3.0
// Height    = 0.866