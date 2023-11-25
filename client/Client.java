package client;


import common.CalcInterface;

import java.rmi.Naming;

public class Client {
    public static void main(String[] args) {
        try {

            CalcInterface calc = (CalcInterface) Naming.lookup("rmi://localhost/CalculatorService");

            double a = 10;
            double b = 5;

            System.out.println("Soma: " + calc.add(a, b));
            System.out.println("Subtracaoo: " + calc.subtract(a, b));
            System.out.println("Multiplicacao: " + calc.multiply(a, b));
            System.out.println("Divisao: " + calc.divide(a, b));
            System.out.println("Erro de divisao por zero: " + calc.divide(a, 0));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
