public class MathOperations {
    static {
        System.load("/libmathoperations.so"); 
    }

    public native double add(double a, double b);
    public native double subtract(double a, double b);
    public native double multiply(double a, double b);
    public native double divide(double a, double b);

    public static void main(String[] args) {
        MathOperations math = new MathOperations();

        double resultAdd = math.add(5.0, 3.0);
        double resultSubtract = math.subtract(5.0, 3.0);
        double resultMultiply = math.multiply(5.0, 3.0);
        double resultDivide = math.divide(5.0, 3.0);

        System.out.println("Addition: " + resultAdd);
        System.out.println("Subtraction: " + resultSubtract);
        System.out.println("Multiplication: " + resultMultiply);
        System.out.println("Division: " + resultDivide);
    }
}
