package server;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class Server extends UnicastRemoteObject implements CalcInterface {

    protected Server() throws RemoteException {
        super();
    }

    public double add(double num1, double num2) throws RemoteException {
        return num1 + num2;
    }

    public double subtract(double num1, double num2) throws RemoteException {
        return num1 - num2;
    }

    public double multiply(double num1, double num2) throws RemoteException {
        return num1 * num2;
    }

    public double divide(double num1, double num2) throws RemoteException {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new RemoteException("Não é possível dividir por zero");
        }
    }

    public static void main(String[] args) {
        try {
            Server server = new Server();
            Naming.rebind("CalculatorService", server);
            System.out.println("Server is ready...");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
