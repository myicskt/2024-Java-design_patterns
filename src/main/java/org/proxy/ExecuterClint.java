package org.proxy;

public class ExecuterClint {
    public static void main(String[] args) {

        CommandExecutor app = new ExecutorProxy();
       // app.execute("notepad.exe");
        //app.execute("ls -itr");
        //app.execute("rm -rf");
        app.execute("admin","s3cret","notepad.exe");




    }
}
