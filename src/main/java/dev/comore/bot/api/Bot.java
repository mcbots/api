package dev.comore.bot.api;

import dev.comore.bot.api.scenario.Scenario;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Set;

public interface Bot extends Remote {
    /**
     * Connects the bot to a server.
     * @param hostname the server's hostname
     * @param port the server's port
     * @throws RemoteException when the RMI connection isn't established.
     */
    void connect(String hostname, int port) throws RemoteException;

    /**
     * Disconnects the bot from the server it is connected.
     * @throws RemoteException when the RMI connection isn't established.
     */
    void disconnect() throws RemoteException;

    /**
     * Returns if the bot is connected to a server.
     * @return <code>true</code> if the bot is connected to a server, returns <code>false</code> otherwise.
     * @throws RemoteException when the RMI connection isn't established.
     */
    boolean isConnected() throws RemoteException;

    /**
     * Returns the bot's name
     * @return the bot's name
     * @throws RemoteException when the RMI connection isn't established.
     */
    String getName() throws RemoteException;

    /**
     * Returns all the bot's scenarios.
     * @return all the bot's scenarios.
     * @throws RemoteException when the RMI connection isn't established.
     */
    Set<Scenario> getScenarios() throws RemoteException;
}
