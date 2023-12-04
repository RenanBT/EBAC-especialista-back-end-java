package Calculadora;

public class Calculadora {

    /**
     * Adds two numbers and returns the result.
     *
     * @param a The first operand.
     * @param b The second operand.
     * @return The sum of a and b.
     */
    public int sum(int a, int b) {
        return a+b;
    }

    /**
     * subatracts int b from int a and returns the result.
     *
     * @param a The first operand.
     * @param b The second operand.
     * @return The subtraction of a and b.
     */
    public int sub(int a, int b) {
        return a-b;
    }

    /**
     * Multiply two numbers and returns the result.
     *
     * @param a The first operand.
     * @param b The second operand.
     * @return The multiplication of a and b.
     */
    public int multi(int a, int b) {
        return a*b;
    }


    /**
     * Divides the first number by the second number and returns the result.
     *
     * @param a The first operand.
     * @param b The second operand.
     * @return a devided by b.
     */
    public int div(int a, int b) {

        if(a == 0 || b == 0){
            throw new ArithmeticException("Cannot divide zero or by zero");
        }
        else {
            return a/b;
        }

}
}
