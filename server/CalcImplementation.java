package server;

import common.CalcInterface;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalcImplementation extends UnicastRemoteObject implements CalcInterface {
    protected CalcImplementation() throws RemoteException {
        super();
    }

    @Override
    public double add(double a, double b) throws RemoteException {
        return a + b;
    }

    @Override
    public double subtract(double a, double b) throws RemoteException {
        return a - b;
    }

    @Override
    public double multiply(double a, double b) throws RemoteException {
        return a * b;
    }

    @Override
    public double divide(double a, double b) throws RemoteException {
        if (b != 0) {
            return a / b;
        } else {
            throw new RemoteException("Cannot divide by zero");
        }
    }
}

