public class App {
    public App() {
    }

    /**
     * modifying methods to computeSum()
     */
    private static int computeSum(int num1, int num2) {
        return num1 + num2;
    }

    private static int computeSum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
    /**
     * method to return greater int value
     */
    public static int greaterValue(int Num1, int Num2) {

        if (Num1 > Num2) {
            return Num1;
        } else {
            return Num2;
        }
    }
    /**
     * method to return greater double value
     */
    public static double greaterValue(double Num1, double Num2) {

        if (Num1 > Num2) {
            return Num1;
        } else {
            return Num2;
        }
    }

    
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        /**
         * using overloading
         */

        System.out.println("Sum of two numbers 100 and 200: " + computeSum(100, 200));
        System.out.println("Sum of three numbers 100, 200 , 300: " + computeSum(100, 200, 300));
        /**
         * Call the greaterValue method with integer parameters
         */
        System.out.println("The greater value between 12 and 24 is " + greaterValue(12,24));

        /**
         * Call the greaterValue method with double parameters
         */
        System.out.println("The greater value between 2.1 and 8.6 is " + greaterValue(2.1,8.6));

    }
}