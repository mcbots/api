package dev.comore.bot.api.task.execution;

import dev.comore.bot.api.Bot;
import dev.comore.bot.api.task.Task;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Queue;

public interface TaskExecutor extends Remote {
    /**
     * Executes a task.
     * @param task the said task.
     * @param bot the bot executing the task.
     * @throws RemoteException when the RMI connection isn't established.
     */
    void executeTask(Task task, Bot bot) throws RemoteException;

    /**
     * Returns all the queued tasks.
     * @return all the queued tasks.
     */
    Queue<Task> getQueuedTasks();
}
