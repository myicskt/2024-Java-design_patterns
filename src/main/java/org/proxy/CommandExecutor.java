package org.proxy;

public interface CommandExecutor {

    void execute(String cmd);
    void execute(String cmd, String user, String key);

}
