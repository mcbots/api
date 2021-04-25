package dev.comore.bot.api.task;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Task extends Remote {
    /**
     * Method invoked when task must be executed.
     * @throws RemoteException when the RMI connection isn't established.
     */
    void execute() throws RemoteException;
}
