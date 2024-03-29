package org.proxy;

import java.io.IOException;

public class Executor implements CommandExecutor{


    @Override
    public void execute(String cmd) {
        try {
            Runtime.getRuntime().exec(cmd);
        } catch (IOException e) {
            System.out.println("Exception while executiongthis commant");
           e.printStackTrace();
        }
    }

    @Override
    public void execute(String cmd, String user, String key) {

    }


}
