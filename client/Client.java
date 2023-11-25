package client;


import java.rmi.Naming;

public class Client {
    public static void main(String[] args) {
        try {
            CalcInterface calc = (CalcInterface) Naming.lookup("rmi://localhost/CalculatorService");

            double num1 = 10;
            double num2 = 5;

            System.out.println("Addition: " + calc.add(num1, num2));
            System.out.println("Subtraction: " + calc.subtract(num1, num2));
            System.out.println("Multiplication: " + calc.multiply(num1, num2));
            System.out.println("Division: " + calc.divide(num1, num2));
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }

}
