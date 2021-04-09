package dev.comore.bot.api;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Set;

public interface Master extends Remote {
    /**
     * Adds a slave to the master.
     * @param slave the said slave.
     * @throws RemoteException when the RMI connection isn't established.
     */
    void addSlave(Slave slave) throws RemoteException;

    /**
     * Removes a slave from the master.
     * @param slave the said slave.
     * @throws RemoteException when the RMI connection isn't established.
     */
    void removeSlave(Slave slave) throws RemoteException;

    /**
     * Returns all the slaves of the master.
     * @return all the slaves of the master.
     * @throws RemoteException when the RMI connection isn't established.
     */
    Set<Slave> getSlaves() throws RemoteException;
}
