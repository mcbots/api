package dev.comore.bot.api.scenario;

import dev.comore.bot.api.Bot;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ScenarioStep extends Remote {
    /**
     * Execute action of the step
     * @param bot the bot that does the action
     * @throws RemoteException when the RMI connection isn't established.
     */
    void action(Bot bot) throws RemoteException;
}
