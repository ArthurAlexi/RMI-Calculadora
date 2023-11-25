package server;

import common.CalcInterface;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Server {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(9044);


            CalcInterface calc = new CalcImplementation();
            Naming.rebind("rmi://localhost/CalculatorService", calc);

            System.out.println("Servidor RMI pronto...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

