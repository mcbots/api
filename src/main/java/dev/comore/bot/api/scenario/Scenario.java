package dev.comore.bot.api.scenario;

import dev.comore.bot.api.Bot;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Queue;

public interface Scenario extends Remote {
    /**
     * Returns all the steps.
     * @return all the steps.
     * @throws RemoteException when the RMI connection isn't established.
     */
    Queue<ScenarioStep> getSteps() throws RemoteException;

    /**
     * Adds the scenario to a bot.
     * @param bot the said bot.
     * @throws RemoteException when the RMI connection isn't established.
     */
    void add(Bot bot) throws RemoteException;

    /**
     * Executes the scenario.
     * @param bot the bot
     * @throws RemoteException
     */
    void execute(Bot bot) throws RemoteException;
}
