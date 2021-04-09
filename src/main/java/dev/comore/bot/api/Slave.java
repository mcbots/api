package dev.comore.bot.api;

import dev.comore.bot.api.scenario.ScenarioBuilder;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Set;

public interface Slave extends Remote {
    /**
     * Returns the slave's id
     * @return the slave's id
     * @throws RemoteException when the RMI connection isn't established.
     */
    String getId() throws RemoteException;

    /**
     * Gets the bot list.
     * @return the bot list.
     * @throws RemoteException when the RMI connection isn't established.
     */
    Set<Bot> getBots() throws RemoteException;

    /**
     * Creates a bot
     * @param name the name of the bot.
     * @return the bot.
     * @throws RemoteException when the RMI connection isn't established.
     */
    Bot createBot(String name) throws RemoteException;

    /**
     * Removes a bot.
     * @param bot the said bot
     * @throws RemoteException when the RMI connection isn't established.
     */
    void removeBot(Bot bot) throws RemoteException;

    /**
     * Returns a {@code ScenarioBuilder} that allows to create scenarios.
     * @return a {@code ScenarioBuilder}
     * @throws RemoteException when the RMI connection isn't established.
     */
    ScenarioBuilder createScenario() throws RemoteException;
}
