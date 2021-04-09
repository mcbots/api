package dev.comore.bot.api.scenario;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ScenarioBuilder extends Remote {
    /**
     * Adds a message action into the scenario.
     * @param message the message sent
     * @return the scenario builder
     * @throws RemoteException when the RMI connection isn't established.
     */
    ScenarioBuilder message(String message) throws RemoteException;

    /**
     * Builds the scenario
     * @return the said scenario
     * @throws RemoteException when the RMI connection isn't established.
     */
    Scenario build() throws RemoteException;
}
